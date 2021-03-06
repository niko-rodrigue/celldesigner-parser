/*******************************************************************************
 * Copyright 2016 Kaito Ii, Akira Funahashi
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * http://www.apache.org/licenses/LICENSE-2.0
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *******************************************************************************/
//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB)
// Reference Implementation, v2.2.8-b130911.1802
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>
// Any modifications to this file will be lost upon recompilation of the source
// schema.
// Generated on: 2016.05.30 at 07:47:34 PM JST
//
package org.sbml._2001.ns.celldesigner;

import java.math.BigDecimal;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;

// TODO: Auto-generated Javadoc
/**
 * For modification residue of proteins.
 * <p>
 * Java class for modificationResidue complex type.
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="modificationResidue">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="id" use="required">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.sbml.org/2001/ns/celldesigner}SId">
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="name">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="angle">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *             &lt;maxInclusive value="6.283185307179586476925286766559"/>
 *             &lt;minInclusive value="0.0"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="side" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "modificationResidue")
public class ModificationResidue {

  /** The id. */
  @XmlAttribute(name = "id", required = true)
  protected String     id;
  /** The name. */
  @XmlAttribute(name = "name")
  protected String     name;
  /** The angle. */
  @XmlAttribute(name = "angle")
  protected BigDecimal angle;
  /** The side. */
  @XmlAttribute(name = "side")
  @XmlSchemaType(name = "anySimpleType")
  protected String     side;


  /**
   * Gets the value of the id property.
   * 
   * @return
   *         possible object is {@link String }
   */
  public String getId() {
    return id;
  }


  /**
   * Sets the value of the id property.
   * 
   * @param value
   *        allowed object is {@link String }
   */
  public void setId(String value) {
    this.id = value;
  }


  /**
   * Gets the value of the name property.
   * 
   * @return
   *         possible object is {@link String }
   */
  public String getName() {
    return name;
  }


  /**
   * Sets the value of the name property.
   * 
   * @param value
   *        allowed object is {@link String }
   */
  public void setName(String value) {
    this.name = value;
  }


  /**
   * Gets the value of the angle property.
   * 
   * @return
   *         possible object is {@link BigDecimal }
   */
  public BigDecimal getAngle() {
    return angle;
  }


  /**
   * Sets the value of the angle property.
   * 
   * @param value
   *        allowed object is {@link BigDecimal }
   */
  public void setAngle(BigDecimal value) {
    this.angle = value;
  }


  /**
   * Gets the value of the side property.
   * 
   * @return
   *         possible object is {@link String }
   */
  public String getSide() {
    return side;
  }


  /**
   * Sets the value of the side property.
   * 
   * @param value
   *        allowed object is {@link String }
   */
  public void setSide(String value) {
    this.side = value;
  }
}
