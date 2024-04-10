
package cfa.artefacts.x.cfa.reportadditionalcontributions._1_0;

import javax.xml.namespace.QName;
import jakarta.annotation.Generated;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the cfa.artefacts.x.cfa.reportadditionalcontributions._1_0 package. 
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

    private static final QName _ReportAdditionalContributionsRequest_QNAME = new QName("urn://x-artefacts-cfa/CFA/reportAdditionalContributions/1.0.0", "reportAdditionalContributionsRequest");
    private static final QName _ReportAdditionalContributionsResponse_QNAME = new QName("urn://x-artefacts-cfa/CFA/reportAdditionalContributions/1.0.0", "reportAdditionalContributionsResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: cfa.artefacts.x.cfa.reportadditionalcontributions._1_0
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ReportAdditionalContributionsRequestType }
     * 
     */
    public ReportAdditionalContributionsRequestType createReportAdditionalContributionsRequestType() {
        return new ReportAdditionalContributionsRequestType();
    }

    /**
     * Create an instance of {@link ReportAdditionalContributionsResponseType }
     * 
     */
    public ReportAdditionalContributionsResponseType createReportAdditionalContributionsResponseType() {
        return new ReportAdditionalContributionsResponseType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReportAdditionalContributionsRequestType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ReportAdditionalContributionsRequestType }{@code >}
     */
    @XmlElementDecl(namespace = "urn://x-artefacts-cfa/CFA/reportAdditionalContributions/1.0.0", name = "reportAdditionalContributionsRequest")
    public JAXBElement<ReportAdditionalContributionsRequestType> createReportAdditionalContributionsRequest(ReportAdditionalContributionsRequestType value) {
        return new JAXBElement<>(_ReportAdditionalContributionsRequest_QNAME, ReportAdditionalContributionsRequestType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReportAdditionalContributionsResponseType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ReportAdditionalContributionsResponseType }{@code >}
     */
    @XmlElementDecl(namespace = "urn://x-artefacts-cfa/CFA/reportAdditionalContributions/1.0.0", name = "reportAdditionalContributionsResponse")
    public JAXBElement<ReportAdditionalContributionsResponseType> createReportAdditionalContributionsResponse(ReportAdditionalContributionsResponseType value) {
        return new JAXBElement<>(_ReportAdditionalContributionsResponse_QNAME, ReportAdditionalContributionsResponseType.class, null, value);
    }

}
