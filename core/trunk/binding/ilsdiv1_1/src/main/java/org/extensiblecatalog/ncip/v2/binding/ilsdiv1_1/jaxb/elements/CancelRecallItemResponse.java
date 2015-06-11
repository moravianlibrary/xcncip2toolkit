//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.5-b10 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.06.11 at 02:59:27 PM CEST 
//


package org.extensiblecatalog.ncip.v2.binding.ilsdiv1_1.jaxb.elements;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.niso.org/2008/ncip}ResponseHeader" minOccurs="0"/>
 *         &lt;choice>
 *           &lt;element ref="{http://www.niso.org/2008/ncip}Problem" maxOccurs="unbounded"/>
 *           &lt;sequence>
 *             &lt;element ref="{http://www.niso.org/2008/ncip}ItemId"/>
 *             &lt;element ref="{http://www.niso.org/2008/ncip}UserId" minOccurs="0"/>
 *             &lt;element ref="{http://www.niso.org/2008/ncip}FiscalTransactionInformation" minOccurs="0"/>
 *             &lt;element ref="{http://www.niso.org/2008/ncip}ItemOptionalFields" minOccurs="0"/>
 *             &lt;element ref="{http://www.niso.org/2008/ncip}UserOptionalFields" minOccurs="0"/>
 *           &lt;/sequence>
 *         &lt;/choice>
 *         &lt;element ref="{http://www.niso.org/2008/ncip}Ext" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "responseHeader",
    "problem",
    "itemId",
    "userId",
    "fiscalTransactionInformation",
    "itemOptionalFields",
    "userOptionalFields",
    "ext"
})
@XmlRootElement(name = "CancelRecallItemResponse")
public class CancelRecallItemResponse {

    @XmlElement(name = "ResponseHeader")
    protected ResponseHeader responseHeader;
    @XmlElement(name = "Problem")
    protected List<Problem> problem;
    @XmlElement(name = "ItemId")
    protected ItemId itemId;
    @XmlElement(name = "UserId")
    protected UserId userId;
    @XmlElement(name = "FiscalTransactionInformation")
    protected FiscalTransactionInformation fiscalTransactionInformation;
    @XmlElement(name = "ItemOptionalFields")
    protected ItemOptionalFields itemOptionalFields;
    @XmlElement(name = "UserOptionalFields")
    protected UserOptionalFields userOptionalFields;
    @XmlElement(name = "Ext")
    protected Ext ext;

    /**
     * Gets the value of the responseHeader property.
     * 
     * @return
     *     possible object is
     *     {@link ResponseHeader }
     *     
     */
    public ResponseHeader getResponseHeader() {
        return responseHeader;
    }

    /**
     * Sets the value of the responseHeader property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResponseHeader }
     *     
     */
    public void setResponseHeader(ResponseHeader value) {
        this.responseHeader = value;
    }

    /**
     * Gets the value of the problem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the problem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProblem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Problem }
     * 
     * 
     */
    public List<Problem> getProblem() {
        if (problem == null) {
            problem = new ArrayList<Problem>();
        }
        return this.problem;
    }

    /**
     * Gets the value of the itemId property.
     * 
     * @return
     *     possible object is
     *     {@link ItemId }
     *     
     */
    public ItemId getItemId() {
        return itemId;
    }

    /**
     * Sets the value of the itemId property.
     * 
     * @param value
     *     allowed object is
     *     {@link ItemId }
     *     
     */
    public void setItemId(ItemId value) {
        this.itemId = value;
    }

    /**
     * Gets the value of the userId property.
     * 
     * @return
     *     possible object is
     *     {@link UserId }
     *     
     */
    public UserId getUserId() {
        return userId;
    }

    /**
     * Sets the value of the userId property.
     * 
     * @param value
     *     allowed object is
     *     {@link UserId }
     *     
     */
    public void setUserId(UserId value) {
        this.userId = value;
    }

    /**
     * Gets the value of the fiscalTransactionInformation property.
     * 
     * @return
     *     possible object is
     *     {@link FiscalTransactionInformation }
     *     
     */
    public FiscalTransactionInformation getFiscalTransactionInformation() {
        return fiscalTransactionInformation;
    }

    /**
     * Sets the value of the fiscalTransactionInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link FiscalTransactionInformation }
     *     
     */
    public void setFiscalTransactionInformation(FiscalTransactionInformation value) {
        this.fiscalTransactionInformation = value;
    }

    /**
     * Gets the value of the itemOptionalFields property.
     * 
     * @return
     *     possible object is
     *     {@link ItemOptionalFields }
     *     
     */
    public ItemOptionalFields getItemOptionalFields() {
        return itemOptionalFields;
    }

    /**
     * Sets the value of the itemOptionalFields property.
     * 
     * @param value
     *     allowed object is
     *     {@link ItemOptionalFields }
     *     
     */
    public void setItemOptionalFields(ItemOptionalFields value) {
        this.itemOptionalFields = value;
    }

    /**
     * Gets the value of the userOptionalFields property.
     * 
     * @return
     *     possible object is
     *     {@link UserOptionalFields }
     *     
     */
    public UserOptionalFields getUserOptionalFields() {
        return userOptionalFields;
    }

    /**
     * Sets the value of the userOptionalFields property.
     * 
     * @param value
     *     allowed object is
     *     {@link UserOptionalFields }
     *     
     */
    public void setUserOptionalFields(UserOptionalFields value) {
        this.userOptionalFields = value;
    }

    /**
     * Gets the value of the ext property.
     * 
     * @return
     *     possible object is
     *     {@link Ext }
     *     
     */
    public Ext getExt() {
        return ext;
    }

    /**
     * Sets the value of the ext property.
     * 
     * @param value
     *     allowed object is
     *     {@link Ext }
     *     
     */
    public void setExt(Ext value) {
        this.ext = value;
    }

}
