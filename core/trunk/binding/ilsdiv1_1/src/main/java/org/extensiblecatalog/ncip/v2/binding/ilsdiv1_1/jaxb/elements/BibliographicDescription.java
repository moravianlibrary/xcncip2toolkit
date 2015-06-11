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
 *         &lt;element ref="{http://www.niso.org/2008/ncip}Author" minOccurs="0"/>
 *         &lt;element ref="{http://www.niso.org/2008/ncip}AuthorOfComponent" minOccurs="0"/>
 *         &lt;element ref="{http://www.niso.org/2008/ncip}BibliographicItemId" minOccurs="0"/>
 *         &lt;element ref="{http://www.niso.org/2008/ncip}BibliographicRecordId" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.niso.org/2008/ncip}ComponentId" minOccurs="0"/>
 *         &lt;element ref="{http://www.niso.org/2008/ncip}Edition" minOccurs="0"/>
 *         &lt;element ref="{http://www.niso.org/2008/ncip}Pagination" minOccurs="0"/>
 *         &lt;element ref="{http://www.niso.org/2008/ncip}PlaceOfPublication" minOccurs="0"/>
 *         &lt;element ref="{http://www.niso.org/2008/ncip}PublicationDate" minOccurs="0"/>
 *         &lt;element ref="{http://www.niso.org/2008/ncip}PublicationDateOfComponent" minOccurs="0"/>
 *         &lt;element ref="{http://www.niso.org/2008/ncip}Publisher" minOccurs="0"/>
 *         &lt;element ref="{http://www.niso.org/2008/ncip}SeriesTitleNumber" minOccurs="0"/>
 *         &lt;element ref="{http://www.niso.org/2008/ncip}Title" minOccurs="0"/>
 *         &lt;element ref="{http://www.niso.org/2008/ncip}TitleOfComponent" minOccurs="0"/>
 *         &lt;element ref="{http://www.niso.org/2008/ncip}BibliographicLevel" minOccurs="0"/>
 *         &lt;element ref="{http://www.niso.org/2008/ncip}SponsoringBody" minOccurs="0"/>
 *         &lt;element ref="{http://www.niso.org/2008/ncip}ElectronicDataFormatType" minOccurs="0"/>
 *         &lt;element ref="{http://www.niso.org/2008/ncip}Language" minOccurs="0"/>
 *         &lt;element ref="{http://www.niso.org/2008/ncip}MediumType" minOccurs="0"/>
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
    "author",
    "authorOfComponent",
    "bibliographicItemId",
    "bibliographicRecordId",
    "componentId",
    "edition",
    "pagination",
    "placeOfPublication",
    "publicationDate",
    "publicationDateOfComponent",
    "publisher",
    "seriesTitleNumber",
    "title",
    "titleOfComponent",
    "bibliographicLevel",
    "sponsoringBody",
    "electronicDataFormatType",
    "language",
    "mediumType",
    "ext"
})
@XmlRootElement(name = "BibliographicDescription")
public class BibliographicDescription {

    @XmlElement(name = "Author")
    protected String author;
    @XmlElement(name = "AuthorOfComponent")
    protected String authorOfComponent;
    @XmlElement(name = "BibliographicItemId")
    protected BibliographicItemId bibliographicItemId;
    @XmlElement(name = "BibliographicRecordId")
    protected List<BibliographicRecordId> bibliographicRecordId;
    @XmlElement(name = "ComponentId")
    protected ComponentId componentId;
    @XmlElement(name = "Edition")
    protected String edition;
    @XmlElement(name = "Pagination")
    protected String pagination;
    @XmlElement(name = "PlaceOfPublication")
    protected String placeOfPublication;
    @XmlElement(name = "PublicationDate")
    protected String publicationDate;
    @XmlElement(name = "PublicationDateOfComponent")
    protected String publicationDateOfComponent;
    @XmlElement(name = "Publisher")
    protected String publisher;
    @XmlElement(name = "SeriesTitleNumber")
    protected String seriesTitleNumber;
    @XmlElement(name = "Title")
    protected String title;
    @XmlElement(name = "TitleOfComponent")
    protected String titleOfComponent;
    @XmlElement(name = "BibliographicLevel")
    protected SchemeValuePair bibliographicLevel;
    @XmlElement(name = "SponsoringBody")
    protected String sponsoringBody;
    @XmlElement(name = "ElectronicDataFormatType")
    protected SchemeValuePair electronicDataFormatType;
    @XmlElement(name = "Language")
    protected SchemeValuePair language;
    @XmlElement(name = "MediumType")
    protected SchemeValuePair mediumType;
    @XmlElement(name = "Ext")
    protected Ext ext;

    /**
     * Gets the value of the author property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuthor() {
        return author;
    }

    /**
     * Sets the value of the author property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuthor(String value) {
        this.author = value;
    }

    /**
     * Gets the value of the authorOfComponent property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuthorOfComponent() {
        return authorOfComponent;
    }

    /**
     * Sets the value of the authorOfComponent property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuthorOfComponent(String value) {
        this.authorOfComponent = value;
    }

    /**
     * Gets the value of the bibliographicItemId property.
     * 
     * @return
     *     possible object is
     *     {@link BibliographicItemId }
     *     
     */
    public BibliographicItemId getBibliographicItemId() {
        return bibliographicItemId;
    }

    /**
     * Sets the value of the bibliographicItemId property.
     * 
     * @param value
     *     allowed object is
     *     {@link BibliographicItemId }
     *     
     */
    public void setBibliographicItemId(BibliographicItemId value) {
        this.bibliographicItemId = value;
    }

    /**
     * Gets the value of the bibliographicRecordId property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the bibliographicRecordId property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBibliographicRecordId().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BibliographicRecordId }
     * 
     * 
     */
    public List<BibliographicRecordId> getBibliographicRecordId() {
        if (bibliographicRecordId == null) {
            bibliographicRecordId = new ArrayList<BibliographicRecordId>();
        }
        return this.bibliographicRecordId;
    }

    /**
     * Gets the value of the componentId property.
     * 
     * @return
     *     possible object is
     *     {@link ComponentId }
     *     
     */
    public ComponentId getComponentId() {
        return componentId;
    }

    /**
     * Sets the value of the componentId property.
     * 
     * @param value
     *     allowed object is
     *     {@link ComponentId }
     *     
     */
    public void setComponentId(ComponentId value) {
        this.componentId = value;
    }

    /**
     * Gets the value of the edition property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEdition() {
        return edition;
    }

    /**
     * Sets the value of the edition property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEdition(String value) {
        this.edition = value;
    }

    /**
     * Gets the value of the pagination property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPagination() {
        return pagination;
    }

    /**
     * Sets the value of the pagination property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPagination(String value) {
        this.pagination = value;
    }

    /**
     * Gets the value of the placeOfPublication property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPlaceOfPublication() {
        return placeOfPublication;
    }

    /**
     * Sets the value of the placeOfPublication property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPlaceOfPublication(String value) {
        this.placeOfPublication = value;
    }

    /**
     * Gets the value of the publicationDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPublicationDate() {
        return publicationDate;
    }

    /**
     * Sets the value of the publicationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPublicationDate(String value) {
        this.publicationDate = value;
    }

    /**
     * Gets the value of the publicationDateOfComponent property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPublicationDateOfComponent() {
        return publicationDateOfComponent;
    }

    /**
     * Sets the value of the publicationDateOfComponent property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPublicationDateOfComponent(String value) {
        this.publicationDateOfComponent = value;
    }

    /**
     * Gets the value of the publisher property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPublisher() {
        return publisher;
    }

    /**
     * Sets the value of the publisher property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPublisher(String value) {
        this.publisher = value;
    }

    /**
     * Gets the value of the seriesTitleNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSeriesTitleNumber() {
        return seriesTitleNumber;
    }

    /**
     * Sets the value of the seriesTitleNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSeriesTitleNumber(String value) {
        this.seriesTitleNumber = value;
    }

    /**
     * Gets the value of the title property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTitle() {
        return title;
    }

    /**
     * Sets the value of the title property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTitle(String value) {
        this.title = value;
    }

    /**
     * Gets the value of the titleOfComponent property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTitleOfComponent() {
        return titleOfComponent;
    }

    /**
     * Sets the value of the titleOfComponent property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTitleOfComponent(String value) {
        this.titleOfComponent = value;
    }

    /**
     * Gets the value of the bibliographicLevel property.
     * 
     * @return
     *     possible object is
     *     {@link SchemeValuePair }
     *     
     */
    public SchemeValuePair getBibliographicLevel() {
        return bibliographicLevel;
    }

    /**
     * Sets the value of the bibliographicLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link SchemeValuePair }
     *     
     */
    public void setBibliographicLevel(SchemeValuePair value) {
        this.bibliographicLevel = value;
    }

    /**
     * Gets the value of the sponsoringBody property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSponsoringBody() {
        return sponsoringBody;
    }

    /**
     * Sets the value of the sponsoringBody property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSponsoringBody(String value) {
        this.sponsoringBody = value;
    }

    /**
     * Gets the value of the electronicDataFormatType property.
     * 
     * @return
     *     possible object is
     *     {@link SchemeValuePair }
     *     
     */
    public SchemeValuePair getElectronicDataFormatType() {
        return electronicDataFormatType;
    }

    /**
     * Sets the value of the electronicDataFormatType property.
     * 
     * @param value
     *     allowed object is
     *     {@link SchemeValuePair }
     *     
     */
    public void setElectronicDataFormatType(SchemeValuePair value) {
        this.electronicDataFormatType = value;
    }

    /**
     * Gets the value of the language property.
     * 
     * @return
     *     possible object is
     *     {@link SchemeValuePair }
     *     
     */
    public SchemeValuePair getLanguage() {
        return language;
    }

    /**
     * Sets the value of the language property.
     * 
     * @param value
     *     allowed object is
     *     {@link SchemeValuePair }
     *     
     */
    public void setLanguage(SchemeValuePair value) {
        this.language = value;
    }

    /**
     * Gets the value of the mediumType property.
     * 
     * @return
     *     possible object is
     *     {@link SchemeValuePair }
     *     
     */
    public SchemeValuePair getMediumType() {
        return mediumType;
    }

    /**
     * Sets the value of the mediumType property.
     * 
     * @param value
     *     allowed object is
     *     {@link SchemeValuePair }
     *     
     */
    public void setMediumType(SchemeValuePair value) {
        this.mediumType = value;
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
