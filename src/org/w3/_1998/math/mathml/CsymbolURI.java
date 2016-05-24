//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.05.24 at 04:27:51 PM JST 
//


package org.w3._1998.math.mathml;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CsymbolURI.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CsymbolURI">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="http://www.sbml.org/sbml/symbols/time"/>
 *     &lt;enumeration value="http://www.sbml.org/sbml/symbols/delay"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "CsymbolURI")
@XmlEnum
public enum CsymbolURI {

    @XmlEnumValue("http://www.sbml.org/sbml/symbols/time")
    HTTP_WWW_SBML_ORG_SBML_SYMBOLS_TIME("http://www.sbml.org/sbml/symbols/time"),
    @XmlEnumValue("http://www.sbml.org/sbml/symbols/delay")
    HTTP_WWW_SBML_ORG_SBML_SYMBOLS_DELAY("http://www.sbml.org/sbml/symbols/delay");
    private final String value;

    CsymbolURI(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CsymbolURI fromValue(String v) {
        for (CsymbolURI c: CsymbolURI.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
