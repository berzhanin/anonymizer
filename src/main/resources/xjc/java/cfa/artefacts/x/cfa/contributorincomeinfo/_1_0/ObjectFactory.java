
package cfa.artefacts.x.cfa.contributorincomeinfo._1_0;

import javax.xml.namespace.QName;
import jakarta.annotation.Generated;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the cfa.artefacts.x.cfa.contributorincomeinfo._1_0 package. 
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

    private static final QName _ContributorsIncomeInfoRequest_QNAME = new QName("urn://x-artefacts-cfa/CFA/contributorIncomeInfo/1.0.0", "contributorsIncomeInfoRequest");
    private static final QName _ContributorsIncomeInfoResponse_QNAME = new QName("urn://x-artefacts-cfa/CFA/contributorIncomeInfo/1.0.0", "contributorsIncomeInfoResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: cfa.artefacts.x.cfa.contributorincomeinfo._1_0
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ContributorsIncomeInfoRequestType }
     * 
     */
    public ContributorsIncomeInfoRequestType createContributorsIncomeInfoRequestType() {
        return new ContributorsIncomeInfoRequestType();
    }

    /**
     * Create an instance of {@link ContributorsIncomeInfoResponseType }
     * 
     */
    public ContributorsIncomeInfoResponseType createContributorsIncomeInfoResponseType() {
        return new ContributorsIncomeInfoResponseType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ContributorsIncomeInfoRequestType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ContributorsIncomeInfoRequestType }{@code >}
     */
    @XmlElementDecl(namespace = "urn://x-artefacts-cfa/CFA/contributorIncomeInfo/1.0.0", name = "contributorsIncomeInfoRequest")
    public JAXBElement<ContributorsIncomeInfoRequestType> createContributorsIncomeInfoRequest(ContributorsIncomeInfoRequestType value) {
        return new JAXBElement<>(_ContributorsIncomeInfoRequest_QNAME, ContributorsIncomeInfoRequestType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ContributorsIncomeInfoResponseType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ContributorsIncomeInfoResponseType }{@code >}
     */
    @XmlElementDecl(namespace = "urn://x-artefacts-cfa/CFA/contributorIncomeInfo/1.0.0", name = "contributorsIncomeInfoResponse")
    public JAXBElement<ContributorsIncomeInfoResponseType> createContributorsIncomeInfoResponse(ContributorsIncomeInfoResponseType value) {
        return new JAXBElement<>(_ContributorsIncomeInfoResponse_QNAME, ContributorsIncomeInfoResponseType.class, null, value);
    }

}
