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
 *         &lt;element ref="{http://www.niso.org/2008/ncip}InitiationHeader" minOccurs="0"/>
 *         &lt;element ref="{http://www.niso.org/2008/ncip}MandatedAction" minOccurs="0"/>
 *         &lt;element ref="{http://www.niso.org/2008/ncip}ItemId"/>
 *         &lt;choice>
 *           &lt;element ref="{http://www.niso.org/2008/ncip}UserId"/>
 *           &lt;element ref="{http://www.niso.org/2008/ncip}AuthenticationInput" maxOccurs="unbounded"/>
 *         &lt;/choice>
 *         &lt;choice>
 *           &lt;element ref="{http://www.niso.org/2008/ncip}ItemReportedReturned"/>
 *           &lt;element ref="{http://www.niso.org/2008/ncip}ItemReportedNeverBorrowed"/>
 *           &lt;element ref="{http://www.niso.org/2008/ncip}ItemReportedLost"/>
 *           &lt;element ref="{http://www.niso.org/2008/ncip}ItemReportedMissing"/>
 *         &lt;/choice>
 *         &lt;element ref="{http://www.niso.org/2008/ncip}ItemElementType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.niso.org/2008/ncip}UserElementType" maxOccurs="unbounded" minOccurs="0"/>
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
    "initiationHeader",
    "mandatedAction",
    "itemId",
    "userId",
    "authenticationInput",
    "itemReportedReturned",
    "itemReportedNeverBorrowed",
    "itemReportedLost",
    "itemReportedMissing",
    "itemElementType",
    "userElementType",
    "ext"
})
@XmlRootElement(name = "ReportCirculationStatusChange")
public class ReportCirculationStatusChange {

    @XmlElement(name = "InitiationHeader")
    protected InitiationHeader initiationHeader;
    @XmlElement(name = "MandatedAction")
    protected MandatedAction mandatedAction;
    @XmlElement(name = "ItemId", required = true)
    protected ItemId itemId;
    @XmlElement(name = "UserId")
    protected UserId userId;
    @XmlElement(name = "AuthenticationInput")
    protected List<AuthenticationInput> authenticationInput;
    @XmlElement(name = "ItemReportedReturned")
    protected ItemReportedReturned itemReportedReturned;
    @XmlElement(name = "ItemReportedNeverBorrowed")
    protected ItemReportedNeverBorrowed itemReportedNeverBorrowed;
    @XmlElement(name = "ItemReportedLost")
    protected ItemReportedLost itemReportedLost;
    @XmlElement(name = "ItemReportedMissing")
    protected ItemReportedMissing itemReportedMissing;
    @XmlElement(name = "ItemElementType")
    protected List<SchemeValuePair> itemElementType;
    @XmlElement(name = "UserElementType")
    protected List<SchemeValuePair> userElementType;
    @XmlElement(name = "Ext")
    protected Ext ext;

    /**
     * Gets the value of the initiationHeader property.
     * 
     * @return
     *     possible object is
     *     {@link InitiationHeader }
     *     
     */
    public InitiationHeader getInitiationHeader() {
        return initiationHeader;
    }

    /**
     * Sets the value of the initiationHeader property.
     * 
     * @param value
     *     allowed object is
     *     {@link InitiationHeader }
     *     
     */
    public void setInitiationHeader(InitiationHeader value) {
        this.initiationHeader = value;
    }

    /**
     * Gets the value of the mandatedAction property.
     * 
     * @return
     *     possible object is
     *     {@link MandatedAction }
     *     
     */
    public MandatedAction getMandatedAction() {
        return mandatedAction;
    }

    /**
     * Sets the value of the mandatedAction property.
     * 
     * @param value
     *     allowed object is
     *     {@link MandatedAction }
     *     
     */
    public void setMandatedAction(MandatedAction value) {
        this.mandatedAction = value;
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
     * Gets the value of the authenticationInput property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the authenticationInput property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAuthenticationInput().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AuthenticationInput }
     * 
     * 
     */
    public List<AuthenticationInput> getAuthenticationInput() {
        if (authenticationInput == null) {
            authenticationInput = new ArrayList<AuthenticationInput>();
        }
        return this.authenticationInput;
    }

    /**
     * Gets the value of the itemReportedReturned property.
     * 
     * @return
     *     possible object is
     *     {@link ItemReportedReturned }
     *     
     */
    public ItemReportedReturned getItemReportedReturned() {
        return itemReportedReturned;
    }

    /**
     * Sets the value of the itemReportedReturned property.
     * 
     * @param value
     *     allowed object is
     *     {@link ItemReportedReturned }
     *     
     */
    public void setItemReportedReturned(ItemReportedReturned value) {
        this.itemReportedReturned = value;
    }

    /**
     * Gets the value of the itemReportedNeverBorrowed property.
     * 
     * @return
     *     possible object is
     *     {@link ItemReportedNeverBorrowed }
     *     
     */
    public ItemReportedNeverBorrowed getItemReportedNeverBorrowed() {
        return itemReportedNeverBorrowed;
    }

    /**
     * Sets the value of the itemReportedNeverBorrowed property.
     * 
     * @param value
     *     allowed object is
     *     {@link ItemReportedNeverBorrowed }
     *     
     */
    public void setItemReportedNeverBorrowed(ItemReportedNeverBorrowed value) {
        this.itemReportedNeverBorrowed = value;
    }

    /**
     * Gets the value of the itemReportedLost property.
     * 
     * @return
     *     possible object is
     *     {@link ItemReportedLost }
     *     
     */
    public ItemReportedLost getItemReportedLost() {
        return itemReportedLost;
    }

    /**
     * Sets the value of the itemReportedLost property.
     * 
     * @param value
     *     allowed object is
     *     {@link ItemReportedLost }
     *     
     */
    public void setItemReportedLost(ItemReportedLost value) {
        this.itemReportedLost = value;
    }

    /**
     * Gets the value of the itemReportedMissing property.
     * 
     * @return
     *     possible object is
     *     {@link ItemReportedMissing }
     *     
     */
    public ItemReportedMissing getItemReportedMissing() {
        return itemReportedMissing;
    }

    /**
     * Sets the value of the itemReportedMissing property.
     * 
     * @param value
     *     allowed object is
     *     {@link ItemReportedMissing }
     *     
     */
    public void setItemReportedMissing(ItemReportedMissing value) {
        this.itemReportedMissing = value;
    }

    /**
     * Gets the value of the itemElementType property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the itemElementType property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getItemElementType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SchemeValuePair }
     * 
     * 
     */
    public List<SchemeValuePair> getItemElementType() {
        if (itemElementType == null) {
            itemElementType = new ArrayList<SchemeValuePair>();
        }
        return this.itemElementType;
    }

    /**
     * Gets the value of the userElementType property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the userElementType property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUserElementType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SchemeValuePair }
     * 
     * 
     */
    public List<SchemeValuePair> getUserElementType() {
        if (userElementType == null) {
            userElementType = new ArrayList<SchemeValuePair>();
        }
        return this.userElementType;
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
