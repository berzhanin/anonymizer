
package cfa.artefacts.x.cfa_projects_additional_contributions_commons._1_0;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.annotation.Generated;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * јтрибуты сущности "—ведени€ о расчете размера дополнительных стимулирующих взносов в отношении вкладчиков Ц физических лиц по договорам долгосрочных сбережений"
 * 
 * <p>Java class for additionalContributionsCalcNPFType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="additionalContributionsCalcNPFType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;group ref="{urn://x-artefacts-cfa/cfa-projects-additional-contributions-commons/1.0.0}nonGovPensionFundInfo-ModelGroup"/&gt;
 *         &lt;element name="reportingYear" type="{urn://x-artefacts-cfa/cfa-projects-additional-contributions-commons/1.0.0}reportingYearType"/&gt;
 *         &lt;element name="individualDepositorOrderId" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="additionalContributionsAmount" maxOccurs="unbounded"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;group ref="{urn://x-artefacts-cfa/cfa-projects-additional-contributions-commons/1.0.0}physicalPersonIdentificationInformation-ModelGroup"/&gt;
 *                   &lt;element name="amountContributiuon" type="{urn://x-artefacts-cfa/cfa-projects-additional-contributions-commons/1.0.0}decimal-38"/&gt;
 *                   &lt;element name="explanationContribution" type="{urn://x-artefacts-cfa/cfa-projects-additional-contributions-commons/1.0.0}explanationContributionType" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "additionalContributionsCalcNPFType", propOrder = {
    "fundOGRN",
    "fundINN",
    "reportingYear",
    "individualDepositorOrderId",
    "additionalContributionsAmount"
})
@Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.2", date = "2024-04-09T12:49:50+03:00")
public class AdditionalContributionsCalcNPFType {

    @XmlElement(required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.2", date = "2024-04-09T12:49:50+03:00")
    protected String fundOGRN;
    @XmlElement(required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.2", date = "2024-04-09T12:49:50+03:00")
    protected String fundINN;
    @XmlElement(required = true)
    @XmlSchemaType(name = "gYear")
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.2", date = "2024-04-09T12:49:50+03:00")
    protected XMLGregorianCalendar reportingYear;
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.2", date = "2024-04-09T12:49:50+03:00")
    protected long individualDepositorOrderId;
    @XmlElement(required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.2", date = "2024-04-09T12:49:50+03:00")
    protected List<AdditionalContributionsCalcNPFType.AdditionalContributionsAmount> additionalContributionsAmount;

    /**
     * Gets the value of the fundOGRN property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.2", date = "2024-04-09T12:49:50+03:00")
    public String getFundOGRN() {
        return fundOGRN;
    }

    /**
     * Sets the value of the fundOGRN property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.2", date = "2024-04-09T12:49:50+03:00")
    public void setFundOGRN(String value) {
        this.fundOGRN = value;
    }

    /**
     * Gets the value of the fundINN property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.2", date = "2024-04-09T12:49:50+03:00")
    public String getFundINN() {
        return fundINN;
    }

    /**
     * Sets the value of the fundINN property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.2", date = "2024-04-09T12:49:50+03:00")
    public void setFundINN(String value) {
        this.fundINN = value;
    }

    /**
     * Gets the value of the reportingYear property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.2", date = "2024-04-09T12:49:50+03:00")
    public XMLGregorianCalendar getReportingYear() {
        return reportingYear;
    }

    /**
     * Sets the value of the reportingYear property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.2", date = "2024-04-09T12:49:50+03:00")
    public void setReportingYear(XMLGregorianCalendar value) {
        this.reportingYear = value;
    }

    /**
     * Gets the value of the individualDepositorOrderId property.
     * 
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.2", date = "2024-04-09T12:49:50+03:00")
    public long getIndividualDepositorOrderId() {
        return individualDepositorOrderId;
    }

    /**
     * Sets the value of the individualDepositorOrderId property.
     * 
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.2", date = "2024-04-09T12:49:50+03:00")
    public void setIndividualDepositorOrderId(long value) {
        this.individualDepositorOrderId = value;
    }

    /**
     * Gets the value of the additionalContributionsAmount property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the additionalContributionsAmount property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAdditionalContributionsAmount().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AdditionalContributionsCalcNPFType.AdditionalContributionsAmount }
     * 
     * 
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.2", date = "2024-04-09T12:49:50+03:00")
    public List<AdditionalContributionsCalcNPFType.AdditionalContributionsAmount> getAdditionalContributionsAmount() {
        if (additionalContributionsAmount == null) {
            additionalContributionsAmount = new ArrayList<>();
        }
        return this.additionalContributionsAmount;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;group ref="{urn://x-artefacts-cfa/cfa-projects-additional-contributions-commons/1.0.0}physicalPersonIdentificationInformation-ModelGroup"/&gt;
     *         &lt;element name="amountContributiuon" type="{urn://x-artefacts-cfa/cfa-projects-additional-contributions-commons/1.0.0}decimal-38"/&gt;
     *         &lt;element name="explanationContribution" type="{urn://x-artefacts-cfa/cfa-projects-additional-contributions-commons/1.0.0}explanationContributionType" minOccurs="0"/&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "individualDepositorSNILS",
        "individualDepositorINN",
        "amountContributiuon",
        "explanationContribution"
    })
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.2", date = "2024-04-09T12:49:50+03:00")
    public static class AdditionalContributionsAmount {

        @XmlElement(required = true)
        @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.2", date = "2024-04-09T12:49:50+03:00")
        protected String individualDepositorSNILS;
        @XmlElement(required = true)
        @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.2", date = "2024-04-09T12:49:50+03:00")
        protected String individualDepositorINN;
        @XmlElement(required = true)
        @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.2", date = "2024-04-09T12:49:50+03:00")
        protected BigDecimal amountContributiuon;
        @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.2", date = "2024-04-09T12:49:50+03:00")
        protected String explanationContribution;

        /**
         * Gets the value of the individualDepositorSNILS property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.2", date = "2024-04-09T12:49:50+03:00")
        public String getIndividualDepositorSNILS() {
            return individualDepositorSNILS;
        }

        /**
         * Sets the value of the individualDepositorSNILS property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.2", date = "2024-04-09T12:49:50+03:00")
        public void setIndividualDepositorSNILS(String value) {
            this.individualDepositorSNILS = value;
        }

        /**
         * Gets the value of the individualDepositorINN property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.2", date = "2024-04-09T12:49:50+03:00")
        public String getIndividualDepositorINN() {
            return individualDepositorINN;
        }

        /**
         * Sets the value of the individualDepositorINN property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.2", date = "2024-04-09T12:49:50+03:00")
        public void setIndividualDepositorINN(String value) {
            this.individualDepositorINN = value;
        }

        /**
         * Gets the value of the amountContributiuon property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.2", date = "2024-04-09T12:49:50+03:00")
        public BigDecimal getAmountContributiuon() {
            return amountContributiuon;
        }

        /**
         * Sets the value of the amountContributiuon property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.2", date = "2024-04-09T12:49:50+03:00")
        public void setAmountContributiuon(BigDecimal value) {
            this.amountContributiuon = value;
        }

        /**
         * Gets the value of the explanationContribution property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.2", date = "2024-04-09T12:49:50+03:00")
        public String getExplanationContribution() {
            return explanationContribution;
        }

        /**
         * Sets the value of the explanationContribution property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.2", date = "2024-04-09T12:49:50+03:00")
        public void setExplanationContribution(String value) {
            this.explanationContribution = value;
        }

    }

}
