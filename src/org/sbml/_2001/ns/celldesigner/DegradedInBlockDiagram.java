//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.05.24 at 05:21:09 PM JST 
//


package org.sbml._2001.ns.celldesigner;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Degradation of a protein represented by the block.
 * 
 * <p>Java class for degradedInBlockDiagram complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="degradedInBlockDiagram">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="degradedShapeInBlockDiagram" type="{http://www.sbml.org/2001/ns/celldesigner}degradedShapeInBlockDiagram"/>
 *       &lt;/sequence>
 *       &lt;attribute name="id" use="required">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}short">
 *             &lt;minInclusive value="0"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="offsetY" use="required">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "degradedInBlockDiagram", propOrder = {
    "degradedShapeInBlockDiagram"
})
public class DegradedInBlockDiagram {

    @XmlElement(required = true)
    protected DegradedShapeInBlockDiagram degradedShapeInBlockDiagram;
    @XmlAttribute(name = "id", required = true)
    protected short id;
    @XmlAttribute(name = "offsetY", required = true)
    protected BigDecimal offsetY;

    /**
     * Gets the value of the degradedShapeInBlockDiagram property.
     * 
     * @return
     *     possible object is
     *     {@link DegradedShapeInBlockDiagram }
     *     
     */
    public DegradedShapeInBlockDiagram getDegradedShapeInBlockDiagram() {
        return degradedShapeInBlockDiagram;
    }

    /**
     * Sets the value of the degradedShapeInBlockDiagram property.
     * 
     * @param value
     *     allowed object is
     *     {@link DegradedShapeInBlockDiagram }
     *     
     */
    public void setDegradedShapeInBlockDiagram(DegradedShapeInBlockDiagram value) {
        this.degradedShapeInBlockDiagram = value;
    }

    /**
     * Gets the value of the id property.
     * 
     */
    public short getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     */
    public void setId(short value) {
        this.id = value;
    }

    /**
     * Gets the value of the offsetY property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOffsetY() {
        return offsetY;
    }

    /**
     * Sets the value of the offsetY property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOffsetY(BigDecimal value) {
        this.offsetY = value;
    }

}
