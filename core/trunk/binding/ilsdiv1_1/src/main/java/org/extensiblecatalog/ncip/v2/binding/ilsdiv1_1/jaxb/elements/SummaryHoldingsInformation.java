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
 *         &lt;choice>
 *           &lt;element ref="{http://www.niso.org/2008/ncip}StructuredHoldingsData" maxOccurs="unbounded"/>
 *           &lt;element ref="{http://www.niso.org/2008/ncip}UnstructuredHoldingsData"/>
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
    "structuredHoldingsData",
    "unstructuredHoldingsData",
    "ext"
})
@XmlRootElement(name = "SummaryHoldingsInformation")
public class SummaryHoldingsInformation {

    @XmlElement(name = "StructuredHoldingsData")
    protected List<StructuredHoldingsData> structuredHoldingsData;
    @XmlElement(name = "UnstructuredHoldingsData")
    protected String unstructuredHoldingsData;
    @XmlElement(name = "Ext")
    protected Ext ext;

    /**
     * Gets the value of the structuredHoldingsData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the structuredHoldingsData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStructuredHoldingsData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link StructuredHoldingsData }
     * 
     * 
     */
    public List<StructuredHoldingsData> getStructuredHoldingsData() {
        if (structuredHoldingsData == null) {
            structuredHoldingsData = new ArrayList<StructuredHoldingsData>();
        }
        return this.structuredHoldingsData;
    }

    /**
     * Gets the value of the unstructuredHoldingsData property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnstructuredHoldingsData() {
        return unstructuredHoldingsData;
    }

    /**
     * Sets the value of the unstructuredHoldingsData property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUnstructuredHoldingsData(String value) {
        this.unstructuredHoldingsData = value;
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
