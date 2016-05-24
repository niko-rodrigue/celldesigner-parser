//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.05.24 at 04:27:51 PM JST 
//


package org.w3._1998.math.mathml;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Semantics complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Semantics">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.w3.org/1998/Math/MathML}MathBase">
 *       &lt;sequence>
 *         &lt;choice>
 *           &lt;group ref="{http://www.w3.org/1998/Math/MathML}Node"/>
 *           &lt;element name="lambda" type="{http://www.w3.org/1998/Math/MathML}Lambda"/>
 *         &lt;/choice>
 *         &lt;sequence maxOccurs="unbounded">
 *           &lt;choice>
 *             &lt;element name="annotation" type="{http://www.w3.org/1998/Math/MathML}Annotation"/>
 *             &lt;element name="annotation-xml" type="{http://www.w3.org/1998/Math/MathML}Annotation-xml"/>
 *           &lt;/choice>
 *         &lt;/sequence>
 *       &lt;/sequence>
 *       &lt;attribute name="definitionURL" type="{http://www.w3.org/2001/XMLSchema}anyURI" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Semantics", propOrder = {
    "apply",
    "cn",
    "ci",
    "csymbol",
    "_true",
    "_false",
    "notanumber",
    "pi",
    "infinity",
    "exponentiale",
    "semantics",
    "piecewise",
    "lambda",
    "annotationOrAnnotationXml"
})
public class Semantics
    extends MathBase
{

    protected Apply apply;
    protected Cn cn;
    protected Ci ci;
    protected Csymbol csymbol;
    @XmlElement(name = "true")
    protected MathBase _true;
    @XmlElement(name = "false")
    protected MathBase _false;
    protected MathBase notanumber;
    protected MathBase pi;
    protected MathBase infinity;
    protected MathBase exponentiale;
    protected Semantics semantics;
    protected Piecewise piecewise;
    protected Lambda lambda;
    @XmlElements({
        @XmlElement(name = "annotation", type = Annotation.class),
        @XmlElement(name = "annotation-xml", type = AnnotationXml.class)
    })
    protected List<Object> annotationOrAnnotationXml;
    @XmlAttribute(name = "definitionURL")
    @XmlSchemaType(name = "anyURI")
    protected String definitionURL;

    /**
     * Gets the value of the apply property.
     * 
     * @return
     *     possible object is
     *     {@link Apply }
     *     
     */
    public Apply getApply() {
        return apply;
    }

    /**
     * Sets the value of the apply property.
     * 
     * @param value
     *     allowed object is
     *     {@link Apply }
     *     
     */
    public void setApply(Apply value) {
        this.apply = value;
    }

    /**
     * Gets the value of the cn property.
     * 
     * @return
     *     possible object is
     *     {@link Cn }
     *     
     */
    public Cn getCn() {
        return cn;
    }

    /**
     * Sets the value of the cn property.
     * 
     * @param value
     *     allowed object is
     *     {@link Cn }
     *     
     */
    public void setCn(Cn value) {
        this.cn = value;
    }

    /**
     * Gets the value of the ci property.
     * 
     * @return
     *     possible object is
     *     {@link Ci }
     *     
     */
    public Ci getCi() {
        return ci;
    }

    /**
     * Sets the value of the ci property.
     * 
     * @param value
     *     allowed object is
     *     {@link Ci }
     *     
     */
    public void setCi(Ci value) {
        this.ci = value;
    }

    /**
     * Gets the value of the csymbol property.
     * 
     * @return
     *     possible object is
     *     {@link Csymbol }
     *     
     */
    public Csymbol getCsymbol() {
        return csymbol;
    }

    /**
     * Sets the value of the csymbol property.
     * 
     * @param value
     *     allowed object is
     *     {@link Csymbol }
     *     
     */
    public void setCsymbol(Csymbol value) {
        this.csymbol = value;
    }

    /**
     * Gets the value of the true property.
     * 
     * @return
     *     possible object is
     *     {@link MathBase }
     *     
     */
    public MathBase getTrue() {
        return _true;
    }

    /**
     * Sets the value of the true property.
     * 
     * @param value
     *     allowed object is
     *     {@link MathBase }
     *     
     */
    public void setTrue(MathBase value) {
        this._true = value;
    }

    /**
     * Gets the value of the false property.
     * 
     * @return
     *     possible object is
     *     {@link MathBase }
     *     
     */
    public MathBase getFalse() {
        return _false;
    }

    /**
     * Sets the value of the false property.
     * 
     * @param value
     *     allowed object is
     *     {@link MathBase }
     *     
     */
    public void setFalse(MathBase value) {
        this._false = value;
    }

    /**
     * Gets the value of the notanumber property.
     * 
     * @return
     *     possible object is
     *     {@link MathBase }
     *     
     */
    public MathBase getNotanumber() {
        return notanumber;
    }

    /**
     * Sets the value of the notanumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link MathBase }
     *     
     */
    public void setNotanumber(MathBase value) {
        this.notanumber = value;
    }

    /**
     * Gets the value of the pi property.
     * 
     * @return
     *     possible object is
     *     {@link MathBase }
     *     
     */
    public MathBase getPi() {
        return pi;
    }

    /**
     * Sets the value of the pi property.
     * 
     * @param value
     *     allowed object is
     *     {@link MathBase }
     *     
     */
    public void setPi(MathBase value) {
        this.pi = value;
    }

    /**
     * Gets the value of the infinity property.
     * 
     * @return
     *     possible object is
     *     {@link MathBase }
     *     
     */
    public MathBase getInfinity() {
        return infinity;
    }

    /**
     * Sets the value of the infinity property.
     * 
     * @param value
     *     allowed object is
     *     {@link MathBase }
     *     
     */
    public void setInfinity(MathBase value) {
        this.infinity = value;
    }

    /**
     * Gets the value of the exponentiale property.
     * 
     * @return
     *     possible object is
     *     {@link MathBase }
     *     
     */
    public MathBase getExponentiale() {
        return exponentiale;
    }

    /**
     * Sets the value of the exponentiale property.
     * 
     * @param value
     *     allowed object is
     *     {@link MathBase }
     *     
     */
    public void setExponentiale(MathBase value) {
        this.exponentiale = value;
    }

    /**
     * Gets the value of the semantics property.
     * 
     * @return
     *     possible object is
     *     {@link Semantics }
     *     
     */
    public Semantics getSemantics() {
        return semantics;
    }

    /**
     * Sets the value of the semantics property.
     * 
     * @param value
     *     allowed object is
     *     {@link Semantics }
     *     
     */
    public void setSemantics(Semantics value) {
        this.semantics = value;
    }

    /**
     * Gets the value of the piecewise property.
     * 
     * @return
     *     possible object is
     *     {@link Piecewise }
     *     
     */
    public Piecewise getPiecewise() {
        return piecewise;
    }

    /**
     * Sets the value of the piecewise property.
     * 
     * @param value
     *     allowed object is
     *     {@link Piecewise }
     *     
     */
    public void setPiecewise(Piecewise value) {
        this.piecewise = value;
    }

    /**
     * Gets the value of the lambda property.
     * 
     * @return
     *     possible object is
     *     {@link Lambda }
     *     
     */
    public Lambda getLambda() {
        return lambda;
    }

    /**
     * Sets the value of the lambda property.
     * 
     * @param value
     *     allowed object is
     *     {@link Lambda }
     *     
     */
    public void setLambda(Lambda value) {
        this.lambda = value;
    }

    /**
     * Gets the value of the annotationOrAnnotationXml property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the annotationOrAnnotationXml property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAnnotationOrAnnotationXml().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Annotation }
     * {@link AnnotationXml }
     * 
     * 
     */
    public List<Object> getAnnotationOrAnnotationXml() {
        if (annotationOrAnnotationXml == null) {
            annotationOrAnnotationXml = new ArrayList<Object>();
        }
        return this.annotationOrAnnotationXml;
    }

    /**
     * Gets the value of the definitionURL property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDefinitionURL() {
        return definitionURL;
    }

    /**
     * Sets the value of the definitionURL property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDefinitionURL(String value) {
        this.definitionURL = value;
    }

}
