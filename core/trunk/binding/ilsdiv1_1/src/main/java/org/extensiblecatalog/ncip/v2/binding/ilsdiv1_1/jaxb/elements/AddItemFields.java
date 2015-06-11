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
 *         &lt;element ref="{http://www.niso.org/2008/ncip}BibliographicDescription" minOccurs="0"/>
 *         &lt;element ref="{http://www.niso.org/2008/ncip}ItemUseRestrictionType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.niso.org/2008/ncip}ItemDescription" minOccurs="0"/>
 *         &lt;element ref="{http://www.niso.org/2008/ncip}Location" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.niso.org/2008/ncip}PhysicalCondition" minOccurs="0"/>
 *         &lt;element ref="{http://www.niso.org/2008/ncip}SecurityMarker" minOccurs="0"/>
 *         &lt;element ref="{http://www.niso.org/2008/ncip}SensitizationFlag" minOccurs="0"/>
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
    "bibliographicDescription",
    "itemUseRestrictionType",
    "itemDescription",
    "location",
    "physicalCondition",
    "securityMarker",
    "sensitizationFlag",
    "ext"
})
@XmlRootElement(name = "AddItemFields")
public class AddItemFields {

    @XmlElement(name = "BibliographicDescription")
    protected BibliographicDescription bibliographicDescription;
    @XmlElement(name = "ItemUseRestrictionType")
    protected List<SchemeValuePair> itemUseRestrictionType;
    @XmlElement(name = "ItemDescription")
    protected ItemDescription itemDescription;
    @XmlElement(name = "Location")
    protected List<Location> location;
    @XmlElement(name = "PhysicalCondition")
    protected PhysicalCondition physicalCondition;
    @XmlElement(name = "SecurityMarker")
    protected SchemeValuePair securityMarker;
    @XmlElement(name = "SensitizationFlag")
    protected SensitizationFlag sensitizationFlag;
    @XmlElement(name = "Ext")
    protected Ext ext;

    /**
     * Gets the value of the bibliographicDescription property.
     * 
     * @return
     *     possible object is
     *     {@link BibliographicDescription }
     *     
     */
    public BibliographicDescription getBibliographicDescription() {
        return bibliographicDescription;
    }

    /**
     * Sets the value of the bibliographicDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link BibliographicDescription }
     *     
     */
    public void setBibliographicDescription(BibliographicDescription value) {
        this.bibliographicDescription = value;
    }

    /**
     * Gets the value of the itemUseRestrictionType property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the itemUseRestrictionType property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getItemUseRestrictionType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SchemeValuePair }
     * 
     * 
     */
    public List<SchemeValuePair> getItemUseRestrictionType() {
        if (itemUseRestrictionType == null) {
            itemUseRestrictionType = new ArrayList<SchemeValuePair>();
        }
        return this.itemUseRestrictionType;
    }

    /**
     * Gets the value of the itemDescription property.
     * 
     * @return
     *     possible object is
     *     {@link ItemDescription }
     *     
     */
    public ItemDescription getItemDescription() {
        return itemDescription;
    }

    /**
     * Sets the value of the itemDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link ItemDescription }
     *     
     */
    public void setItemDescription(ItemDescription value) {
        this.itemDescription = value;
    }

    /**
     * Gets the value of the location property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the location property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLocation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Location }
     * 
     * 
     */
    public List<Location> getLocation() {
        if (location == null) {
            location = new ArrayList<Location>();
        }
        return this.location;
    }

    /**
     * Gets the value of the physicalCondition property.
     * 
     * @return
     *     possible object is
     *     {@link PhysicalCondition }
     *     
     */
    public PhysicalCondition getPhysicalCondition() {
        return physicalCondition;
    }

    /**
     * Sets the value of the physicalCondition property.
     * 
     * @param value
     *     allowed object is
     *     {@link PhysicalCondition }
     *     
     */
    public void setPhysicalCondition(PhysicalCondition value) {
        this.physicalCondition = value;
    }

    /**
     * Gets the value of the securityMarker property.
     * 
     * @return
     *     possible object is
     *     {@link SchemeValuePair }
     *     
     */
    public SchemeValuePair getSecurityMarker() {
        return securityMarker;
    }

    /**
     * Sets the value of the securityMarker property.
     * 
     * @param value
     *     allowed object is
     *     {@link SchemeValuePair }
     *     
     */
    public void setSecurityMarker(SchemeValuePair value) {
        this.securityMarker = value;
    }

    /**
     * Gets the value of the sensitizationFlag property.
     * 
     * @return
     *     possible object is
     *     {@link SensitizationFlag }
     *     
     */
    public SensitizationFlag getSensitizationFlag() {
        return sensitizationFlag;
    }

    /**
     * Sets the value of the sensitizationFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link SensitizationFlag }
     *     
     */
    public void setSensitizationFlag(SensitizationFlag value) {
        this.sensitizationFlag = value;
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
