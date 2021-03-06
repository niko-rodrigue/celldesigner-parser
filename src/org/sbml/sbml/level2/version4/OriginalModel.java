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
package org.sbml.sbml.level2.version4;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;

// TODO: Auto-generated Javadoc
/**
 * <p>
 * Java class for Model complex type.
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="Model">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.sbml.org/sbml/level2/version4}SBase">
 *       &lt;sequence>
 *         &lt;element name="listOfFunctionDefinitions" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;extension base="{http://www.sbml.org/sbml/level2/version4}SBase">
 *                 &lt;sequence>
 *                   &lt;element name="functionDefinition" type="{http://www.sbml.org/sbml/level2/version4}FunctionDefinition" maxOccurs="unbounded"/>
 *                 &lt;/sequence>
 *               &lt;/extension>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="listOfUnitDefinitions" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;extension base="{http://www.sbml.org/sbml/level2/version4}SBase">
 *                 &lt;sequence>
 *                   &lt;element name="unitDefinition" type="{http://www.sbml.org/sbml/level2/version4}UnitDefinition" maxOccurs="unbounded"/>
 *                 &lt;/sequence>
 *               &lt;/extension>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="listOfCompartments" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;extension base="{http://www.sbml.org/sbml/level2/version4}SBase">
 *                 &lt;sequence>
 *                   &lt;element name="compartment" type="{http://www.sbml.org/sbml/level2/version4}Compartment" maxOccurs="unbounded"/>
 *                 &lt;/sequence>
 *               &lt;/extension>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="listOfSpecies" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;extension base="{http://www.sbml.org/sbml/level2/version4}SBase">
 *                 &lt;sequence>
 *                   &lt;element name="species" type="{http://www.sbml.org/sbml/level2/version4}Species" maxOccurs="unbounded"/>
 *                 &lt;/sequence>
 *               &lt;/extension>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="listOfParameters" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;extension base="{http://www.sbml.org/sbml/level2/version4}SBase">
 *                 &lt;sequence>
 *                   &lt;element name="parameter" type="{http://www.sbml.org/sbml/level2/version4}Parameter" maxOccurs="unbounded"/>
 *                 &lt;/sequence>
 *               &lt;/extension>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="listOfRules" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;extension base="{http://www.sbml.org/sbml/level2/version4}SBase">
 *                 &lt;choice maxOccurs="unbounded">
 *                   &lt;element name="algebraicRule" type="{http://www.sbml.org/sbml/level2/version4}AlgebraicRule" minOccurs="0"/>
 *                   &lt;element name="assignmentRule" type="{http://www.sbml.org/sbml/level2/version4}AssignmentRule" minOccurs="0"/>
 *                   &lt;element name="rateRule" type="{http://www.sbml.org/sbml/level2/version4}RateRule" minOccurs="0"/>
 *                 &lt;/choice>
 *               &lt;/extension>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="listOfReactions" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;extension base="{http://www.sbml.org/sbml/level2/version4}SBase">
 *                 &lt;sequence>
 *                   &lt;element name="reaction" type="{http://www.sbml.org/sbml/level2/version4}Reaction" maxOccurs="unbounded"/>
 *                 &lt;/sequence>
 *               &lt;/extension>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="listOfEvents" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;extension base="{http://www.sbml.org/sbml/level2/version4}SBase">
 *                 &lt;sequence>
 *                   &lt;element name="event" type="{http://www.sbml.org/sbml/level2/version4}Event" maxOccurs="unbounded"/>
 *                 &lt;/sequence>
 *               &lt;/extension>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *       &lt;attribute name="id" type="{http://www.sbml.org/sbml/level2/version4}SId" />
 *       &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {"listOfFunctionDefinitions",
  "listOfUnitDefinitions", "listOfCompartments", "listOfSpecies",
  "listOfParameters", "listOfRules", "listOfReactions", "listOfEvents"})
@XmlSeeAlso({Model.class})
public class OriginalModel extends SBase {

  /** The list of function definitions. */
  protected OriginalModel.ListOfFunctionDefinitions listOfFunctionDefinitions;
  /** The list of unit definitions. */
  protected OriginalModel.ListOfUnitDefinitions     listOfUnitDefinitions;
  /** The list of compartments. */
  protected OriginalModel.ListOfCompartments        listOfCompartments;
  /** The list of species. */
  protected OriginalModel.ListOfSpecies             listOfSpecies;
  /** The list of parameters. */
  protected OriginalModel.ListOfParameters          listOfParameters;
  /** The list of rules. */
  protected OriginalModel.ListOfRules               listOfRules;
  /** The list of reactions. */
  protected OriginalModel.ListOfReactions           listOfReactions;
  /** The list of events. */
  protected OriginalModel.ListOfEvents              listOfEvents;
  /** The id. */
  @XmlAttribute(name = "id")
  protected String                                  id;
  /** The name. */
  @XmlAttribute(name = "name")
  protected String                                  name;


  /**
   * Gets the value of the listOfFunctionDefinitions property.
   * 
   * @return
   *         possible object is {@link OriginalModel.ListOfFunctionDefinitions }
   */
  public OriginalModel.ListOfFunctionDefinitions getListOfFunctionDefinitions() {
    return listOfFunctionDefinitions;
  }


  /**
   * Sets the value of the listOfFunctionDefinitions property.
   * 
   * @param value
   *        allowed object is {@link OriginalModel.ListOfFunctionDefinitions }
   */
  public void setListOfFunctionDefinitions(
    OriginalModel.ListOfFunctionDefinitions value) {
    this.listOfFunctionDefinitions = value;
  }


  /**
   * Gets the value of the listOfUnitDefinitions property.
   * 
   * @return
   *         possible object is {@link OriginalModel.ListOfUnitDefinitions }
   */
  public OriginalModel.ListOfUnitDefinitions getListOfUnitDefinitions() {
    return listOfUnitDefinitions;
  }


  /**
   * Sets the value of the listOfUnitDefinitions property.
   * 
   * @param value
   *        allowed object is {@link OriginalModel.ListOfUnitDefinitions }
   */
  public void setListOfUnitDefinitions(OriginalModel.ListOfUnitDefinitions value) {
    this.listOfUnitDefinitions = value;
  }


  /**
   * Gets the value of the listOfCompartments property.
   * 
   * @return
   *         possible object is {@link OriginalModel.ListOfCompartments }
   */
  public OriginalModel.ListOfCompartments getListOfCompartments() {
    return listOfCompartments;
  }


  /**
   * Sets the value of the listOfCompartments property.
   * 
   * @param value
   *        allowed object is {@link OriginalModel.ListOfCompartments }
   */
  public void setListOfCompartments(OriginalModel.ListOfCompartments value) {
    this.listOfCompartments = value;
  }


  /**
   * Gets the value of the listOfSpecies property.
   * 
   * @return
   *         possible object is {@link OriginalModel.ListOfSpecies }
   */
  public OriginalModel.ListOfSpecies getListOfSpecies() {
    return listOfSpecies;
  }


  /**
   * Sets the value of the listOfSpecies property.
   * 
   * @param value
   *        allowed object is {@link OriginalModel.ListOfSpecies }
   */
  public void setListOfSpecies(OriginalModel.ListOfSpecies value) {
    this.listOfSpecies = value;
  }


  /**
   * Gets the value of the listOfParameters property.
   * 
   * @return
   *         possible object is {@link OriginalModel.ListOfParameters }
   */
  public OriginalModel.ListOfParameters getListOfParameters() {
    return listOfParameters;
  }


  /**
   * Sets the value of the listOfParameters property.
   * 
   * @param value
   *        allowed object is {@link OriginalModel.ListOfParameters }
   */
  public void setListOfParameters(OriginalModel.ListOfParameters value) {
    this.listOfParameters = value;
  }


  /**
   * Gets the value of the listOfRules property.
   * 
   * @return
   *         possible object is {@link OriginalModel.ListOfRules }
   */
  public OriginalModel.ListOfRules getListOfRules() {
    return listOfRules;
  }


  /**
   * Sets the value of the listOfRules property.
   * 
   * @param value
   *        allowed object is {@link OriginalModel.ListOfRules }
   */
  public void setListOfRules(OriginalModel.ListOfRules value) {
    this.listOfRules = value;
  }


  /**
   * Gets the value of the listOfReactions property.
   * 
   * @return
   *         possible object is {@link OriginalModel.ListOfReactions }
   */
  public OriginalModel.ListOfReactions getListOfReactions() {
    return listOfReactions;
  }


  /**
   * Sets the value of the listOfReactions property.
   * 
   * @param value
   *        allowed object is {@link OriginalModel.ListOfReactions }
   */
  public void setListOfReactions(OriginalModel.ListOfReactions value) {
    this.listOfReactions = value;
  }


  /**
   * Gets the value of the listOfEvents property.
   * 
   * @return
   *         possible object is {@link OriginalModel.ListOfEvents }
   */
  public OriginalModel.ListOfEvents getListOfEvents() {
    return listOfEvents;
  }


  /**
   * Sets the value of the listOfEvents property.
   * 
   * @param value
   *        allowed object is {@link OriginalModel.ListOfEvents }
   */
  public void setListOfEvents(OriginalModel.ListOfEvents value) {
    this.listOfEvents = value;
  }


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
   * <p>
   * Java class for anonymous complex type.
   * <p>
   * The following schema fragment specifies the expected content contained
   * within this class.
   * 
   * <pre>
   * &lt;complexType>
   *   &lt;complexContent>
   *     &lt;extension base="{http://www.sbml.org/sbml/level2/version4}SBase">
   *       &lt;sequence>
   *         &lt;element name="compartment" type="{http://www.sbml.org/sbml/level2/version4}Compartment" maxOccurs="unbounded"/>
   *       &lt;/sequence>
   *     &lt;/extension>
   *   &lt;/complexContent>
   * &lt;/complexType>
   * </pre>
   */
  @XmlAccessorType(XmlAccessType.FIELD)
  @XmlType(name = "", propOrder = {"compartment"})
  public static class ListOfCompartments extends SBase {

    /** The compartment. */
    @XmlElement(required = true)
    protected List<Compartment> compartment;


    /**
     * Gets the value of the compartment property.
     * <p>
     * This accessor method returns a reference to the live list, not a
     * snapshot. Therefore any modification you make to the returned list will
     * be present inside the JAXB object. This is why there is not a
     * <CODE>set</CODE> method for the compartment property.
     * <p>
     * For example, to add a new item, do as follows:
     * 
     * <pre>
     * getCompartment().add(newItem);
     * </pre>
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Compartment }
     *
     * @return the compartment
     */
    public List<Compartment> getCompartment() {
      if (compartment == null) {
        compartment = new ArrayList<Compartment>();
      }
      return this.compartment;
    }
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
   *     &lt;extension base="{http://www.sbml.org/sbml/level2/version4}SBase">
   *       &lt;sequence>
   *         &lt;element name="event" type="{http://www.sbml.org/sbml/level2/version4}Event" maxOccurs="unbounded"/>
   *       &lt;/sequence>
   *     &lt;/extension>
   *   &lt;/complexContent>
   * &lt;/complexType>
   * </pre>
   */
  @XmlAccessorType(XmlAccessType.FIELD)
  @XmlType(name = "", propOrder = {"event"})
  public static class ListOfEvents extends SBase {

    /** The event. */
    @XmlElement(required = true)
    protected List<Event> event;


    /**
     * Gets the value of the event property.
     * <p>
     * This accessor method returns a reference to the live list, not a
     * snapshot. Therefore any modification you make to the returned list will
     * be present inside the JAXB object. This is why there is not a
     * <CODE>set</CODE> method for the event property.
     * <p>
     * For example, to add a new item, do as follows:
     * 
     * <pre>
     * getEvent().add(newItem);
     * </pre>
     * <p>
     * Objects of the following type(s) are allowed in the list {@link Event }
     *
     * @return the event
     */
    public List<Event> getEvent() {
      if (event == null) {
        event = new ArrayList<Event>();
      }
      return this.event;
    }
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
   *     &lt;extension base="{http://www.sbml.org/sbml/level2/version4}SBase">
   *       &lt;sequence>
   *         &lt;element name="functionDefinition" type="{http://www.sbml.org/sbml/level2/version4}FunctionDefinition" maxOccurs="unbounded"/>
   *       &lt;/sequence>
   *     &lt;/extension>
   *   &lt;/complexContent>
   * &lt;/complexType>
   * </pre>
   */
  @XmlAccessorType(XmlAccessType.FIELD)
  @XmlType(name = "", propOrder = {"functionDefinition"})
  public static class ListOfFunctionDefinitions extends SBase {

    /** The function definition. */
    @XmlElement(required = true)
    protected List<FunctionDefinition> functionDefinition;


    /**
     * Gets the value of the functionDefinition property.
     * <p>
     * This accessor method returns a reference to the live list, not a
     * snapshot. Therefore any modification you make to the returned list will
     * be present inside the JAXB object. This is why there is not a
     * <CODE>set</CODE> method for the functionDefinition property.
     * <p>
     * For example, to add a new item, do as follows:
     * 
     * <pre>
     * getFunctionDefinition().add(newItem);
     * </pre>
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FunctionDefinition }
     *
     * @return the function definition
     */
    public List<FunctionDefinition> getFunctionDefinition() {
      if (functionDefinition == null) {
        functionDefinition = new ArrayList<FunctionDefinition>();
      }
      return this.functionDefinition;
    }
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
   *     &lt;extension base="{http://www.sbml.org/sbml/level2/version4}SBase">
   *       &lt;sequence>
   *         &lt;element name="parameter" type="{http://www.sbml.org/sbml/level2/version4}Parameter" maxOccurs="unbounded"/>
   *       &lt;/sequence>
   *     &lt;/extension>
   *   &lt;/complexContent>
   * &lt;/complexType>
   * </pre>
   */
  @XmlAccessorType(XmlAccessType.FIELD)
  @XmlType(name = "", propOrder = {"parameter"})
  public static class ListOfParameters extends SBase {

    /** The parameter. */
    @XmlElement(required = true)
    protected List<Parameter> parameter;


    /**
     * Gets the value of the parameter property.
     * <p>
     * This accessor method returns a reference to the live list, not a
     * snapshot. Therefore any modification you make to the returned list will
     * be present inside the JAXB object. This is why there is not a
     * <CODE>set</CODE> method for the parameter property.
     * <p>
     * For example, to add a new item, do as follows:
     * 
     * <pre>
     * getParameter().add(newItem);
     * </pre>
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Parameter }
     *
     * @return the parameter
     */
    public List<Parameter> getParameter() {
      if (parameter == null) {
        parameter = new ArrayList<Parameter>();
      }
      return this.parameter;
    }
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
   *     &lt;extension base="{http://www.sbml.org/sbml/level2/version4}SBase">
   *       &lt;sequence>
   *         &lt;element name="reaction" type="{http://www.sbml.org/sbml/level2/version4}Reaction" maxOccurs="unbounded"/>
   *       &lt;/sequence>
   *     &lt;/extension>
   *   &lt;/complexContent>
   * &lt;/complexType>
   * </pre>
   */
  @XmlAccessorType(XmlAccessType.FIELD)
  @XmlType(name = "", propOrder = {"reaction"})
  public static class ListOfReactions extends SBase {

    /** The reaction. */
    @XmlElement(required = true)
    protected List<Reaction> reaction;


    /**
     * Gets the value of the reaction property.
     * <p>
     * This accessor method returns a reference to the live list, not a
     * snapshot. Therefore any modification you make to the returned list will
     * be present inside the JAXB object. This is why there is not a
     * <CODE>set</CODE> method for the reaction property.
     * <p>
     * For example, to add a new item, do as follows:
     * 
     * <pre>
     * getReaction().add(newItem);
     * </pre>
     * <p>
     * Objects of the following type(s) are allowed in the list {@link Reaction }
     *
     * @return the reaction
     */
    public List<Reaction> getReaction() {
      if (reaction == null) {
        reaction = new ArrayList<Reaction>();
      }
      return this.reaction;
    }
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
   *     &lt;extension base="{http://www.sbml.org/sbml/level2/version4}SBase">
   *       &lt;choice maxOccurs="unbounded">
   *         &lt;element name="algebraicRule" type="{http://www.sbml.org/sbml/level2/version4}AlgebraicRule" minOccurs="0"/>
   *         &lt;element name="assignmentRule" type="{http://www.sbml.org/sbml/level2/version4}AssignmentRule" minOccurs="0"/>
   *         &lt;element name="rateRule" type="{http://www.sbml.org/sbml/level2/version4}RateRule" minOccurs="0"/>
   *       &lt;/choice>
   *     &lt;/extension>
   *   &lt;/complexContent>
   * &lt;/complexType>
   * </pre>
   */
  @XmlAccessorType(XmlAccessType.FIELD)
  @XmlType(name = "", propOrder = {"algebraicRuleOrAssignmentRuleOrRateRule"})
  public static class ListOfRules extends SBase {

    /** The algebraic rule or assignment rule or rate rule. */
    @XmlElements({
      @XmlElement(name = "algebraicRule", type = AlgebraicRule.class),
      @XmlElement(name = "assignmentRule", type = AssignmentRule.class),
      @XmlElement(name = "rateRule", type = RateRule.class)})
    protected List<Rule> algebraicRuleOrAssignmentRuleOrRateRule;


    /**
     * Gets the value of the algebraicRuleOrAssignmentRuleOrRateRule property.
     * <p>
     * This accessor method returns a reference to the live list, not a
     * snapshot. Therefore any modification you make to the returned list will
     * be present inside the JAXB object. This is why there is not a
     * <CODE>set</CODE> method for the algebraicRuleOrAssignmentRuleOrRateRule
     * property.
     * <p>
     * For example, to add a new item, do as follows:
     * 
     * <pre>
     * getAlgebraicRuleOrAssignmentRuleOrRateRule().add(newItem);
     * </pre>
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AlgebraicRule } {@link AssignmentRule } {@link RateRule }
     *
     * @return the algebraic rule or assignment rule or rate rule
     */
    public List<Rule> getAlgebraicRuleOrAssignmentRuleOrRateRule() {
      if (algebraicRuleOrAssignmentRuleOrRateRule == null) {
        algebraicRuleOrAssignmentRuleOrRateRule = new ArrayList<Rule>();
      }
      return this.algebraicRuleOrAssignmentRuleOrRateRule;
    }
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
   *     &lt;extension base="{http://www.sbml.org/sbml/level2/version4}SBase">
   *       &lt;sequence>
   *         &lt;element name="species" type="{http://www.sbml.org/sbml/level2/version4}Species" maxOccurs="unbounded"/>
   *       &lt;/sequence>
   *     &lt;/extension>
   *   &lt;/complexContent>
   * &lt;/complexType>
   * </pre>
   */
  @XmlAccessorType(XmlAccessType.FIELD)
  @XmlType(name = "", propOrder = {"species"})
  public static class ListOfSpecies extends SBase {

    /** The species. */
    @XmlElement(required = true)
    protected List<Species> species;


    /**
     * Gets the value of the species property.
     * <p>
     * This accessor method returns a reference to the live list, not a
     * snapshot. Therefore any modification you make to the returned list will
     * be present inside the JAXB object. This is why there is not a
     * <CODE>set</CODE> method for the species property.
     * <p>
     * For example, to add a new item, do as follows:
     * 
     * <pre>
     * getSpecies().add(newItem);
     * </pre>
     * <p>
     * Objects of the following type(s) are allowed in the list {@link Species }
     *
     * @return the species
     */
    public List<Species> getSpecies() {
      if (species == null) {
        species = new ArrayList<Species>();
      }
      return this.species;
    }
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
   *     &lt;extension base="{http://www.sbml.org/sbml/level2/version4}SBase">
   *       &lt;sequence>
   *         &lt;element name="unitDefinition" type="{http://www.sbml.org/sbml/level2/version4}UnitDefinition" maxOccurs="unbounded"/>
   *       &lt;/sequence>
   *     &lt;/extension>
   *   &lt;/complexContent>
   * &lt;/complexType>
   * </pre>
   */
  @XmlAccessorType(XmlAccessType.FIELD)
  @XmlType(name = "", propOrder = {"unitDefinition"})
  public static class ListOfUnitDefinitions extends SBase {

    /** The unit definition. */
    @XmlElement(required = true)
    protected List<UnitDefinition> unitDefinition;


    /**
     * Gets the value of the unitDefinition property.
     * <p>
     * This accessor method returns a reference to the live list, not a
     * snapshot. Therefore any modification you make to the returned list will
     * be present inside the JAXB object. This is why there is not a
     * <CODE>set</CODE> method for the unitDefinition property.
     * <p>
     * For example, to add a new item, do as follows:
     * 
     * <pre>
     * getUnitDefinition().add(newItem);
     * </pre>
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link UnitDefinition }
     *
     * @return the unit definition
     */
    public List<UnitDefinition> getUnitDefinition() {
      if (unitDefinition == null) {
        unitDefinition = new ArrayList<UnitDefinition>();
      }
      return this.unitDefinition;
    }
  }
}
