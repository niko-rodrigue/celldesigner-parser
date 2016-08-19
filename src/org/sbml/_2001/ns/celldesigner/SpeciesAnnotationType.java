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

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


// TODO: Auto-generated Javadoc
/**
 * Annotation for species.
 * 
 * <p>Java class for speciesAnnotationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="speciesAnnotationType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="extension">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;choice>
 *                     &lt;element ref="{http://www.sbml.org/2001/ns/celldesigner}positionToCompartment"/>
 *                     &lt;element ref="{http://www.sbml.org/2001/ns/celldesigner}complexSpecies"/>
 *                   &lt;/choice>
 *                   &lt;element name="speciesIdentity" type="{http://www.sbml.org/2001/ns/celldesigner}speciesIdentity"/>
 *                   &lt;element name="listOfCatalyzedReactions" type="{http://www.sbml.org/2001/ns/celldesigner}listOfCatalyzedReactions" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "speciesAnnotationType", propOrder = {
    "extension"
})
public class SpeciesAnnotationType {

    /** The extension. */
    @XmlElement(required = true)
    protected SpeciesAnnotationType.Extension extension;

    /**
     * Gets the value of the extension property.
     * 
     * @return
     *     possible object is
     *     {@link SpeciesAnnotationType.Extension }
     *     
     */
    public SpeciesAnnotationType.Extension getExtension() {
        return extension;
    }

    /**
     * Sets the value of the extension property.
     * 
     * @param value
     *     allowed object is
     *     {@link SpeciesAnnotationType.Extension }
     *     
     */
    public void setExtension(SpeciesAnnotationType.Extension value) {
        this.extension = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;choice>
     *           &lt;element ref="{http://www.sbml.org/2001/ns/celldesigner}positionToCompartment"/>
     *           &lt;element ref="{http://www.sbml.org/2001/ns/celldesigner}complexSpecies"/>
     *         &lt;/choice>
     *         &lt;element name="speciesIdentity" type="{http://www.sbml.org/2001/ns/celldesigner}speciesIdentity"/>
     *         &lt;element name="listOfCatalyzedReactions" type="{http://www.sbml.org/2001/ns/celldesigner}listOfCatalyzedReactions" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "positionToCompartment",
        "complexSpecies",
        "speciesIdentity",
        "listOfCatalyzedReactions"
    })
    public static class Extension {

        /** The position to compartment. */
        protected String positionToCompartment;
        
        /** The complex species. */
        protected String complexSpecies;
        
        /** The species identity. */
        @XmlElement(required = true)
        protected SpeciesIdentity speciesIdentity;
        
        /** The list of catalyzed reactions. */
        protected ListOfCatalyzedReactions listOfCatalyzedReactions;

        /**
         * Gets the value of the positionToCompartment property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPositionToCompartment() {
            return positionToCompartment;
        }

        /**
         * Sets the value of the positionToCompartment property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPositionToCompartment(String value) {
            this.positionToCompartment = value;
        }

        /**
         * Gets the value of the complexSpecies property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getComplexSpecies() {
            return complexSpecies;
        }

        /**
         * Sets the value of the complexSpecies property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setComplexSpecies(String value) {
            this.complexSpecies = value;
        }

        /**
         * Gets the value of the speciesIdentity property.
         * 
         * @return
         *     possible object is
         *     {@link SpeciesIdentity }
         *     
         */
        public SpeciesIdentity getSpeciesIdentity() {
            return speciesIdentity;
        }

        /**
         * Sets the value of the speciesIdentity property.
         * 
         * @param value
         *     allowed object is
         *     {@link SpeciesIdentity }
         *     
         */
        public void setSpeciesIdentity(SpeciesIdentity value) {
            this.speciesIdentity = value;
        }

        /**
         * Gets the value of the listOfCatalyzedReactions property.
         * 
         * @return
         *     possible object is
         *     {@link ListOfCatalyzedReactions }
         *     
         */
        public ListOfCatalyzedReactions getListOfCatalyzedReactions() {
            return listOfCatalyzedReactions;
        }

        /**
         * Sets the value of the listOfCatalyzedReactions property.
         * 
         * @param value
         *     allowed object is
         *     {@link ListOfCatalyzedReactions }
         *     
         */
        public void setListOfCatalyzedReactions(ListOfCatalyzedReactions value) {
            this.listOfCatalyzedReactions = value;
        }

    }

}
