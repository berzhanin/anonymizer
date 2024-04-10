
package cfa.artefacts.x.cfa_projects_report_contributions_commons._1_0;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import jakarta.annotation.Generated;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Атрибуты сущности "Отчет о размере отраженных на счетах долгосрочных сбережений дополнительных стимулирующих взносов"
 * 
 * <p>Java class for reportAdditionalContributionsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="reportAdditionalContributionsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;group ref="{urn://x-artefacts-cfa/cfa-projects-report-contributions-commons/1.0.0}nonGovPensionFundInfo-ModelGroup"/&gt;
 *         &lt;element name="amountAdditionalContribution" maxOccurs="unbounded"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;group ref="{urn://x-artefacts-cfa/cfa-projects-report-contributions-commons/1.0.0}physicalPersonIdentificationInformation-ModelGroup"/&gt;
 *                   &lt;element name="amountContribution" type="{urn://x-artefacts-cfa/cfa-projects-report-contributions-commons/1.0.0}decimal-38"/&gt;
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
@XmlType(name = "reportAdditionalContributionsType", propOrder = {
    "fundOGRN",
    "fundINN",
    "amountAdditionalContribution"
})
@Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.2", date = "2024-04-09T12:49:50+03:00")
public class ReportAdditionalContributionsType {

    @XmlElement(required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.2", date = "2024-04-09T12:49:50+03:00")
    protected String fundOGRN;
    @XmlElement(required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.2", date = "2024-04-09T12:49:50+03:00")
    protected String fundINN;
    @XmlElement(required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.2", date = "2024-04-09T12:49:50+03:00")
    protected List<ReportAdditionalContributionsType.AmountAdditionalContribution> amountAdditionalContribution;

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
     * Gets the value of the amountAdditionalContribution property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the amountAdditionalContribution property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAmountAdditionalContribution().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ReportAdditionalContributionsType.AmountAdditionalContribution }
     * 
     * 
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.2", date = "2024-04-09T12:49:50+03:00")
    public List<ReportAdditionalContributionsType.AmountAdditionalContribution> getAmountAdditionalContribution() {
        if (amountAdditionalContribution == null) {
            amountAdditionalContribution = new ArrayList<>();
        }
        return this.amountAdditionalContribution;
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
     *         &lt;group ref="{urn://x-artefacts-cfa/cfa-projects-report-contributions-commons/1.0.0}physicalPersonIdentificationInformation-ModelGroup"/&gt;
     *         &lt;element name="amountContribution" type="{urn://x-artefacts-cfa/cfa-projects-report-contributions-commons/1.0.0}decimal-38"/&gt;
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
        "amountContribution"
    })
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.2", date = "2024-04-09T12:49:50+03:00")
    public static class AmountAdditionalContribution {

        @XmlElement(required = true)
        @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.2", date = "2024-04-09T12:49:50+03:00")
        protected String individualDepositorSNILS;
        @XmlElement(required = true)
        @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.2", date = "2024-04-09T12:49:50+03:00")
        protected String individualDepositorINN;
        @XmlElement(required = true)
        @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.2", date = "2024-04-09T12:49:50+03:00")
        protected BigDecimal amountContribution;

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
         * Gets the value of the amountContribution property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.2", date = "2024-04-09T12:49:50+03:00")
        public BigDecimal getAmountContribution() {
            return amountContribution;
        }

        /**
         * Sets the value of the amountContribution property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.2", date = "2024-04-09T12:49:50+03:00")
        public void setAmountContribution(BigDecimal value) {
            this.amountContribution = value;
        }

    }

}
