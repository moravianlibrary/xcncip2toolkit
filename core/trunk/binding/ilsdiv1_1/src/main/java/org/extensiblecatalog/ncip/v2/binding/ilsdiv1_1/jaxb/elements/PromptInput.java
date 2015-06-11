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
 *         &lt;element ref="{http://www.niso.org/2008/ncip}AuthenticationInputType"/>
 *         &lt;element ref="{http://www.niso.org/2008/ncip}AuthenticationDataFormatType"/>
 *         &lt;element ref="{http://www.niso.org/2008/ncip}SensitiveDataFlag" minOccurs="0"/>
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
    "authenticationInputType",
    "authenticationDataFormatType",
    "sensitiveDataFlag",
    "ext"
})
@XmlRootElement(name = "PromptInput")
public class PromptInput {

    @XmlElement(name = "AuthenticationInputType", required = true)
    protected SchemeValuePair authenticationInputType;
    @XmlElement(name = "AuthenticationDataFormatType", required = true)
    protected SchemeValuePair authenticationDataFormatType;
    @XmlElement(name = "SensitiveDataFlag")
    protected SensitiveDataFlag sensitiveDataFlag;
    @XmlElement(name = "Ext")
    protected Ext ext;

    /**
     * Gets the value of the authenticationInputType property.
     * 
     * @return
     *     possible object is
     *     {@link SchemeValuePair }
     *     
     */
    public SchemeValuePair getAuthenticationInputType() {
        return authenticationInputType;
    }

    /**
     * Sets the value of the authenticationInputType property.
     * 
     * @param value
     *     allowed object is
     *     {@link SchemeValuePair }
     *     
     */
    public void setAuthenticationInputType(SchemeValuePair value) {
        this.authenticationInputType = value;
    }

    /**
     * Gets the value of the authenticationDataFormatType property.
     * 
     * @return
     *     possible object is
     *     {@link SchemeValuePair }
     *     
     */
    public SchemeValuePair getAuthenticationDataFormatType() {
        return authenticationDataFormatType;
    }

    /**
     * Sets the value of the authenticationDataFormatType property.
     * 
     * @param value
     *     allowed object is
     *     {@link SchemeValuePair }
     *     
     */
    public void setAuthenticationDataFormatType(SchemeValuePair value) {
        this.authenticationDataFormatType = value;
    }

    /**
     * Gets the value of the sensitiveDataFlag property.
     * 
     * @return
     *     possible object is
     *     {@link SensitiveDataFlag }
     *     
     */
    public SensitiveDataFlag getSensitiveDataFlag() {
        return sensitiveDataFlag;
    }

    /**
     * Sets the value of the sensitiveDataFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link SensitiveDataFlag }
     *     
     */
    public void setSensitiveDataFlag(SensitiveDataFlag value) {
        this.sensitiveDataFlag = value;
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
