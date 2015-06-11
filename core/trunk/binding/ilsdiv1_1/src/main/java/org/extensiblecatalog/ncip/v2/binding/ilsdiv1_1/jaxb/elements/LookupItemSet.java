//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.5-b10 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.06.11 at 02:59:27 PM CEST 
//


package org.extensiblecatalog.ncip.v2.binding.ilsdiv1_1.jaxb.elements;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


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
 *         &lt;choice>
 *           &lt;element ref="{http://www.niso.org/2008/ncip}BibliographicId" maxOccurs="unbounded"/>
 *           &lt;element ref="{http://www.niso.org/2008/ncip}HoldingsSetId" maxOccurs="unbounded"/>
 *           &lt;element ref="{http://www.niso.org/2008/ncip}ItemId" maxOccurs="unbounded"/>
 *         &lt;/choice>
 *         &lt;element ref="{http://www.niso.org/2008/ncip}ItemElementType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.niso.org/2008/ncip}CurrentBorrowerDesired" minOccurs="0"/>
 *         &lt;element ref="{http://www.niso.org/2008/ncip}CurrentRequestersDesired" minOccurs="0"/>
 *         &lt;element ref="{http://www.niso.org/2008/ncip}MaximumItemsCount" minOccurs="0"/>
 *         &lt;element ref="{http://www.niso.org/2008/ncip}NextItemToken" minOccurs="0"/>
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
    "bibliographicId",
    "holdingsSetId",
    "itemId",
    "itemElementType",
    "currentBorrowerDesired",
    "currentRequestersDesired",
    "maximumItemsCount",
    "nextItemToken",
    "ext"
})
@XmlRootElement(name = "LookupItemSet")
public class LookupItemSet {

    @XmlElement(name = "InitiationHeader")
    protected InitiationHeader initiationHeader;
    @XmlElement(name = "BibliographicId")
    protected List<BibliographicId> bibliographicId;
    @XmlElement(name = "HoldingsSetId")
    protected List<String> holdingsSetId;
    @XmlElement(name = "ItemId")
    protected List<ItemId> itemId;
    @XmlElement(name = "ItemElementType")
    protected List<SchemeValuePair> itemElementType;
    @XmlElement(name = "CurrentBorrowerDesired")
    protected CurrentBorrowerDesired currentBorrowerDesired;
    @XmlElement(name = "CurrentRequestersDesired")
    protected CurrentRequestersDesired currentRequestersDesired;
    @XmlElement(name = "MaximumItemsCount", type = String.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    @XmlSchemaType(name = "positiveInteger")
    protected BigDecimal maximumItemsCount;
    @XmlElement(name = "NextItemToken")
    protected String nextItemToken;
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
     * Gets the value of the bibliographicId property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the bibliographicId property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBibliographicId().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BibliographicId }
     * 
     * 
     */
    public List<BibliographicId> getBibliographicId() {
        if (bibliographicId == null) {
            bibliographicId = new ArrayList<BibliographicId>();
        }
        return this.bibliographicId;
    }

    /**
     * Gets the value of the holdingsSetId property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the holdingsSetId property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHoldingsSetId().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getHoldingsSetId() {
        if (holdingsSetId == null) {
            holdingsSetId = new ArrayList<String>();
        }
        return this.holdingsSetId;
    }

    /**
     * Gets the value of the itemId property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the itemId property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getItemId().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ItemId }
     * 
     * 
     */
    public List<ItemId> getItemId() {
        if (itemId == null) {
            itemId = new ArrayList<ItemId>();
        }
        return this.itemId;
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
     * Gets the value of the currentBorrowerDesired property.
     * 
     * @return
     *     possible object is
     *     {@link CurrentBorrowerDesired }
     *     
     */
    public CurrentBorrowerDesired getCurrentBorrowerDesired() {
        return currentBorrowerDesired;
    }

    /**
     * Sets the value of the currentBorrowerDesired property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrentBorrowerDesired }
     *     
     */
    public void setCurrentBorrowerDesired(CurrentBorrowerDesired value) {
        this.currentBorrowerDesired = value;
    }

    /**
     * Gets the value of the currentRequestersDesired property.
     * 
     * @return
     *     possible object is
     *     {@link CurrentRequestersDesired }
     *     
     */
    public CurrentRequestersDesired getCurrentRequestersDesired() {
        return currentRequestersDesired;
    }

    /**
     * Sets the value of the currentRequestersDesired property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrentRequestersDesired }
     *     
     */
    public void setCurrentRequestersDesired(CurrentRequestersDesired value) {
        this.currentRequestersDesired = value;
    }

    /**
     * Gets the value of the maximumItemsCount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public BigDecimal getMaximumItemsCount() {
        return maximumItemsCount;
    }

    /**
     * Sets the value of the maximumItemsCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaximumItemsCount(BigDecimal value) {
        this.maximumItemsCount = value;
    }

    /**
     * Gets the value of the nextItemToken property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNextItemToken() {
        return nextItemToken;
    }

    /**
     * Sets the value of the nextItemToken property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNextItemToken(String value) {
        this.nextItemToken = value;
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
