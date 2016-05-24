//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.05.24 at 04:27:51 PM JST 
//


package org.sbml.sbml.level2.version4;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import org.sbml._2001.ns.celldesigner.SpeciesReferenceAnnotation;


/**
 * Redefined speciesReference.
 * 
 * <p>Java class for SpeciesReference complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SpeciesReference">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.sbml.org/sbml/level2/version4}SpeciesReference">
 *       &lt;redefine>
 *         &lt;complexType name="SpeciesReference">
 *           &lt;complexContent>
 *             &lt;extension base="{http://www.sbml.org/sbml/level2/version4}SimpleSpeciesReference">
 *               &lt;sequence>
 *                 &lt;element name="stoichiometryMath" type="{http://www.sbml.org/sbml/level2/version4}StoichiometryMath" minOccurs="0"/>
 *               &lt;/sequence>
 *               &lt;attribute name="stoichiometry" type="{http://www.w3.org/2001/XMLSchema}double" default="1" />
 *             &lt;/extension>
 *           &lt;/complexContent>
 *         &lt;/complexType>
 *       &lt;/redefine>
 *       &lt;sequence>
 *         &lt;element name="annotation" type="{http://www.sbml.org/2001/ns/celldesigner}speciesReferenceAnnotation" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SpeciesReference", propOrder = {
    "annotation"
})
public class SpeciesReference
    extends OriginalSpeciesReference
{

    protected SpeciesReferenceAnnotation annotation;

    /**
     * Gets the value of the annotation property.
     * 
     * @return
     *     possible object is
     *     {@link SpeciesReferenceAnnotation }
     *     
     */
    public SpeciesReferenceAnnotation getAnnotation() {
        return annotation;
    }

    /**
     * Sets the value of the annotation property.
     * 
     * @param value
     *     allowed object is
     *     {@link SpeciesReferenceAnnotation }
     *     
     */
    public void setAnnotation(SpeciesReferenceAnnotation value) {
        this.annotation = value;
    }

}
