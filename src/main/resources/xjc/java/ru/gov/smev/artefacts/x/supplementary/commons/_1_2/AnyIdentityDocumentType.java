
package ru.gov.smev.artefacts.x.supplementary.commons._1_2;

import jakarta.annotation.Generated;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Документ, удостоверяющий личность
 * 
 * <p>Java class for AnyIdentityDocumentType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AnyIdentityDocumentType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice&gt;
 *         &lt;group ref="{urn://x-artefacts-smev-gov-ru/supplementary/commons/1.2.0}PrimaryIdentityDocument-ModelGroup"/&gt;
 *         &lt;group ref="{urn://x-artefacts-smev-gov-ru/supplementary/commons/1.2.0}WeakIdentityDocument-ModelGroup"/&gt;
 *         &lt;group ref="{urn://x-artefacts-smev-gov-ru/supplementary/commons/1.2.0}TemporaryIdentityDocument-ModelGroup"/&gt;
 *       &lt;/choice&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AnyIdentityDocumentType", propOrder = {
    "passportRF",
    "foreignPassport",
    "residencePermitRF",
    "internationalPassportRF",
    "militaryPassport",
    "sailorPassport",
    "sovietPassport",
    "birthCertificate",
    "drivingLicenseRF",
    "releaseCertificate",
    "passportLossCertificate",
    "form9Certificate",
    "temporaryIdentityCardRF"
})
@Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.2", date = "2024-04-09T12:49:50+03:00")
public class AnyIdentityDocumentType {

    @XmlElement(name = "PassportRF")
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.2", date = "2024-04-09T12:49:50+03:00")
    protected PassportRFType passportRF;
    @XmlElement(name = "ForeignPassport")
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.2", date = "2024-04-09T12:49:50+03:00")
    protected NotRestrictedDocumentType foreignPassport;
    @XmlElement(name = "ResidencePermitRF")
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.2", date = "2024-04-09T12:49:50+03:00")
    protected InternationalPassportRFType residencePermitRF;
    @XmlElement(name = "InternationalPassportRF")
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.2", date = "2024-04-09T12:49:50+03:00")
    protected InternationalPassportRFType internationalPassportRF;
    @XmlElement(name = "MilitaryPassport")
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.2", date = "2024-04-09T12:49:50+03:00")
    protected MilitaryPassportDocumentType militaryPassport;
    @XmlElement(name = "SailorPassport")
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.2", date = "2024-04-09T12:49:50+03:00")
    protected MilitaryPassportDocumentType sailorPassport;
    @XmlElement(name = "SovietPassport")
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.2", date = "2024-04-09T12:49:50+03:00")
    protected SovietPassportType sovietPassport;
    @XmlElement(name = "BirthCertificate")
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.2", date = "2024-04-09T12:49:50+03:00")
    protected SovietPassportType birthCertificate;
    @XmlElement(name = "DrivingLicenseRF")
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.2", date = "2024-04-09T12:49:50+03:00")
    protected DrivingLicenseRFType drivingLicenseRF;
    @XmlElement(name = "ReleaseCertificate")
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.2", date = "2024-04-09T12:49:50+03:00")
    protected NotRestrictedDocumentType releaseCertificate;
    @XmlElement(name = "PassportLossCertificate")
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.2", date = "2024-04-09T12:49:50+03:00")
    protected NotRestrictedDocumentType passportLossCertificate;
    @XmlElement(name = "Form9Certificate")
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.2", date = "2024-04-09T12:49:50+03:00")
    protected NotRestrictedDocumentType form9Certificate;
    @XmlElement(name = "TemporaryIdentityCardRF")
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.2", date = "2024-04-09T12:49:50+03:00")
    protected NotRestrictedDocumentType temporaryIdentityCardRF;

    /**
     * Gets the value of the passportRF property.
     * 
     * @return
     *     possible object is
     *     {@link PassportRFType }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.2", date = "2024-04-09T12:49:50+03:00")
    public PassportRFType getPassportRF() {
        return passportRF;
    }

    /**
     * Sets the value of the passportRF property.
     * 
     * @param value
     *     allowed object is
     *     {@link PassportRFType }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.2", date = "2024-04-09T12:49:50+03:00")
    public void setPassportRF(PassportRFType value) {
        this.passportRF = value;
    }

    /**
     * Gets the value of the foreignPassport property.
     * 
     * @return
     *     possible object is
     *     {@link NotRestrictedDocumentType }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.2", date = "2024-04-09T12:49:50+03:00")
    public NotRestrictedDocumentType getForeignPassport() {
        return foreignPassport;
    }

    /**
     * Sets the value of the foreignPassport property.
     * 
     * @param value
     *     allowed object is
     *     {@link NotRestrictedDocumentType }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.2", date = "2024-04-09T12:49:50+03:00")
    public void setForeignPassport(NotRestrictedDocumentType value) {
        this.foreignPassport = value;
    }

    /**
     * Gets the value of the residencePermitRF property.
     * 
     * @return
     *     possible object is
     *     {@link InternationalPassportRFType }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.2", date = "2024-04-09T12:49:50+03:00")
    public InternationalPassportRFType getResidencePermitRF() {
        return residencePermitRF;
    }

    /**
     * Sets the value of the residencePermitRF property.
     * 
     * @param value
     *     allowed object is
     *     {@link InternationalPassportRFType }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.2", date = "2024-04-09T12:49:50+03:00")
    public void setResidencePermitRF(InternationalPassportRFType value) {
        this.residencePermitRF = value;
    }

    /**
     * Gets the value of the internationalPassportRF property.
     * 
     * @return
     *     possible object is
     *     {@link InternationalPassportRFType }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.2", date = "2024-04-09T12:49:50+03:00")
    public InternationalPassportRFType getInternationalPassportRF() {
        return internationalPassportRF;
    }

    /**
     * Sets the value of the internationalPassportRF property.
     * 
     * @param value
     *     allowed object is
     *     {@link InternationalPassportRFType }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.2", date = "2024-04-09T12:49:50+03:00")
    public void setInternationalPassportRF(InternationalPassportRFType value) {
        this.internationalPassportRF = value;
    }

    /**
     * Gets the value of the militaryPassport property.
     * 
     * @return
     *     possible object is
     *     {@link MilitaryPassportDocumentType }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.2", date = "2024-04-09T12:49:50+03:00")
    public MilitaryPassportDocumentType getMilitaryPassport() {
        return militaryPassport;
    }

    /**
     * Sets the value of the militaryPassport property.
     * 
     * @param value
     *     allowed object is
     *     {@link MilitaryPassportDocumentType }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.2", date = "2024-04-09T12:49:50+03:00")
    public void setMilitaryPassport(MilitaryPassportDocumentType value) {
        this.militaryPassport = value;
    }

    /**
     * Gets the value of the sailorPassport property.
     * 
     * @return
     *     possible object is
     *     {@link MilitaryPassportDocumentType }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.2", date = "2024-04-09T12:49:50+03:00")
    public MilitaryPassportDocumentType getSailorPassport() {
        return sailorPassport;
    }

    /**
     * Sets the value of the sailorPassport property.
     * 
     * @param value
     *     allowed object is
     *     {@link MilitaryPassportDocumentType }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.2", date = "2024-04-09T12:49:50+03:00")
    public void setSailorPassport(MilitaryPassportDocumentType value) {
        this.sailorPassport = value;
    }

    /**
     * Gets the value of the sovietPassport property.
     * 
     * @return
     *     possible object is
     *     {@link SovietPassportType }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.2", date = "2024-04-09T12:49:50+03:00")
    public SovietPassportType getSovietPassport() {
        return sovietPassport;
    }

    /**
     * Sets the value of the sovietPassport property.
     * 
     * @param value
     *     allowed object is
     *     {@link SovietPassportType }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.2", date = "2024-04-09T12:49:50+03:00")
    public void setSovietPassport(SovietPassportType value) {
        this.sovietPassport = value;
    }

    /**
     * Gets the value of the birthCertificate property.
     * 
     * @return
     *     possible object is
     *     {@link SovietPassportType }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.2", date = "2024-04-09T12:49:50+03:00")
    public SovietPassportType getBirthCertificate() {
        return birthCertificate;
    }

    /**
     * Sets the value of the birthCertificate property.
     * 
     * @param value
     *     allowed object is
     *     {@link SovietPassportType }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.2", date = "2024-04-09T12:49:50+03:00")
    public void setBirthCertificate(SovietPassportType value) {
        this.birthCertificate = value;
    }

    /**
     * Gets the value of the drivingLicenseRF property.
     * 
     * @return
     *     possible object is
     *     {@link DrivingLicenseRFType }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.2", date = "2024-04-09T12:49:50+03:00")
    public DrivingLicenseRFType getDrivingLicenseRF() {
        return drivingLicenseRF;
    }

    /**
     * Sets the value of the drivingLicenseRF property.
     * 
     * @param value
     *     allowed object is
     *     {@link DrivingLicenseRFType }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.2", date = "2024-04-09T12:49:50+03:00")
    public void setDrivingLicenseRF(DrivingLicenseRFType value) {
        this.drivingLicenseRF = value;
    }

    /**
     * Gets the value of the releaseCertificate property.
     * 
     * @return
     *     possible object is
     *     {@link NotRestrictedDocumentType }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.2", date = "2024-04-09T12:49:50+03:00")
    public NotRestrictedDocumentType getReleaseCertificate() {
        return releaseCertificate;
    }

    /**
     * Sets the value of the releaseCertificate property.
     * 
     * @param value
     *     allowed object is
     *     {@link NotRestrictedDocumentType }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.2", date = "2024-04-09T12:49:50+03:00")
    public void setReleaseCertificate(NotRestrictedDocumentType value) {
        this.releaseCertificate = value;
    }

    /**
     * Gets the value of the passportLossCertificate property.
     * 
     * @return
     *     possible object is
     *     {@link NotRestrictedDocumentType }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.2", date = "2024-04-09T12:49:50+03:00")
    public NotRestrictedDocumentType getPassportLossCertificate() {
        return passportLossCertificate;
    }

    /**
     * Sets the value of the passportLossCertificate property.
     * 
     * @param value
     *     allowed object is
     *     {@link NotRestrictedDocumentType }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.2", date = "2024-04-09T12:49:50+03:00")
    public void setPassportLossCertificate(NotRestrictedDocumentType value) {
        this.passportLossCertificate = value;
    }

    /**
     * Gets the value of the form9Certificate property.
     * 
     * @return
     *     possible object is
     *     {@link NotRestrictedDocumentType }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.2", date = "2024-04-09T12:49:50+03:00")
    public NotRestrictedDocumentType getForm9Certificate() {
        return form9Certificate;
    }

    /**
     * Sets the value of the form9Certificate property.
     * 
     * @param value
     *     allowed object is
     *     {@link NotRestrictedDocumentType }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.2", date = "2024-04-09T12:49:50+03:00")
    public void setForm9Certificate(NotRestrictedDocumentType value) {
        this.form9Certificate = value;
    }

    /**
     * Gets the value of the temporaryIdentityCardRF property.
     * 
     * @return
     *     possible object is
     *     {@link NotRestrictedDocumentType }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.2", date = "2024-04-09T12:49:50+03:00")
    public NotRestrictedDocumentType getTemporaryIdentityCardRF() {
        return temporaryIdentityCardRF;
    }

    /**
     * Sets the value of the temporaryIdentityCardRF property.
     * 
     * @param value
     *     allowed object is
     *     {@link NotRestrictedDocumentType }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.2", date = "2024-04-09T12:49:50+03:00")
    public void setTemporaryIdentityCardRF(NotRestrictedDocumentType value) {
        this.temporaryIdentityCardRF = value;
    }

}
