//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.02.29 at 02:50:55 PM IST 
//


package com.employeedetails.jaxb.request;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for address complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="address">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence minOccurs="0">
 *         &lt;element name="address-1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="address-2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="city-state" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="zip-code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "address", propOrder = {
    "address1",
    "address2",
    "cityState",
    "zipCode"
})
public class Address {

    @XmlElement(name = "address-1")
    protected String address1;
    @XmlElement(name = "address-2")
    protected String address2;
    @XmlElement(name = "city-state")
    protected String cityState;
    @XmlElement(name = "zip-code")
    protected String zipCode;

    /**
     * Gets the value of the address1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddress1() {
        return address1;
    }

    /**
     * Sets the value of the address1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddress1(String value) {
        this.address1 = value;
    }

    /**
     * Gets the value of the address2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddress2() {
        return address2;
    }

    /**
     * Sets the value of the address2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddress2(String value) {
        this.address2 = value;
    }

    /**
     * Gets the value of the cityState property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCityState() {
        return cityState;
    }

    /**
     * Sets the value of the cityState property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCityState(String value) {
        this.cityState = value;
    }

    /**
     * Gets the value of the zipCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZipCode() {
        return zipCode;
    }

    /**
     * Sets the value of the zipCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZipCode(String value) {
        this.zipCode = value;
    }

}
