//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.05.24 at 04:27:51 PM JST 
//


package org.sbml._2001.ns.celldesigner;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * List of internal operators.
 * 
 * <p>Java class for listOfInternalOperatorsInBlockDiagram complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="listOfInternalOperatorsInBlockDiagram">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="internalOperatorInBlockDiagram" type="{http://www.sbml.org/2001/ns/celldesigner}internalOperatorInBlockDiagram" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "listOfInternalOperatorsInBlockDiagram", propOrder = {
    "internalOperatorInBlockDiagram"
})
public class ListOfInternalOperatorsInBlockDiagram {

    protected List<InternalOperatorInBlockDiagram> internalOperatorInBlockDiagram;

    /**
     * Gets the value of the internalOperatorInBlockDiagram property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the internalOperatorInBlockDiagram property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInternalOperatorInBlockDiagram().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link InternalOperatorInBlockDiagram }
     * 
     * 
     */
    public List<InternalOperatorInBlockDiagram> getInternalOperatorInBlockDiagram() {
        if (internalOperatorInBlockDiagram == null) {
            internalOperatorInBlockDiagram = new ArrayList<InternalOperatorInBlockDiagram>();
        }
        return this.internalOperatorInBlockDiagram;
    }

}
