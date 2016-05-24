//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.05.24 at 05:21:09 PM JST 
//


package org.sbml.sbml.level2.version4;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Compartment complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Compartment">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.sbml.org/sbml/level2/version4}SBase">
 *       &lt;attribute name="id" use="required" type="{http://www.sbml.org/sbml/level2/version4}SId" />
 *       &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="size" type="{http://www.w3.org/2001/XMLSchema}double" />
 *       &lt;attribute name="spatialDimensions" default="3">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
 *             &lt;minInclusive value="0"/>
 *             &lt;maxInclusive value="3"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="units" type="{http://www.sbml.org/sbml/level2/version4}SId" />
 *       &lt;attribute name="outside" type="{http://www.sbml.org/sbml/level2/version4}SId" />
 *       &lt;attribute name="constant" type="{http://www.w3.org/2001/XMLSchema}boolean" default="true" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlSeeAlso({
    Compartment.class
})
public class OriginalCompartment
    extends SBase
{

    @XmlAttribute(name = "id", required = true)
    protected String id;
    @XmlAttribute(name = "name")
    protected String name;
    @XmlAttribute(name = "size")
    protected Double size;
    @XmlAttribute(name = "spatialDimensions")
    protected Integer spatialDimensions;
    @XmlAttribute(name = "units")
    protected String units;
    @XmlAttribute(name = "outside")
    protected String outside;
    @XmlAttribute(name = "constant")
    protected Boolean constant;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the size property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getSize() {
        return size;
    }

    /**
     * Sets the value of the size property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setSize(Double value) {
        this.size = value;
    }

    /**
     * Gets the value of the spatialDimensions property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public int getSpatialDimensions() {
        if (spatialDimensions == null) {
            return  3;
        } else {
            return spatialDimensions;
        }
    }

    /**
     * Sets the value of the spatialDimensions property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSpatialDimensions(Integer value) {
        this.spatialDimensions = value;
    }

    /**
     * Gets the value of the units property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnits() {
        return units;
    }

    /**
     * Sets the value of the units property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUnits(String value) {
        this.units = value;
    }

    /**
     * Gets the value of the outside property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutside() {
        return outside;
    }

    /**
     * Sets the value of the outside property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutside(String value) {
        this.outside = value;
    }

    /**
     * Gets the value of the constant property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isConstant() {
        if (constant == null) {
            return true;
        } else {
            return constant;
        }
    }

    /**
     * Sets the value of the constant property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setConstant(Boolean value) {
        this.constant = value;
    }

}
