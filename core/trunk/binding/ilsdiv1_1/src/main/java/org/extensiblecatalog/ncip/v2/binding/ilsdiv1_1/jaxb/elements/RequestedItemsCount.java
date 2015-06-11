//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.5-b10 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.06.11 at 02:59:27 PM CEST 
//


package org.extensiblecatalog.ncip.v2.binding.ilsdiv1_1.jaxb.elements;

import java.math.BigDecimal;
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
 *         &lt;choice>
 *           &lt;element ref="{http://www.niso.org/2008/ncip}RequestType"/>
 *           &lt;element ref="{http://www.niso.org/2008/ncip}CirculationStatus"/>
 *           &lt;element ref="{http://www.niso.org/2008/ncip}ItemUseRestrictionType"/>
 *         &lt;/choice>
 *         &lt;element ref="{http://www.niso.org/2008/ncip}RequestedItemCountValue"/>
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
    "requestType",
    "circulationStatus",
    "itemUseRestrictionType",
    "requestedItemCountValue",
    "ext"
})
@XmlRootElement(name = "RequestedItemsCount")
public class RequestedItemsCount {

    @XmlElement(name = "RequestType")
    protected SchemeValuePair requestType;
    @XmlElement(name = "CirculationStatus")
    protected SchemeValuePair circulationStatus;
    @XmlElement(name = "ItemUseRestrictionType")
    protected SchemeValuePair itemUseRestrictionType;
    @XmlElement(name = "RequestedItemCountValue", required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigDecimal requestedItemCountValue;
    @XmlElement(name = "Ext")
    protected Ext ext;

    /**
     * Gets the value of the requestType property.
     * 
     * @return
     *     possible object is
     *     {@link SchemeValuePair }
     *     
     */
    public SchemeValuePair getRequestType() {
        return requestType;
    }

    /**
     * Sets the value of the requestType property.
     * 
     * @param value
     *     allowed object is
     *     {@link SchemeValuePair }
     *     
     */
    public void setRequestType(SchemeValuePair value) {
        this.requestType = value;
    }

    /**
     * Gets the value of the circulationStatus property.
     * 
     * @return
     *     possible object is
     *     {@link SchemeValuePair }
     *     
     */
    public SchemeValuePair getCirculationStatus() {
        return circulationStatus;
    }

    /**
     * Sets the value of the circulationStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link SchemeValuePair }
     *     
     */
    public void setCirculationStatus(SchemeValuePair value) {
        this.circulationStatus = value;
    }

    /**
     * Gets the value of the itemUseRestrictionType property.
     * 
     * @return
     *     possible object is
     *     {@link SchemeValuePair }
     *     
     */
    public SchemeValuePair getItemUseRestrictionType() {
        return itemUseRestrictionType;
    }

    /**
     * Sets the value of the itemUseRestrictionType property.
     * 
     * @param value
     *     allowed object is
     *     {@link SchemeValuePair }
     *     
     */
    public void setItemUseRestrictionType(SchemeValuePair value) {
        this.itemUseRestrictionType = value;
    }

    /**
     * Gets the value of the requestedItemCountValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public BigDecimal getRequestedItemCountValue() {
        return requestedItemCountValue;
    }

    /**
     * Sets the value of the requestedItemCountValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRequestedItemCountValue(BigDecimal value) {
        this.requestedItemCountValue = value;
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
