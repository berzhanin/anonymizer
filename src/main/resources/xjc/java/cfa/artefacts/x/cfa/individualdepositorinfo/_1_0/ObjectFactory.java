
package cfa.artefacts.x.cfa.individualdepositorinfo._1_0;

import javax.xml.namespace.QName;
import jakarta.annotation.Generated;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the cfa.artefacts.x.cfa.individualdepositorinfo._1_0 package. 
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
@Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.2", date = "2024-04-09T12:49:50+03:00")
public class ObjectFactory {

    private static final QName _IndividualDepositorInfoRequest_QNAME = new QName("urn://x-artefacts-cfa/CFA/individualDepositorInfo/1.0.0", "individualDepositorInfoRequest");
    private static final QName _IndividualDepositorInfoResponse_QNAME = new QName("urn://x-artefacts-cfa/CFA/individualDepositorInfo/1.0.0", "individualDepositorInfoResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: cfa.artefacts.x.cfa.individualdepositorinfo._1_0
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link IndividualDepositorInfoRequestType }
     * 
     */
    public IndividualDepositorInfoRequestType createIndividualDepositorInfoRequestType() {
        return new IndividualDepositorInfoRequestType();
    }

    /**
     * Create an instance of {@link IndividualDepositorInfoResponseType }
     * 
     */
    public IndividualDepositorInfoResponseType createIndividualDepositorInfoResponseType() {
        return new IndividualDepositorInfoResponseType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IndividualDepositorInfoRequestType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link IndividualDepositorInfoRequestType }{@code >}
     */
    @XmlElementDecl(namespace = "urn://x-artefacts-cfa/CFA/individualDepositorInfo/1.0.0", name = "individualDepositorInfoRequest")
    public JAXBElement<IndividualDepositorInfoRequestType> createIndividualDepositorInfoRequest(IndividualDepositorInfoRequestType value) {
        return new JAXBElement<>(_IndividualDepositorInfoRequest_QNAME, IndividualDepositorInfoRequestType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IndividualDepositorInfoResponseType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link IndividualDepositorInfoResponseType }{@code >}
     */
    @XmlElementDecl(namespace = "urn://x-artefacts-cfa/CFA/individualDepositorInfo/1.0.0", name = "individualDepositorInfoResponse")
    public JAXBElement<IndividualDepositorInfoResponseType> createIndividualDepositorInfoResponse(IndividualDepositorInfoResponseType value) {
        return new JAXBElement<>(_IndividualDepositorInfoResponse_QNAME, IndividualDepositorInfoResponseType.class, null, value);
    }

}
