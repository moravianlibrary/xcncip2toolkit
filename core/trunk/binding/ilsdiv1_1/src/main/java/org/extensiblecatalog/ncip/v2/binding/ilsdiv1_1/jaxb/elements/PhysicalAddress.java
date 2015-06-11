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
 *         &lt;choice>
 *           &lt;element ref="{http://www.niso.org/2008/ncip}StructuredAddress"/>
 *           &lt;element ref="{http://www.niso.org/2008/ncip}UnstructuredAddress"/>
 *         &lt;/choice>
 *         &lt;element ref="{http://www.niso.org/2008/ncip}PhysicalAddressType"/>
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
    "structuredAddress",
    "unstructuredAddress",
    "physicalAddressType",
    "ext"
})
@XmlRootElement(name = "PhysicalAddress")
public class PhysicalAddress {

    @XmlElement(name = "StructuredAddress")
    protected StructuredAddress structuredAddress;
    @XmlElement(name = "UnstructuredAddress")
    protected UnstructuredAddress unstructuredAddress;
    @XmlElement(name = "PhysicalAddressType", required = true)
    protected SchemeValuePair physicalAddressType;
    @XmlElement(name = "Ext")
    protected Ext ext;

    /**
     * Gets the value of the structuredAddress property.
     * 
     * @return
     *     possible object is
     *     {@link StructuredAddress }
     *     
     */
    public StructuredAddress getStructuredAddress() {
        return structuredAddress;
    }

    /**
     * Sets the value of the structuredAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link StructuredAddress }
     *     
     */
    public void setStructuredAddress(StructuredAddress value) {
        this.structuredAddress = value;
    }

    /**
     * Gets the value of the unstructuredAddress property.
     * 
     * @return
     *     possible object is
     *     {@link UnstructuredAddress }
     *     
     */
    public UnstructuredAddress getUnstructuredAddress() {
        return unstructuredAddress;
    }

    /**
     * Sets the value of the unstructuredAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link UnstructuredAddress }
     *     
     */
    public void setUnstructuredAddress(UnstructuredAddress value) {
        this.unstructuredAddress = value;
    }

    /**
     * Gets the value of the physicalAddressType property.
     * 
     * @return
     *     possible object is
     *     {@link SchemeValuePair }
     *     
     */
    public SchemeValuePair getPhysicalAddressType() {
        return physicalAddressType;
    }

    /**
     * Sets the value of the physicalAddressType property.
     * 
     * @param value
     *     allowed object is
     *     {@link SchemeValuePair }
     *     
     */
    public void setPhysicalAddressType(SchemeValuePair value) {
        this.physicalAddressType = value;
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
