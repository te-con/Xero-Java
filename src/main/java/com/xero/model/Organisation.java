//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.10.25 at 11:30:02 AM PDT 
//


package com.xero.model;

import java.util.Calendar;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for Organisation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Organisation">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="ValidationErrors" type="{}ArrayOfValidationError" minOccurs="0"/>
 *         &lt;element name="Warnings" type="{}ArrayOfWarning" minOccurs="0"/>
 *         &lt;element name="APIKey" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Name" type="{}organisationName" minOccurs="0"/>
 *         &lt;element name="LegalName" type="{}organisationName" minOccurs="0"/>
 *         &lt;element name="PaysTax" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Version" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BaseCurrency" type="{}currencyCode" minOccurs="0"/>
 *         &lt;element name="CountryCode" type="{}isoCountryCode" minOccurs="0"/>
 *         &lt;element name="IsDemoCompany" type="{}trueOrFalse" minOccurs="0"/>
 *         &lt;element name="OrganisationStatus" type="{}organisationStatusCode" minOccurs="0"/>
 *         &lt;element name="RegistrationNumber" type="{}companyRegistrationNumberType" minOccurs="0"/>
 *         &lt;element name="TaxNumber" type="{}taxNumberType" minOccurs="0"/>
 *         &lt;element name="FinancialYearEndDay" type="{}dayNumber" minOccurs="0"/>
 *         &lt;element name="FinancialYearEndMonth" type="{}monthNumber" minOccurs="0"/>
 *         &lt;element name="SalesTaxBasis" type="{}salesTaxBasis" minOccurs="0"/>
 *         &lt;element name="SalesTaxPeriod" type="{}salesTaxPeriod" minOccurs="0"/>
 *         &lt;element name="DefaultSalesTax" type="{}lineAmountType" minOccurs="0"/>
 *         &lt;element name="DefaultPurchasesTax" type="{}lineAmountType" minOccurs="0"/>
 *         &lt;element name="PeriodLockDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="EndOfYearLockDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="CreatedDateUTC" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="OrganisationEntityType" type="{}organisationEntityType" minOccurs="0"/>
 *         &lt;element name="OrganisationType" type="{}organisationEntityType" minOccurs="0"/>
 *         &lt;element name="Timezone" type="{}timezoneCode" minOccurs="0"/>
 *         &lt;element name="ShortCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LineOfBusiness" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Addresses" type="{}ArrayOfAddress" minOccurs="0"/>
 *         &lt;element name="Phones" type="{}ArrayOfPhone" minOccurs="0"/>
 *         &lt;element name="ExternalLinks" type="{}externalLinks" minOccurs="0"/>
 *         &lt;element name="PaymentTerms" type="{}paymentTerms" minOccurs="0"/>
 *       &lt;/all>
 *       &lt;attribute name="status" type="{}entityValidationStatus" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Organisation", propOrder = {

})
public class Organisation {

    @XmlElement(name = "ValidationErrors")
    protected ArrayOfValidationError validationErrors;
    @XmlElement(name = "Warnings")
    protected ArrayOfWarning warnings;
    @XmlElement(name = "APIKey")
    protected String apiKey;
    @XmlElement(name = "Name")
    protected String name;
    @XmlElement(name = "LegalName")
    protected String legalName;
    @XmlElement(name = "PaysTax")
    protected Boolean paysTax;
    @XmlElement(name = "Version")
    protected String version;
    @XmlElement(name = "BaseCurrency")
    protected CurrencyCode baseCurrency;
    @XmlElement(name = "CountryCode")
    protected IsoCountryCode countryCode;
    @XmlElement(name = "IsDemoCompany")
    protected TrueOrFalse isDemoCompany;
    @XmlElement(name = "OrganisationStatus")
    protected OrganisationStatusCode organisationStatus;
    @XmlElement(name = "RegistrationNumber")
    protected String registrationNumber;
    @XmlElement(name = "TaxNumber")
    protected String taxNumber;
    @XmlElement(name = "FinancialYearEndDay")
    protected Integer financialYearEndDay;
    @XmlElement(name = "FinancialYearEndMonth")
    protected Integer financialYearEndMonth;
    @XmlElement(name = "SalesTaxBasis")
    protected SalesTaxBasis salesTaxBasis;
    @XmlElement(name = "SalesTaxPeriod")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String salesTaxPeriod;
    @XmlElement(name = "DefaultSalesTax")
    protected LineAmountType defaultSalesTax;
    @XmlElement(name = "DefaultPurchasesTax")
    protected LineAmountType defaultPurchasesTax;
    @XmlElement(name = "PeriodLockDate", type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "dateTime")
    protected Calendar periodLockDate;
    @XmlElement(name = "EndOfYearLockDate", type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "dateTime")
    protected Calendar endOfYearLockDate;
    @XmlElement(name = "CreatedDateUTC", type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "dateTime")
    protected Calendar createdDateUTC;
    @XmlElement(name = "OrganisationEntityType")
    protected OrganisationEntityType organisationEntityType;
    @XmlElement(name = "OrganisationType")
    protected OrganisationEntityType organisationType;
    @XmlElement(name = "Timezone")
    protected TimezoneCode timezone;
    @XmlElement(name = "ShortCode")
    protected String shortCode;
    @XmlElement(name = "LineOfBusiness")
    protected String lineOfBusiness;
    @XmlElement(name = "Addresses")
    protected ArrayOfAddress addresses;
    @XmlElement(name = "Phones")
    protected ArrayOfPhone phones;
    @XmlElement(name = "ExternalLinks")
    protected ExternalLinks externalLinks;
    @XmlElement(name = "PaymentTerms")
    protected PaymentTerms paymentTerms;
    @XmlAttribute(name = "status")
    protected EntityValidationStatus status;

    /**
     * Gets the value of the validationErrors property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfValidationError }
     *     
     */
    public ArrayOfValidationError getValidationErrors() {
        return validationErrors;
    }

    /**
     * Sets the value of the validationErrors property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfValidationError }
     *     
     */
    public void setValidationErrors(ArrayOfValidationError value) {
        this.validationErrors = value;
    }

    /**
     * Gets the value of the warnings property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfWarning }
     *     
     */
    public ArrayOfWarning getWarnings() {
        return warnings;
    }

    /**
     * Sets the value of the warnings property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfWarning }
     *     
     */
    public void setWarnings(ArrayOfWarning value) {
        this.warnings = value;
    }

    /**
     * Gets the value of the apiKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAPIKey() {
        return apiKey;
    }

    /**
     * Sets the value of the apiKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAPIKey(String value) {
        this.apiKey = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the legalName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLegalName() {
        return legalName;
    }

    /**
     * Sets the value of the legalName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLegalName(String value) {
        this.legalName = value;
    }

    /**
     * Gets the value of the paysTax property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPaysTax() {
        return paysTax;
    }

    /**
     * Sets the value of the paysTax property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPaysTax(Boolean value) {
        this.paysTax = value;
    }

    /**
     * Gets the value of the version property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVersion() {
        return version;
    }

    /**
     * Sets the value of the version property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVersion(String value) {
        this.version = value;
    }

    /**
     * Gets the value of the baseCurrency property.
     * 
     * @return
     *     possible object is
     *     {@link CurrencyCode }
     *     
     */
    public CurrencyCode getBaseCurrency() {
        return baseCurrency;
    }

    /**
     * Sets the value of the baseCurrency property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrencyCode }
     *     
     */
    public void setBaseCurrency(CurrencyCode value) {
        this.baseCurrency = value;
    }

    /**
     * Gets the value of the countryCode property.
     * 
     * @return
     *     possible object is
     *     {@link IsoCountryCode }
     *     
     */
    public IsoCountryCode getCountryCode() {
        return countryCode;
    }

    /**
     * Sets the value of the countryCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link IsoCountryCode }
     *     
     */
    public void setCountryCode(IsoCountryCode value) {
        this.countryCode = value;
    }

    /**
     * Gets the value of the isDemoCompany property.
     * 
     * @return
     *     possible object is
     *     {@link TrueOrFalse }
     *     
     */
    public TrueOrFalse getIsDemoCompany() {
        return isDemoCompany;
    }

    /**
     * Sets the value of the isDemoCompany property.
     * 
     * @param value
     *     allowed object is
     *     {@link TrueOrFalse }
     *     
     */
    public void setIsDemoCompany(TrueOrFalse value) {
        this.isDemoCompany = value;
    }

    /**
     * Gets the value of the organisationStatus property.
     * 
     * @return
     *     possible object is
     *     {@link OrganisationStatusCode }
     *     
     */
    public OrganisationStatusCode getOrganisationStatus() {
        return organisationStatus;
    }

    /**
     * Sets the value of the organisationStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrganisationStatusCode }
     *     
     */
    public void setOrganisationStatus(OrganisationStatusCode value) {
        this.organisationStatus = value;
    }

    /**
     * Gets the value of the registrationNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegistrationNumber() {
        return registrationNumber;
    }

    /**
     * Sets the value of the registrationNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegistrationNumber(String value) {
        this.registrationNumber = value;
    }

    /**
     * Gets the value of the taxNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaxNumber() {
        return taxNumber;
    }

    /**
     * Sets the value of the taxNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaxNumber(String value) {
        this.taxNumber = value;
    }

    /**
     * Gets the value of the financialYearEndDay property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getFinancialYearEndDay() {
        return financialYearEndDay;
    }

    /**
     * Sets the value of the financialYearEndDay property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setFinancialYearEndDay(Integer value) {
        this.financialYearEndDay = value;
    }

    /**
     * Gets the value of the financialYearEndMonth property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getFinancialYearEndMonth() {
        return financialYearEndMonth;
    }

    /**
     * Sets the value of the financialYearEndMonth property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setFinancialYearEndMonth(Integer value) {
        this.financialYearEndMonth = value;
    }

    /**
     * Gets the value of the salesTaxBasis property.
     * 
     * @return
     *     possible object is
     *     {@link SalesTaxBasis }
     *     
     */
    public SalesTaxBasis getSalesTaxBasis() {
        return salesTaxBasis;
    }

    /**
     * Sets the value of the salesTaxBasis property.
     * 
     * @param value
     *     allowed object is
     *     {@link SalesTaxBasis }
     *     
     */
    public void setSalesTaxBasis(SalesTaxBasis value) {
        this.salesTaxBasis = value;
    }

    /**
     * Gets the value of the salesTaxPeriod property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSalesTaxPeriod() {
        return salesTaxPeriod;
    }

    /**
     * Sets the value of the salesTaxPeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSalesTaxPeriod(String value) {
        this.salesTaxPeriod = value;
    }

    /**
     * Gets the value of the defaultSalesTax property.
     * 
     * @return
     *     possible object is
     *     {@link LineAmountType }
     *     
     */
    public LineAmountType getDefaultSalesTax() {
        return defaultSalesTax;
    }

    /**
     * Sets the value of the defaultSalesTax property.
     * 
     * @param value
     *     allowed object is
     *     {@link LineAmountType }
     *     
     */
    public void setDefaultSalesTax(LineAmountType value) {
        this.defaultSalesTax = value;
    }

    /**
     * Gets the value of the defaultPurchasesTax property.
     * 
     * @return
     *     possible object is
     *     {@link LineAmountType }
     *     
     */
    public LineAmountType getDefaultPurchasesTax() {
        return defaultPurchasesTax;
    }

    /**
     * Sets the value of the defaultPurchasesTax property.
     * 
     * @param value
     *     allowed object is
     *     {@link LineAmountType }
     *     
     */
    public void setDefaultPurchasesTax(LineAmountType value) {
        this.defaultPurchasesTax = value;
    }

    /**
     * Gets the value of the periodLockDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Calendar getPeriodLockDate() {
        return periodLockDate;
    }

    /**
     * Sets the value of the periodLockDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPeriodLockDate(Calendar value) {
        this.periodLockDate = value;
    }

    /**
     * Gets the value of the endOfYearLockDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Calendar getEndOfYearLockDate() {
        return endOfYearLockDate;
    }

    /**
     * Sets the value of the endOfYearLockDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEndOfYearLockDate(Calendar value) {
        this.endOfYearLockDate = value;
    }

    /**
     * Gets the value of the createdDateUTC property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Calendar getCreatedDateUTC() {
        return createdDateUTC;
    }

    /**
     * Sets the value of the createdDateUTC property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreatedDateUTC(Calendar value) {
        this.createdDateUTC = value;
    }

    /**
     * Gets the value of the organisationEntityType property.
     * 
     * @return
     *     possible object is
     *     {@link OrganisationEntityType }
     *     
     */
    public OrganisationEntityType getOrganisationEntityType() {
        return organisationEntityType;
    }

    /**
     * Sets the value of the organisationEntityType property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrganisationEntityType }
     *     
     */
    public void setOrganisationEntityType(OrganisationEntityType value) {
        this.organisationEntityType = value;
    }

    /**
     * Gets the value of the organisationType property.
     * 
     * @return
     *     possible object is
     *     {@link OrganisationEntityType }
     *     
     */
    public OrganisationEntityType getOrganisationType() {
        return organisationType;
    }

    /**
     * Sets the value of the organisationType property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrganisationEntityType }
     *     
     */
    public void setOrganisationType(OrganisationEntityType value) {
        this.organisationType = value;
    }

    /**
     * Gets the value of the timezone property.
     * 
     * @return
     *     possible object is
     *     {@link TimezoneCode }
     *     
     */
    public TimezoneCode getTimezone() {
        return timezone;
    }

    /**
     * Sets the value of the timezone property.
     * 
     * @param value
     *     allowed object is
     *     {@link TimezoneCode }
     *     
     */
    public void setTimezone(TimezoneCode value) {
        this.timezone = value;
    }

    /**
     * Gets the value of the shortCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShortCode() {
        return shortCode;
    }

    /**
     * Sets the value of the shortCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShortCode(String value) {
        this.shortCode = value;
    }

    /**
     * Gets the value of the lineOfBusiness property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLineOfBusiness() {
        return lineOfBusiness;
    }

    /**
     * Sets the value of the lineOfBusiness property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLineOfBusiness(String value) {
        this.lineOfBusiness = value;
    }

    /**
     * Gets the value of the addresses property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfAddress }
     *     
     */
    public ArrayOfAddress getAddresses() {
        return addresses;
    }

    /**
     * Sets the value of the addresses property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfAddress }
     *     
     */
    public void setAddresses(ArrayOfAddress value) {
        this.addresses = value;
    }

    /**
     * Gets the value of the phones property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfPhone }
     *     
     */
    public ArrayOfPhone getPhones() {
        return phones;
    }

    /**
     * Sets the value of the phones property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfPhone }
     *     
     */
    public void setPhones(ArrayOfPhone value) {
        this.phones = value;
    }

    /**
     * Gets the value of the externalLinks property.
     * 
     * @return
     *     possible object is
     *     {@link ExternalLinks }
     *     
     */
    public ExternalLinks getExternalLinks() {
        return externalLinks;
    }

    /**
     * Sets the value of the externalLinks property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExternalLinks }
     *     
     */
    public void setExternalLinks(ExternalLinks value) {
        this.externalLinks = value;
    }

    /**
     * Gets the value of the paymentTerms property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentTerms }
     *     
     */
    public PaymentTerms getPaymentTerms() {
        return paymentTerms;
    }

    /**
     * Sets the value of the paymentTerms property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentTerms }
     *     
     */
    public void setPaymentTerms(PaymentTerms value) {
        this.paymentTerms = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link EntityValidationStatus }
     *     
     */
    public EntityValidationStatus getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityValidationStatus }
     *     
     */
    public void setStatus(EntityValidationStatus value) {
        this.status = value;
    }

}
