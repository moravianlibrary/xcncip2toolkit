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
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.XMLGregorianCalendar;


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
 *         &lt;element ref="{http://www.niso.org/2008/ncip}ItemId" minOccurs="0"/>
 *         &lt;choice>
 *           &lt;sequence>
 *             &lt;element ref="{http://www.niso.org/2008/ncip}RequestId" maxOccurs="unbounded" minOccurs="0"/>
 *             &lt;element ref="{http://www.niso.org/2008/ncip}CurrentBorrower" minOccurs="0"/>
 *             &lt;element ref="{http://www.niso.org/2008/ncip}CurrentRequester" maxOccurs="unbounded" minOccurs="0"/>
 *             &lt;element ref="{http://www.niso.org/2008/ncip}DateDue" minOccurs="0"/>
 *             &lt;element ref="{http://www.niso.org/2008/ncip}DateRecalled" minOccurs="0"/>
 *             &lt;element ref="{http://www.niso.org/2008/ncip}HoldPickupDate" minOccurs="0"/>
 *             &lt;element ref="{http://www.niso.org/2008/ncip}ItemTransaction" minOccurs="0"/>
 *             &lt;element ref="{http://www.niso.org/2008/ncip}ItemOptionalFields" minOccurs="0"/>
 *             &lt;element ref="{http://www.niso.org/2008/ncip}ItemNote" minOccurs="0"/>
 *             &lt;element ref="{http://www.niso.org/2008/ncip}Ext" minOccurs="0"/>
 *           &lt;/sequence>
 *           &lt;element ref="{http://www.niso.org/2008/ncip}Problem" maxOccurs="unbounded"/>
 *         &lt;/choice>
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
    "itemId",
    "requestId",
    "currentBorrower",
    "currentRequester",
    "dateDue",
    "dateRecalled",
    "holdPickupDate",
    "itemTransaction",
    "itemOptionalFields",
    "itemNote",
    "ext",
    "problem"
})
@XmlRootElement(name = "ItemInformation")
public class ItemInformation {

    @XmlElement(name = "ItemId")
    protected ItemId itemId;
    @XmlElement(name = "RequestId")
    protected List<RequestId> requestId;
    @XmlElement(name = "CurrentBorrower")
    protected CurrentBorrower currentBorrower;
    @XmlElement(name = "CurrentRequester")
    protected List<CurrentRequester> currentRequester;
    @XmlElement(name = "DateDue", type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateDue;
    @XmlElement(name = "DateRecalled", type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateRecalled;
    @XmlElement(name = "HoldPickupDate", type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar holdPickupDate;
    @XmlElement(name = "ItemTransaction")
    protected ItemTransaction itemTransaction;
    @XmlElement(name = "ItemOptionalFields")
    protected ItemOptionalFields itemOptionalFields;
    @XmlElement(name = "ItemNote")
    protected String itemNote;
    @XmlElement(name = "Ext")
    protected Ext ext;
    @XmlElement(name = "Problem")
    protected List<Problem> problem;

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
     * Gets the value of the requestId property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the requestId property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRequestId().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RequestId }
     * 
     * 
     */
    public List<RequestId> getRequestId() {
        if (requestId == null) {
            requestId = new ArrayList<RequestId>();
        }
        return this.requestId;
    }

    /**
     * Gets the value of the currentBorrower property.
     * 
     * @return
     *     possible object is
     *     {@link CurrentBorrower }
     *     
     */
    public CurrentBorrower getCurrentBorrower() {
        return currentBorrower;
    }

    /**
     * Sets the value of the currentBorrower property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrentBorrower }
     *     
     */
    public void setCurrentBorrower(CurrentBorrower value) {
        this.currentBorrower = value;
    }

    /**
     * Gets the value of the currentRequester property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the currentRequester property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCurrentRequester().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CurrentRequester }
     * 
     * 
     */
    public List<CurrentRequester> getCurrentRequester() {
        if (currentRequester == null) {
            currentRequester = new ArrayList<CurrentRequester>();
        }
        return this.currentRequester;
    }

    /**
     * Gets the value of the dateDue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public XMLGregorianCalendar getDateDue() {
        return dateDue;
    }

    /**
     * Sets the value of the dateDue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDateDue(XMLGregorianCalendar value) {
        this.dateDue = value;
    }

    /**
     * Gets the value of the dateRecalled property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public XMLGregorianCalendar getDateRecalled() {
        return dateRecalled;
    }

    /**
     * Sets the value of the dateRecalled property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDateRecalled(XMLGregorianCalendar value) {
        this.dateRecalled = value;
    }

    /**
     * Gets the value of the holdPickupDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public XMLGregorianCalendar getHoldPickupDate() {
        return holdPickupDate;
    }

    /**
     * Sets the value of the holdPickupDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHoldPickupDate(XMLGregorianCalendar value) {
        this.holdPickupDate = value;
    }

    /**
     * Gets the value of the itemTransaction property.
     * 
     * @return
     *     possible object is
     *     {@link ItemTransaction }
     *     
     */
    public ItemTransaction getItemTransaction() {
        return itemTransaction;
    }

    /**
     * Sets the value of the itemTransaction property.
     * 
     * @param value
     *     allowed object is
     *     {@link ItemTransaction }
     *     
     */
    public void setItemTransaction(ItemTransaction value) {
        this.itemTransaction = value;
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
     * Gets the value of the itemNote property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getItemNote() {
        return itemNote;
    }

    /**
     * Sets the value of the itemNote property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setItemNote(String value) {
        this.itemNote = value;
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

}
