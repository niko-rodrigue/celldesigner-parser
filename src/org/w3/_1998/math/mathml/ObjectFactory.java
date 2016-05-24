//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.05.24 at 04:27:51 PM JST 
//


package org.w3._1998.math.mathml;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.w3._1998.math.mathml package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _CnSep_QNAME = new QName("http://www.w3.org/1998/Math/MathML", "sep");
    private final static QName _Math_QNAME = new QName("http://www.w3.org/1998/Math/MathML", "math");
    private final static QName _ApplyNotanumber_QNAME = new QName("http://www.w3.org/1998/Math/MathML", "notanumber");
    private final static QName _ApplyApply_QNAME = new QName("http://www.w3.org/1998/Math/MathML", "apply");
    private final static QName _ApplyCsymbol_QNAME = new QName("http://www.w3.org/1998/Math/MathML", "csymbol");
    private final static QName _ApplySemantics_QNAME = new QName("http://www.w3.org/1998/Math/MathML", "semantics");
    private final static QName _ApplyCn_QNAME = new QName("http://www.w3.org/1998/Math/MathML", "cn");
    private final static QName _ApplyPiecewise_QNAME = new QName("http://www.w3.org/1998/Math/MathML", "piecewise");
    private final static QName _ApplyCi_QNAME = new QName("http://www.w3.org/1998/Math/MathML", "ci");
    private final static QName _ApplyFalse_QNAME = new QName("http://www.w3.org/1998/Math/MathML", "false");
    private final static QName _ApplyTrue_QNAME = new QName("http://www.w3.org/1998/Math/MathML", "true");
    private final static QName _ApplyInfinity_QNAME = new QName("http://www.w3.org/1998/Math/MathML", "infinity");
    private final static QName _ApplyExponentiale_QNAME = new QName("http://www.w3.org/1998/Math/MathML", "exponentiale");
    private final static QName _ApplyPi_QNAME = new QName("http://www.w3.org/1998/Math/MathML", "pi");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.w3._1998.math.mathml
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Math }
     * 
     */
    public Math createMath() {
        return new Math();
    }

    /**
     * Create an instance of {@link SepType }
     * 
     */
    public SepType createSepType() {
        return new SepType();
    }

    /**
     * Create an instance of {@link Piecewise }
     * 
     */
    public Piecewise createPiecewise() {
        return new Piecewise();
    }

    /**
     * Create an instance of {@link Otherwise }
     * 
     */
    public Otherwise createOtherwise() {
        return new Otherwise();
    }

    /**
     * Create an instance of {@link Semantics }
     * 
     */
    public Semantics createSemantics() {
        return new Semantics();
    }

    /**
     * Create an instance of {@link MathBase }
     * 
     */
    public MathBase createMathBase() {
        return new MathBase();
    }

    /**
     * Create an instance of {@link Bvar }
     * 
     */
    public Bvar createBvar() {
        return new Bvar();
    }

    /**
     * Create an instance of {@link Csymbol }
     * 
     */
    public Csymbol createCsymbol() {
        return new Csymbol();
    }

    /**
     * Create an instance of {@link Cn }
     * 
     */
    public Cn createCn() {
        return new Cn();
    }

    /**
     * Create an instance of {@link AnnotationXml }
     * 
     */
    public AnnotationXml createAnnotationXml() {
        return new AnnotationXml();
    }

    /**
     * Create an instance of {@link NodeContainer }
     * 
     */
    public NodeContainer createNodeContainer() {
        return new NodeContainer();
    }

    /**
     * Create an instance of {@link Annotation }
     * 
     */
    public Annotation createAnnotation() {
        return new Annotation();
    }

    /**
     * Create an instance of {@link Piece }
     * 
     */
    public Piece createPiece() {
        return new Piece();
    }

    /**
     * Create an instance of {@link Apply }
     * 
     */
    public Apply createApply() {
        return new Apply();
    }

    /**
     * Create an instance of {@link Lambda }
     * 
     */
    public Lambda createLambda() {
        return new Lambda();
    }

    /**
     * Create an instance of {@link Ci }
     * 
     */
    public Ci createCi() {
        return new Ci();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SepType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.w3.org/1998/Math/MathML", name = "sep", scope = Cn.class)
    public JAXBElement<SepType> createCnSep(SepType value) {
        return new JAXBElement<SepType>(_CnSep_QNAME, SepType.class, Cn.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Math }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.w3.org/1998/Math/MathML", name = "math")
    public JAXBElement<Math> createMath(Math value) {
        return new JAXBElement<Math>(_Math_QNAME, Math.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MathBase }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.w3.org/1998/Math/MathML", name = "notanumber", scope = Apply.class)
    public JAXBElement<MathBase> createApplyNotanumber(MathBase value) {
        return new JAXBElement<MathBase>(_ApplyNotanumber_QNAME, MathBase.class, Apply.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Apply }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.w3.org/1998/Math/MathML", name = "apply", scope = Apply.class)
    public JAXBElement<Apply> createApplyApply(Apply value) {
        return new JAXBElement<Apply>(_ApplyApply_QNAME, Apply.class, Apply.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Csymbol }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.w3.org/1998/Math/MathML", name = "csymbol", scope = Apply.class)
    public JAXBElement<Csymbol> createApplyCsymbol(Csymbol value) {
        return new JAXBElement<Csymbol>(_ApplyCsymbol_QNAME, Csymbol.class, Apply.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Semantics }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.w3.org/1998/Math/MathML", name = "semantics", scope = Apply.class)
    public JAXBElement<Semantics> createApplySemantics(Semantics value) {
        return new JAXBElement<Semantics>(_ApplySemantics_QNAME, Semantics.class, Apply.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Cn }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.w3.org/1998/Math/MathML", name = "cn", scope = Apply.class)
    public JAXBElement<Cn> createApplyCn(Cn value) {
        return new JAXBElement<Cn>(_ApplyCn_QNAME, Cn.class, Apply.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Piecewise }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.w3.org/1998/Math/MathML", name = "piecewise", scope = Apply.class)
    public JAXBElement<Piecewise> createApplyPiecewise(Piecewise value) {
        return new JAXBElement<Piecewise>(_ApplyPiecewise_QNAME, Piecewise.class, Apply.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Ci }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.w3.org/1998/Math/MathML", name = "ci", scope = Apply.class)
    public JAXBElement<Ci> createApplyCi(Ci value) {
        return new JAXBElement<Ci>(_ApplyCi_QNAME, Ci.class, Apply.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MathBase }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.w3.org/1998/Math/MathML", name = "false", scope = Apply.class)
    public JAXBElement<MathBase> createApplyFalse(MathBase value) {
        return new JAXBElement<MathBase>(_ApplyFalse_QNAME, MathBase.class, Apply.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MathBase }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.w3.org/1998/Math/MathML", name = "true", scope = Apply.class)
    public JAXBElement<MathBase> createApplyTrue(MathBase value) {
        return new JAXBElement<MathBase>(_ApplyTrue_QNAME, MathBase.class, Apply.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MathBase }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.w3.org/1998/Math/MathML", name = "infinity", scope = Apply.class)
    public JAXBElement<MathBase> createApplyInfinity(MathBase value) {
        return new JAXBElement<MathBase>(_ApplyInfinity_QNAME, MathBase.class, Apply.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MathBase }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.w3.org/1998/Math/MathML", name = "exponentiale", scope = Apply.class)
    public JAXBElement<MathBase> createApplyExponentiale(MathBase value) {
        return new JAXBElement<MathBase>(_ApplyExponentiale_QNAME, MathBase.class, Apply.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MathBase }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.w3.org/1998/Math/MathML", name = "pi", scope = Apply.class)
    public JAXBElement<MathBase> createApplyPi(MathBase value) {
        return new JAXBElement<MathBase>(_ApplyPi_QNAME, MathBase.class, Apply.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MathBase }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.w3.org/1998/Math/MathML", name = "notanumber", scope = Piece.class)
    public JAXBElement<MathBase> createPieceNotanumber(MathBase value) {
        return new JAXBElement<MathBase>(_ApplyNotanumber_QNAME, MathBase.class, Piece.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Apply }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.w3.org/1998/Math/MathML", name = "apply", scope = Piece.class)
    public JAXBElement<Apply> createPieceApply(Apply value) {
        return new JAXBElement<Apply>(_ApplyApply_QNAME, Apply.class, Piece.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Csymbol }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.w3.org/1998/Math/MathML", name = "csymbol", scope = Piece.class)
    public JAXBElement<Csymbol> createPieceCsymbol(Csymbol value) {
        return new JAXBElement<Csymbol>(_ApplyCsymbol_QNAME, Csymbol.class, Piece.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Semantics }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.w3.org/1998/Math/MathML", name = "semantics", scope = Piece.class)
    public JAXBElement<Semantics> createPieceSemantics(Semantics value) {
        return new JAXBElement<Semantics>(_ApplySemantics_QNAME, Semantics.class, Piece.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Cn }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.w3.org/1998/Math/MathML", name = "cn", scope = Piece.class)
    public JAXBElement<Cn> createPieceCn(Cn value) {
        return new JAXBElement<Cn>(_ApplyCn_QNAME, Cn.class, Piece.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Piecewise }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.w3.org/1998/Math/MathML", name = "piecewise", scope = Piece.class)
    public JAXBElement<Piecewise> createPiecePiecewise(Piecewise value) {
        return new JAXBElement<Piecewise>(_ApplyPiecewise_QNAME, Piecewise.class, Piece.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Ci }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.w3.org/1998/Math/MathML", name = "ci", scope = Piece.class)
    public JAXBElement<Ci> createPieceCi(Ci value) {
        return new JAXBElement<Ci>(_ApplyCi_QNAME, Ci.class, Piece.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MathBase }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.w3.org/1998/Math/MathML", name = "false", scope = Piece.class)
    public JAXBElement<MathBase> createPieceFalse(MathBase value) {
        return new JAXBElement<MathBase>(_ApplyFalse_QNAME, MathBase.class, Piece.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MathBase }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.w3.org/1998/Math/MathML", name = "true", scope = Piece.class)
    public JAXBElement<MathBase> createPieceTrue(MathBase value) {
        return new JAXBElement<MathBase>(_ApplyTrue_QNAME, MathBase.class, Piece.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MathBase }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.w3.org/1998/Math/MathML", name = "infinity", scope = Piece.class)
    public JAXBElement<MathBase> createPieceInfinity(MathBase value) {
        return new JAXBElement<MathBase>(_ApplyInfinity_QNAME, MathBase.class, Piece.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MathBase }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.w3.org/1998/Math/MathML", name = "exponentiale", scope = Piece.class)
    public JAXBElement<MathBase> createPieceExponentiale(MathBase value) {
        return new JAXBElement<MathBase>(_ApplyExponentiale_QNAME, MathBase.class, Piece.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MathBase }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.w3.org/1998/Math/MathML", name = "pi", scope = Piece.class)
    public JAXBElement<MathBase> createPiecePi(MathBase value) {
        return new JAXBElement<MathBase>(_ApplyPi_QNAME, MathBase.class, Piece.class, value);
    }

}
