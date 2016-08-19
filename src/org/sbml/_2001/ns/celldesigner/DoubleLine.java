/*******************************************************************************
 * Copyright 2016 Kaito Ii, Akira Funahashi
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *******************************************************************************/
//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.05.30 at 07:47:34 PM JST 
//


package org.sbml._2001.ns.celldesigner;

import java.math.BigDecimal;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


// TODO: Auto-generated Javadoc
/**
 * Double line type to draw object.
 * 
 * <p>Java class for doubleLine complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="doubleLine">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="innerWidth" use="required">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *             &lt;minInclusive value="0.0"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="outerWidth" use="required">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *             &lt;minInclusive value="0.0"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="thickness" use="required">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *             &lt;minInclusive value="0.0"/>
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
@XmlType(name = "doubleLine")
public class DoubleLine {

    /** The inner width. */
    @XmlAttribute(name = "innerWidth", required = true)
    protected BigDecimal innerWidth;
    
    /** The outer width. */
    @XmlAttribute(name = "outerWidth", required = true)
    protected BigDecimal outerWidth;
    
    /** The thickness. */
    @XmlAttribute(name = "thickness", required = true)
    protected BigDecimal thickness;

    /**
     * Gets the value of the innerWidth property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInnerWidth() {
        return innerWidth;
    }

    /**
     * Sets the value of the innerWidth property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInnerWidth(BigDecimal value) {
        this.innerWidth = value;
    }

    /**
     * Gets the value of the outerWidth property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOuterWidth() {
        return outerWidth;
    }

    /**
     * Sets the value of the outerWidth property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOuterWidth(BigDecimal value) {
        this.outerWidth = value;
    }

    /**
     * Gets the value of the thickness property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getThickness() {
        return thickness;
    }

    /**
     * Sets the value of the thickness property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setThickness(BigDecimal value) {
        this.thickness = value;
    }

}
