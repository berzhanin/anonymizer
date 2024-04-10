
package cfa.artefacts.x.cfa_projects_individual_depositor_commons._1_0;

import javax.xml.namespace.QName;
import jakarta.annotation.Generated;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the cfa.artefacts.x.cfa_projects_individual_depositor_commons._1_0 package. 
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

    private static final QName _ResponseInfoTypeIndividualDepositorSNILS_QNAME = new QName("urn://x-artefacts-cfa/cfa-projects-individual-depositor-commons/1.0.0", "individualDepositorSNILS");
    private static final QName _ResponseInfoTypeRejectionReason_QNAME = new QName("urn://x-artefacts-cfa/cfa-projects-individual-depositor-commons/1.0.0", "rejectionReason");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: cfa.artefacts.x.cfa_projects_individual_depositor_commons._1_0
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link DepositContributionInfoType }
     * 
     */
    public DepositContributionInfoType createDepositContributionInfoType() {
        return new DepositContributionInfoType();
    }

    /**
     * Create an instance of {@link DepositContributionInfoType.LongTermSavingsInfo }
     * 
     */
    public DepositContributionInfoType.LongTermSavingsInfo createDepositContributionInfoTypeLongTermSavingsInfo() {
        return new DepositContributionInfoType.LongTermSavingsInfo();
    }

    /**
     * Create an instance of {@link ResponseInfoType }
     * 
     */
    public ResponseInfoType createResponseInfoType() {
        return new ResponseInfoType();
    }

    /**
     * Create an instance of {@link DepositContributionInfoType.LongTermSavingsInfo.IndividualDepositor }
     * 
     */
    public DepositContributionInfoType.LongTermSavingsInfo.IndividualDepositor createDepositContributionInfoTypeLongTermSavingsInfoIndividualDepositor() {
        return new DepositContributionInfoType.LongTermSavingsInfo.IndividualDepositor();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "urn://x-artefacts-cfa/cfa-projects-individual-depositor-commons/1.0.0", name = "individualDepositorSNILS", scope = ResponseInfoType.class)
    public JAXBElement<String> createResponseInfoTypeIndividualDepositorSNILS(String value) {
        return new JAXBElement<>(_ResponseInfoTypeIndividualDepositorSNILS_QNAME, String.class, ResponseInfoType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "urn://x-artefacts-cfa/cfa-projects-individual-depositor-commons/1.0.0", name = "rejectionReason", scope = ResponseInfoType.class)
    public JAXBElement<String> createResponseInfoTypeRejectionReason(String value) {
        return new JAXBElement<>(_ResponseInfoTypeRejectionReason_QNAME, String.class, ResponseInfoType.class, value);
    }

}
