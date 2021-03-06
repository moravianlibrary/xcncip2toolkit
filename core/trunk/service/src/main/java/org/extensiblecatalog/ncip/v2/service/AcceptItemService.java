/**
 * Copyright (c) 2010 eXtensible Catalog Organization
 *
 * This program is free software; you can redistribute it and/or modify it
 * under the terms of the MIT/X11 license. The text of the license can be
 * found at http://www.opensource.org/licenses/mit-license.php. 
 */

package org.extensiblecatalog.ncip.v2.service;

public interface AcceptItemService extends NCIPService<AcceptItemInitiationData, AcceptItemResponseData> {

    @Override
    AcceptItemResponseData performService(AcceptItemInitiationData initData,
                                          ServiceContext serviceContext,
                                          RemoteServiceManager serviceManager)
            throws ServiceException;

}
