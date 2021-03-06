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

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;

// TODO: Auto-generated Javadoc
/**
 * Base product.
 * <p>
 * Java class for baseProduct complex type.
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="baseProduct">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="linkAnchor" type="{http://www.sbml.org/2001/ns/celldesigner}linkAnchor" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="alias" use="required">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.sbml.org/2001/ns/celldesigner}SId">
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="species" use="required" type="{http://www.sbml.org/2001/ns/celldesigner}SId" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "baseProduct", propOrder = {"linkAnchor"})
public class BaseProduct {

  /** The link anchor. */
  protected LinkAnchor linkAnchor;
  /** The alias. */
  @XmlAttribute(name = "alias", required = true)
  protected String     alias;
  /** The species. */
  @XmlAttribute(name = "species", required = true)
  protected String     species;


  /**
   * Gets the value of the linkAnchor property.
   * 
   * @return
   *         possible object is {@link LinkAnchor }
   */
  public LinkAnchor getLinkAnchor() {
    return linkAnchor;
  }


  /**
   * Sets the value of the linkAnchor property.
   * 
   * @param value
   *        allowed object is {@link LinkAnchor }
   */
  public void setLinkAnchor(LinkAnchor value) {
    this.linkAnchor = value;
  }


  /**
   * Gets the value of the alias property.
   * 
   * @return
   *         possible object is {@link String }
   */
  public String getAlias() {
    return alias;
  }


  /**
   * Sets the value of the alias property.
   * 
   * @param value
   *        allowed object is {@link String }
   */
  public void setAlias(String value) {
    this.alias = value;
  }


  /**
   * Gets the value of the species property.
   * 
   * @return
   *         possible object is {@link String }
   */
  public String getSpecies() {
    return species;
  }


  /**
   * Sets the value of the species property.
   * 
   * @param value
   *        allowed object is {@link String }
   */
  public void setSpecies(String value) {
    this.species = value;
  }
}
