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
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

// TODO: Auto-generated Javadoc
/**
 * <p>
 * Java class for layerSpeciesAlias complex type.
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="layerSpeciesAlias">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="layerNotes" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="bounds" type="{http://www.sbml.org/2001/ns/celldesigner}bounds"/>
 *         &lt;element name="paint" type="{http://www.sbml.org/2001/ns/celldesigner}paint"/>
 *         &lt;element name="font">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="size" type="{http://www.w3.org/2001/XMLSchema}int" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *       &lt;attribute name="target" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="targetId" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="x" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *       &lt;attribute name="y" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "layerSpeciesAlias", propOrder = {"layerNotes", "bounds",
  "paint", "font"})
public class LayerSpeciesAlias {

  /** The layer notes. */
  @XmlElement(required = true)
  protected String                 layerNotes;
  /** The bounds. */
  @XmlElement(required = true)
  protected Bounds                 bounds;
  /** The paint. */
  @XmlElement(required = true)
  protected Paint                  paint;
  /** The font. */
  @XmlElement(required = true)
  protected LayerSpeciesAlias.Font font;
  /** The target. */
  @XmlAttribute(name = "target", required = true)
  protected String                 target;
  /** The target id. */
  @XmlAttribute(name = "targetId", required = true)
  protected String                 targetId;
  /** The x. */
  @XmlAttribute(name = "x", required = true)
  protected BigDecimal             x;
  /** The y. */
  @XmlAttribute(name = "y", required = true)
  protected BigDecimal             y;


  /**
   * Gets the value of the layerNotes property.
   * 
   * @return
   *         possible object is {@link String }
   */
  public String getLayerNotes() {
    return layerNotes;
  }


  /**
   * Sets the value of the layerNotes property.
   * 
   * @param value
   *        allowed object is {@link String }
   */
  public void setLayerNotes(String value) {
    this.layerNotes = value;
  }


  /**
   * Gets the value of the bounds property.
   * 
   * @return
   *         possible object is {@link Bounds }
   */
  public Bounds getBounds() {
    return bounds;
  }


  /**
   * Sets the value of the bounds property.
   * 
   * @param value
   *        allowed object is {@link Bounds }
   */
  public void setBounds(Bounds value) {
    this.bounds = value;
  }


  /**
   * Gets the value of the paint property.
   * 
   * @return
   *         possible object is {@link Paint }
   */
  public Paint getPaint() {
    return paint;
  }


  /**
   * Sets the value of the paint property.
   * 
   * @param value
   *        allowed object is {@link Paint }
   */
  public void setPaint(Paint value) {
    this.paint = value;
  }


  /**
   * Gets the value of the font property.
   * 
   * @return
   *         possible object is {@link LayerSpeciesAlias.Font }
   */
  public LayerSpeciesAlias.Font getFont() {
    return font;
  }


  /**
   * Sets the value of the font property.
   * 
   * @param value
   *        allowed object is {@link LayerSpeciesAlias.Font }
   */
  public void setFont(LayerSpeciesAlias.Font value) {
    this.font = value;
  }


  /**
   * Gets the value of the target property.
   * 
   * @return
   *         possible object is {@link String }
   */
  public String getTarget() {
    return target;
  }


  /**
   * Sets the value of the target property.
   * 
   * @param value
   *        allowed object is {@link String }
   */
  public void setTarget(String value) {
    this.target = value;
  }


  /**
   * Gets the value of the targetId property.
   * 
   * @return
   *         possible object is {@link String }
   */
  public String getTargetId() {
    return targetId;
  }


  /**
   * Sets the value of the targetId property.
   * 
   * @param value
   *        allowed object is {@link String }
   */
  public void setTargetId(String value) {
    this.targetId = value;
  }


  /**
   * Gets the value of the x property.
   * 
   * @return
   *         possible object is {@link BigDecimal }
   */
  public BigDecimal getX() {
    return x;
  }


  /**
   * Sets the value of the x property.
   * 
   * @param value
   *        allowed object is {@link BigDecimal }
   */
  public void setX(BigDecimal value) {
    this.x = value;
  }


  /**
   * Gets the value of the y property.
   * 
   * @return
   *         possible object is {@link BigDecimal }
   */
  public BigDecimal getY() {
    return y;
  }


  /**
   * Sets the value of the y property.
   * 
   * @param value
   *        allowed object is {@link BigDecimal }
   */
  public void setY(BigDecimal value) {
    this.y = value;
  }

  /**
   * <p>
   * Java class for anonymous complex type.
   * <p>
   * The following schema fragment specifies the expected content contained
   * within this class.
   * 
   * <pre>
   * &lt;complexType>
   *   &lt;complexContent>
   *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
   *       &lt;attribute name="size" type="{http://www.w3.org/2001/XMLSchema}int" />
   *     &lt;/restriction>
   *   &lt;/complexContent>
   * &lt;/complexType>
   * </pre>
   */
  @XmlAccessorType(XmlAccessType.FIELD)
  @XmlType(name = "")
  public static class Font {

    /** The size. */
    @XmlAttribute(name = "size")
    protected Integer size;


    /**
     * Gets the value of the size property.
     * 
     * @return
     *         possible object is {@link Integer }
     */
    public Integer getSize() {
      return size;
    }


    /**
     * Sets the value of the size property.
     * 
     * @param value
     *        allowed object is {@link Integer }
     */
    public void setSize(Integer value) {
      this.size = value;
    }
  }
}
