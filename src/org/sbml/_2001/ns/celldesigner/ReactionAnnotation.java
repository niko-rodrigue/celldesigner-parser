//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.05.24 at 04:27:51 PM JST 
//


package org.sbml._2001.ns.celldesigner;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Annotation for reaction.
 * 
 * <p>Java class for reactionAnnotation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="reactionAnnotation">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="extension">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element ref="{http://www.sbml.org/2001/ns/celldesigner}name" minOccurs="0"/>
 *                   &lt;element ref="{http://www.sbml.org/2001/ns/celldesigner}reaction"/>
 *                   &lt;element name="baseReactants" type="{http://www.sbml.org/2001/ns/celldesigner}baseReactants"/>
 *                   &lt;element name="baseProducts" type="{http://www.sbml.org/2001/ns/celldesigner}baseProducts"/>
 *                   &lt;element name="listOfReactantLinks" type="{http://www.sbml.org/2001/ns/celldesigner}listOfReactantLinks" minOccurs="0"/>
 *                   &lt;element name="listOfProductLinks" type="{http://www.sbml.org/2001/ns/celldesigner}listOfProductLinks" minOccurs="0"/>
 *                   &lt;element name="connectScheme" type="{http://www.sbml.org/2001/ns/celldesigner}connectScheme"/>
 *                   &lt;element name="offset" type="{http://www.sbml.org/2001/ns/celldesigner}offset" minOccurs="0"/>
 *                   &lt;element name="editPoints" type="{http://www.sbml.org/2001/ns/celldesigner}editPoints" minOccurs="0"/>
 *                   &lt;element name="line" type="{http://www.sbml.org/2001/ns/celldesigner}line"/>
 *                   &lt;element name="listOfModification" type="{http://www.sbml.org/2001/ns/celldesigner}listOfModification" minOccurs="0"/>
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
@XmlType(name = "reactionAnnotation", propOrder = {
    "extension"
})
public class ReactionAnnotation {

    @XmlElement(required = true)
    protected ReactionAnnotation.Extension extension;

    /**
     * Gets the value of the extension property.
     * 
     * @return
     *     possible object is
     *     {@link ReactionAnnotation.Extension }
     *     
     */
    public ReactionAnnotation.Extension getExtension() {
        return extension;
    }

    /**
     * Sets the value of the extension property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReactionAnnotation.Extension }
     *     
     */
    public void setExtension(ReactionAnnotation.Extension value) {
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
     *         &lt;element ref="{http://www.sbml.org/2001/ns/celldesigner}name" minOccurs="0"/>
     *         &lt;element ref="{http://www.sbml.org/2001/ns/celldesigner}reaction"/>
     *         &lt;element name="baseReactants" type="{http://www.sbml.org/2001/ns/celldesigner}baseReactants"/>
     *         &lt;element name="baseProducts" type="{http://www.sbml.org/2001/ns/celldesigner}baseProducts"/>
     *         &lt;element name="listOfReactantLinks" type="{http://www.sbml.org/2001/ns/celldesigner}listOfReactantLinks" minOccurs="0"/>
     *         &lt;element name="listOfProductLinks" type="{http://www.sbml.org/2001/ns/celldesigner}listOfProductLinks" minOccurs="0"/>
     *         &lt;element name="connectScheme" type="{http://www.sbml.org/2001/ns/celldesigner}connectScheme"/>
     *         &lt;element name="offset" type="{http://www.sbml.org/2001/ns/celldesigner}offset" minOccurs="0"/>
     *         &lt;element name="editPoints" type="{http://www.sbml.org/2001/ns/celldesigner}editPoints" minOccurs="0"/>
     *         &lt;element name="line" type="{http://www.sbml.org/2001/ns/celldesigner}line"/>
     *         &lt;element name="listOfModification" type="{http://www.sbml.org/2001/ns/celldesigner}listOfModification" minOccurs="0"/>
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
        "name",
        "reaction",
        "baseReactants",
        "baseProducts",
        "listOfReactantLinks",
        "listOfProductLinks",
        "connectScheme",
        "offset",
        "editPoints",
        "line",
        "listOfModification"
    })
    public static class Extension {

        protected String name;
        @XmlElement(required = true)
        protected String reaction;
        @XmlElement(required = true)
        protected BaseReactants baseReactants;
        @XmlElement(required = true)
        protected BaseProducts baseProducts;
        protected ListOfReactantLinks listOfReactantLinks;
        protected ListOfProductLinks listOfProductLinks;
        @XmlElement(required = true)
        protected ConnectScheme connectScheme;
        protected Offset offset;
        protected EditPoints editPoints;
        @XmlElement(required = true)
        protected Line line;
        protected ListOfModification listOfModification;

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
         * Gets the value of the reaction property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getReaction() {
            return reaction;
        }

        /**
         * Sets the value of the reaction property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setReaction(String value) {
            this.reaction = value;
        }

        /**
         * Gets the value of the baseReactants property.
         * 
         * @return
         *     possible object is
         *     {@link BaseReactants }
         *     
         */
        public BaseReactants getBaseReactants() {
            return baseReactants;
        }

        /**
         * Sets the value of the baseReactants property.
         * 
         * @param value
         *     allowed object is
         *     {@link BaseReactants }
         *     
         */
        public void setBaseReactants(BaseReactants value) {
            this.baseReactants = value;
        }

        /**
         * Gets the value of the baseProducts property.
         * 
         * @return
         *     possible object is
         *     {@link BaseProducts }
         *     
         */
        public BaseProducts getBaseProducts() {
            return baseProducts;
        }

        /**
         * Sets the value of the baseProducts property.
         * 
         * @param value
         *     allowed object is
         *     {@link BaseProducts }
         *     
         */
        public void setBaseProducts(BaseProducts value) {
            this.baseProducts = value;
        }

        /**
         * Gets the value of the listOfReactantLinks property.
         * 
         * @return
         *     possible object is
         *     {@link ListOfReactantLinks }
         *     
         */
        public ListOfReactantLinks getListOfReactantLinks() {
            return listOfReactantLinks;
        }

        /**
         * Sets the value of the listOfReactantLinks property.
         * 
         * @param value
         *     allowed object is
         *     {@link ListOfReactantLinks }
         *     
         */
        public void setListOfReactantLinks(ListOfReactantLinks value) {
            this.listOfReactantLinks = value;
        }

        /**
         * Gets the value of the listOfProductLinks property.
         * 
         * @return
         *     possible object is
         *     {@link ListOfProductLinks }
         *     
         */
        public ListOfProductLinks getListOfProductLinks() {
            return listOfProductLinks;
        }

        /**
         * Sets the value of the listOfProductLinks property.
         * 
         * @param value
         *     allowed object is
         *     {@link ListOfProductLinks }
         *     
         */
        public void setListOfProductLinks(ListOfProductLinks value) {
            this.listOfProductLinks = value;
        }

        /**
         * Gets the value of the connectScheme property.
         * 
         * @return
         *     possible object is
         *     {@link ConnectScheme }
         *     
         */
        public ConnectScheme getConnectScheme() {
            return connectScheme;
        }

        /**
         * Sets the value of the connectScheme property.
         * 
         * @param value
         *     allowed object is
         *     {@link ConnectScheme }
         *     
         */
        public void setConnectScheme(ConnectScheme value) {
            this.connectScheme = value;
        }

        /**
         * Gets the value of the offset property.
         * 
         * @return
         *     possible object is
         *     {@link Offset }
         *     
         */
        public Offset getOffset() {
            return offset;
        }

        /**
         * Sets the value of the offset property.
         * 
         * @param value
         *     allowed object is
         *     {@link Offset }
         *     
         */
        public void setOffset(Offset value) {
            this.offset = value;
        }

        /**
         * Gets the value of the editPoints property.
         * 
         * @return
         *     possible object is
         *     {@link EditPoints }
         *     
         */
        public EditPoints getEditPoints() {
            return editPoints;
        }

        /**
         * Sets the value of the editPoints property.
         * 
         * @param value
         *     allowed object is
         *     {@link EditPoints }
         *     
         */
        public void setEditPoints(EditPoints value) {
            this.editPoints = value;
        }

        /**
         * Gets the value of the line property.
         * 
         * @return
         *     possible object is
         *     {@link Line }
         *     
         */
        public Line getLine() {
            return line;
        }

        /**
         * Sets the value of the line property.
         * 
         * @param value
         *     allowed object is
         *     {@link Line }
         *     
         */
        public void setLine(Line value) {
            this.line = value;
        }

        /**
         * Gets the value of the listOfModification property.
         * 
         * @return
         *     possible object is
         *     {@link ListOfModification }
         *     
         */
        public ListOfModification getListOfModification() {
            return listOfModification;
        }

        /**
         * Sets the value of the listOfModification property.
         * 
         * @param value
         *     allowed object is
         *     {@link ListOfModification }
         *     
         */
        public void setListOfModification(ListOfModification value) {
            this.listOfModification = value;
        }

    }

}
