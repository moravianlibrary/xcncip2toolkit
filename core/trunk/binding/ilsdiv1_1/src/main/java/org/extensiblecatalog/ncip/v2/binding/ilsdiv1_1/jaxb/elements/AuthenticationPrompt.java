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
 *         &lt;element ref="{http://www.niso.org/2008/ncip}PromptOutput"/>
 *         &lt;element ref="{http://www.niso.org/2008/ncip}PromptInput"/>
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
    "promptOutput",
    "promptInput",
    "ext"
})
@XmlRootElement(name = "AuthenticationPrompt")
public class AuthenticationPrompt {

    @XmlElement(name = "PromptOutput", required = true)
    protected PromptOutput promptOutput;
    @XmlElement(name = "PromptInput", required = true)
    protected PromptInput promptInput;
    @XmlElement(name = "Ext")
    protected Ext ext;

    /**
     * Gets the value of the promptOutput property.
     * 
     * @return
     *     possible object is
     *     {@link PromptOutput }
     *     
     */
    public PromptOutput getPromptOutput() {
        return promptOutput;
    }

    /**
     * Sets the value of the promptOutput property.
     * 
     * @param value
     *     allowed object is
     *     {@link PromptOutput }
     *     
     */
    public void setPromptOutput(PromptOutput value) {
        this.promptOutput = value;
    }

    /**
     * Gets the value of the promptInput property.
     * 
     * @return
     *     possible object is
     *     {@link PromptInput }
     *     
     */
    public PromptInput getPromptInput() {
        return promptInput;
    }

    /**
     * Sets the value of the promptInput property.
     * 
     * @param value
     *     allowed object is
     *     {@link PromptInput }
     *     
     */
    public void setPromptInput(PromptInput value) {
        this.promptInput = value;
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
