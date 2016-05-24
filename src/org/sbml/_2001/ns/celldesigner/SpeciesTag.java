//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.05.24 at 05:21:09 PM JST 
//


package org.sbml._2001.ns.celldesigner;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SpeciesTag complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SpeciesTag">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="KeyInfo" type="{http://www.sbml.org/2001/ns/celldesigner}KeyInfo"/>
 *         &lt;element name="TagBounds" type="{http://www.sbml.org/2001/ns/celldesigner}TagBounds"/>
 *         &lt;element name="TagEdgeLine" type="{http://www.sbml.org/2001/ns/celldesigner}TagEdgeLine"/>
 *         &lt;element name="TagFramePaint" type="{http://www.sbml.org/2001/ns/celldesigner}paint"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SpeciesTag", propOrder = {
    "keyInfo",
    "tagBounds",
    "tagEdgeLine",
    "tagFramePaint"
})
public class SpeciesTag {

    @XmlElement(name = "KeyInfo", required = true)
    protected KeyInfo keyInfo;
    @XmlElement(name = "TagBounds", required = true)
    protected TagBounds tagBounds;
    @XmlElement(name = "TagEdgeLine", required = true)
    protected TagEdgeLine tagEdgeLine;
    @XmlElement(name = "TagFramePaint", required = true)
    protected Paint tagFramePaint;

    /**
     * Gets the value of the keyInfo property.
     * 
     * @return
     *     possible object is
     *     {@link KeyInfo }
     *     
     */
    public KeyInfo getKeyInfo() {
        return keyInfo;
    }

    /**
     * Sets the value of the keyInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link KeyInfo }
     *     
     */
    public void setKeyInfo(KeyInfo value) {
        this.keyInfo = value;
    }

    /**
     * Gets the value of the tagBounds property.
     * 
     * @return
     *     possible object is
     *     {@link TagBounds }
     *     
     */
    public TagBounds getTagBounds() {
        return tagBounds;
    }

    /**
     * Sets the value of the tagBounds property.
     * 
     * @param value
     *     allowed object is
     *     {@link TagBounds }
     *     
     */
    public void setTagBounds(TagBounds value) {
        this.tagBounds = value;
    }

    /**
     * Gets the value of the tagEdgeLine property.
     * 
     * @return
     *     possible object is
     *     {@link TagEdgeLine }
     *     
     */
    public TagEdgeLine getTagEdgeLine() {
        return tagEdgeLine;
    }

    /**
     * Sets the value of the tagEdgeLine property.
     * 
     * @param value
     *     allowed object is
     *     {@link TagEdgeLine }
     *     
     */
    public void setTagEdgeLine(TagEdgeLine value) {
        this.tagEdgeLine = value;
    }

    /**
     * Gets the value of the tagFramePaint property.
     * 
     * @return
     *     possible object is
     *     {@link Paint }
     *     
     */
    public Paint getTagFramePaint() {
        return tagFramePaint;
    }

    /**
     * Sets the value of the tagFramePaint property.
     * 
     * @param value
     *     allowed object is
     *     {@link Paint }
     *     
     */
    public void setTagFramePaint(Paint value) {
        this.tagFramePaint = value;
    }

}
