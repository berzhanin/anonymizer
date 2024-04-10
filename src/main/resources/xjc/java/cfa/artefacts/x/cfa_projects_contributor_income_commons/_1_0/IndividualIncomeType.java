
package cfa.artefacts.x.cfa_projects_contributor_income_commons._1_0;

import jakarta.annotation.Generated;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * јтрибуты сущности "»нформаци€ о среднемес€чном доходе вкладчика"
 * 
 * <p>Java class for individualIncomeType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="individualIncomeType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="individualDepositorSNILS" type="{urn://x-artefacts-cfa/cfa-projects-contributor-income-commons/1.0.0}extSNILSType"/&gt;
 *         &lt;choice&gt;
 *           &lt;element name="incomeCategory" type="{urn://x-artefacts-cfa/cfa-projects-contributor-income-commons/1.0.0}incomeCategoryType"/&gt;
 *           &lt;element name="errorText" type="{urn://x-artefacts-cfa/cfa-projects-contributor-income-commons/1.0.0}string-1000"/&gt;
 *         &lt;/choice&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "individualIncomeType", propOrder = {
    "individualDepositorSNILS",
    "incomeCategory",
    "errorText"
})
@Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.2", date = "2024-04-09T12:49:50+03:00")
public class IndividualIncomeType {

    @XmlElement(required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.2", date = "2024-04-09T12:49:50+03:00")
    protected String individualDepositorSNILS;
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.2", date = "2024-04-09T12:49:50+03:00")
    protected String incomeCategory;
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.2", date = "2024-04-09T12:49:50+03:00")
    protected String errorText;

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
     * Gets the value of the incomeCategory property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.2", date = "2024-04-09T12:49:50+03:00")
    public String getIncomeCategory() {
        return incomeCategory;
    }

    /**
     * Sets the value of the incomeCategory property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.2", date = "2024-04-09T12:49:50+03:00")
    public void setIncomeCategory(String value) {
        this.incomeCategory = value;
    }

    /**
     * Gets the value of the errorText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.2", date = "2024-04-09T12:49:50+03:00")
    public String getErrorText() {
        return errorText;
    }

    /**
     * Sets the value of the errorText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.2", date = "2024-04-09T12:49:50+03:00")
    public void setErrorText(String value) {
        this.errorText = value;
    }

}
