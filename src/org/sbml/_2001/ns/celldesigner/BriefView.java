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
 * Data for drawing object with brief (compact) view.
 * 
 * <p>Java class for briefView complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="briefView">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="innerPosition" type="{http://www.sbml.org/2001/ns/celldesigner}innerPosition"/>
 *         &lt;element name="boxSize" type="{http://www.sbml.org/2001/ns/celldesigner}boxSize"/>
 *         &lt;element name="singleLine" type="{http://www.sbml.org/2001/ns/celldesigner}singleLine"/>
 *         &lt;element name="paint" type="{http://www.sbml.org/2001/ns/celldesigner}paint"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "briefView", propOrder = {
    "innerPosition",
    "boxSize",
    "singleLine",
    "paint"
})
public class BriefView {

    @XmlElement(required = true)
    protected InnerPosition innerPosition;
    @XmlElement(required = true)
    protected BoxSize boxSize;
    @XmlElement(required = true)
    protected SingleLine singleLine;
    @XmlElement(required = true)
    protected Paint paint;

    /**
     * Gets the value of the innerPosition property.
     * 
     * @return
     *     possible object is
     *     {@link InnerPosition }
     *     
     */
    public InnerPosition getInnerPosition() {
        return innerPosition;
    }

    /**
     * Sets the value of the innerPosition property.
     * 
     * @param value
     *     allowed object is
     *     {@link InnerPosition }
     *     
     */
    public void setInnerPosition(InnerPosition value) {
        this.innerPosition = value;
    }

    /**
     * Gets the value of the boxSize property.
     * 
     * @return
     *     possible object is
     *     {@link BoxSize }
     *     
     */
    public BoxSize getBoxSize() {
        return boxSize;
    }

    /**
     * Sets the value of the boxSize property.
     * 
     * @param value
     *     allowed object is
     *     {@link BoxSize }
     *     
     */
    public void setBoxSize(BoxSize value) {
        this.boxSize = value;
    }

    /**
     * Gets the value of the singleLine property.
     * 
     * @return
     *     possible object is
     *     {@link SingleLine }
     *     
     */
    public SingleLine getSingleLine() {
        return singleLine;
    }

    /**
     * Sets the value of the singleLine property.
     * 
     * @param value
     *     allowed object is
     *     {@link SingleLine }
     *     
     */
    public void setSingleLine(SingleLine value) {
        this.singleLine = value;
    }

    /**
     * Gets the value of the paint property.
     * 
     * @return
     *     possible object is
     *     {@link Paint }
     *     
     */
    public Paint getPaint() {
        return paint;
    }

    /**
     * Sets the value of the paint property.
     * 
     * @param value
     *     allowed object is
     *     {@link Paint }
     *     
     */
    public void setPaint(Paint value) {
        this.paint = value;
    }

}
