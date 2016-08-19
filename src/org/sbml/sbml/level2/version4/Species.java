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


package org.sbml.sbml.level2.version4;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

import org.sbml._2001.ns.celldesigner.SpeciesAnnotationType;


// TODO: Auto-generated Javadoc
/**
 * Redefined species.
 * 
 * <p>Java class for Species complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Species">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.sbml.org/sbml/level2/version4}Species">
 *       &lt;redefine>
 *         &lt;complexType name="Species">
 *           &lt;complexContent>
 *             &lt;extension base="{http://www.sbml.org/sbml/level2/version4}SBase">
 *               &lt;attribute name="id" use="required" type="{http://www.sbml.org/sbml/level2/version4}SId" />
 *               &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" />
 *               &lt;attribute name="compartment" type="{http://www.sbml.org/sbml/level2/version4}SId" />
 *               &lt;attribute name="initialAmount" type="{http://www.w3.org/2001/XMLSchema}double" />
 *               &lt;attribute name="initialConcentration" type="{http://www.w3.org/2001/XMLSchema}double" />
 *               &lt;attribute name="substanceUnits" type="{http://www.sbml.org/sbml/level2/version4}SId" />
 *               &lt;attribute name="spatialSizeUnits" type="{http://www.sbml.org/sbml/level2/version4}SId" />
 *               &lt;attribute name="hasOnlySubstanceUnits" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *               &lt;attribute name="boundaryCondition" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *               &lt;attribute name="charge" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *               &lt;attribute name="constant" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *             &lt;/extension>
 *           &lt;/complexContent>
 *         &lt;/complexType>
 *       &lt;/redefine>
 *       &lt;sequence>
 *         &lt;element name="annotation" type="{http://www.sbml.org/2001/ns/celldesigner}speciesAnnotationType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Species", propOrder = {
    "annotation"
})
public class Species
    extends OriginalSpecies
{

    /** The annotation. */
    protected SpeciesAnnotationType annotation;

    /**
     * Gets the value of the annotation property.
     * 
     * @return
     *     possible object is
     *     {@link SpeciesAnnotationType }
     *     
     */
    public SpeciesAnnotationType getAnnotation() {
        return annotation;
    }

    /**
     * Sets the value of the annotation property.
     * 
     * @param value
     *     allowed object is
     *     {@link SpeciesAnnotationType }
     *     
     */
    public void setAnnotation(SpeciesAnnotationType value) {
        this.annotation = value;
    }

}
