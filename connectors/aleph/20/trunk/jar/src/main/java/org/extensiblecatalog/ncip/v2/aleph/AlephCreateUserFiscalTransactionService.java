package org.extensiblecatalog.ncip.v2.aleph;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.extensiblecatalog.ncip.v2.aleph.util.AlephRemoteServiceManager;
import org.extensiblecatalog.ncip.v2.service.*;

public class AlephCreateUserFiscalTransactionService implements NCIPService<CreateUserFiscalTransactionInitiationData, CreateUserFiscalTransactionResponseData> {

	@Override
	public CreateUserFiscalTransactionResponseData performService(CreateUserFiscalTransactionInitiationData initData, ServiceContext serviceContext,
			RemoteServiceManager serviceManager) throws ServiceException, ValidationException {
		CreateUserFiscalTransactionResponseData responseData = new CreateUserFiscalTransactionResponseData();
		AlephRemoteServiceManager alephRemoteServiceManager = (AlephRemoteServiceManager) serviceManager;

		InitiationHeader initiationHeader = initData.getInitiationHeader();
		if (initiationHeader != null) {
			ResponseHeader responseHeader = new ResponseHeader();
			if (initiationHeader.getFromAgencyId() != null && initiationHeader.getToAgencyId() != null) {
				responseHeader.setFromAgencyId(initiationHeader.getFromAgencyId());
				responseHeader.setToAgencyId(initiationHeader.getToAgencyId());
			}
			if (initiationHeader.getFromSystemId() != null && initiationHeader.getToSystemId() != null) {
				responseHeader.setFromSystemId(initiationHeader.getFromSystemId());
				responseHeader.setToSystemId(initiationHeader.getToSystemId());
				if (initiationHeader.getFromAgencyAuthentication() != null && !initiationHeader.getFromAgencyAuthentication().isEmpty())
					responseHeader.setFromSystemAuthentication(initiationHeader.getFromAgencyAuthentication());
			}
			responseData.setResponseHeader(responseHeader);
		}

		String patronId = null;
		String password = null;

		if (initData.getUserId() != null)
			patronId = initData.getUserId().getUserIdentifierValue();
		else {
			for (AuthenticationInput authInput : initData.getAuthenticationInputs()) {
				if (authInput.getAuthenticationInputType().getValue().equals(Version1AuthenticationInputType.USER_ID.getValue())) {
					patronId = authInput.getAuthenticationInputData();
				} else if (authInput.getAuthenticationInputType().getValue().equals(Version1AuthenticationInputType.PASSWORD.getValue())) {
					password = authInput.getAuthenticationInputData();
				}
			}
		}

		if (patronId == null) {
			throw new ServiceException(ServiceError.UNSUPPORTED_REQUEST, "User Id is undefined.");
		}

		if (initData.getAuthenticationInputs().size() > 0 && password == null) {
			throw new ServiceException(ServiceError.UNSUPPORTED_REQUEST, "Password is undefined.");
		}
		
		responseData.setUserId(initData.getUserId());

		FiscalActionType fiscalActionType = initData.getFiscalTransactionInformation().getFiscalActionType();
		FiscalTransactionType fiscalTransactionType = initData.getFiscalTransactionInformation().getFiscalTransactionType();
		Amount amount = initData.getFiscalTransactionInformation().getAmount();

		// TODO: Implement storing this information into database.
		// This service basically says user has paid mentioned amount.
		// For now we will just send a message back we understood the payment was a success.

		FiscalTransactionReferenceId fiscalTransactionReferenceId = new FiscalTransactionReferenceId();

		AgencyId agencyId = new AgencyId(alephRemoteServiceManager.getDefaultAgencyId());
		fiscalTransactionReferenceId.setAgencyId(agencyId);

		String uniquePaymentIdentifier = createUniquePaymentIdentifier(initData, patronId);

		fiscalTransactionReferenceId.setFiscalTransactionIdentifierValue(uniquePaymentIdentifier);

		responseData.setFiscalTransactionReferenceId(fiscalTransactionReferenceId);

		return responseData;
	}

	/**
	 * 
	 * Creates unique payment identifier based on current time, patronId & requestId if available.
	 * <p>
	 * Returned value should be something like:
	 * <p>
	 * 1412521144340-005033321-700<br>
	 * <br>
	 * 
	 * Else if there is no requestId, value should be like this:
	 * <p>
	 * 1412521144340-700
	 * 
	 * @return uniquePaymentIdentifier
	 */
	private String createUniquePaymentIdentifier(CreateUserFiscalTransactionInitiationData initData, String patronId) {
		long milisecs = new Date().getTime();

		String uniquePaymentIdentifier = String.valueOf(milisecs);

		// If requestId is not null, include it
		if (initData.getFiscalTransactionInformation().getRequestId() != null)
			if (initData.getFiscalTransactionInformation().getRequestId().getRequestIdentifierValue() != null)
				uniquePaymentIdentifier += "-" + initData.getFiscalTransactionInformation().getRequestId().getRequestIdentifierValue();

		uniquePaymentIdentifier += "-" + patronId;
		return uniquePaymentIdentifier;
	}

}