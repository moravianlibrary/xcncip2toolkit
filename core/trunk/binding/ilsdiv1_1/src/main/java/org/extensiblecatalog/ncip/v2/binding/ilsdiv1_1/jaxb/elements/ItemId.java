//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.5-b10 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.06.11 at 02:59:27 PM CEST 
//


package org.extensiblecatalog.ncip.v2.binding.ilsdiv1_1.jaxb.elements;

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
 *         &lt;element ref="{http://www.niso.org/2008/ncip}AgencyId" minOccurs="0"/>
 *         &lt;element ref="{http://www.niso.org/2008/ncip}ItemIdentifierType" minOccurs="0"/>
 *         &lt;element ref="{http://www.niso.org/2008/ncip}ItemIdentifierValue"/>
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
    "agencyId",
    "itemIdentifierType",
    "itemIdentifierValue",
    "ext"
})
@XmlRootElement(name = "ItemId")
public class ItemId {

    @XmlElement(name = "AgencyId")
    protected SchemeValuePair agencyId;
    @XmlElement(name = "ItemIdentifierType")
    protected SchemeValuePair itemIdentifierType;
    @XmlElement(name = "ItemIdentifierValue", required = true)
    protected String itemIdentifierValue;
    @XmlElement(name = "Ext")
    protected Ext ext;

    /**
     * Gets the value of the agencyId property.
     * 
     * @return
     *     possible object is
     *     {@link SchemeValuePair }
     *     
     */
    public SchemeValuePair getAgencyId() {
        return agencyId;
    }

    /**
     * Sets the value of the agencyId property.
     * 
     * @param value
     *     allowed object is
     *     {@link SchemeValuePair }
     *     
     */
    public void setAgencyId(SchemeValuePair value) {
        this.agencyId = value;
    }

    /**
     * Gets the value of the itemIdentifierType property.
     * 
     * @return
     *     possible object is
     *     {@link SchemeValuePair }
     *     
     */
    public SchemeValuePair getItemIdentifierType() {
        return itemIdentifierType;
    }

    /**
     * Sets the value of the itemIdentifierType property.
     * 
     * @param value
     *     allowed object is
     *     {@link SchemeValuePair }
     *     
     */
    public void setItemIdentifierType(SchemeValuePair value) {
        this.itemIdentifierType = value;
    }

    /**
     * Gets the value of the itemIdentifierValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getItemIdentifierValue() {
        return itemIdentifierValue;
    }

    /**
     * Sets the value of the itemIdentifierValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setItemIdentifierValue(String value) {
        this.itemIdentifierValue = value;
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
