package org.transx.model.eligibilty;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Address {

    private String addressCode;

    private String countryCode;

    private String type;

    private String addressLine1;

    private String addressLine2;

    private String addressLine3;

    private String city;

    private String state;

    private String zip;

    private String country;

    @XmlAttribute
    public void setAddressCode(String addressCode) {
        this.addressCode = addressCode;
    }

    @XmlAttribute
    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    @XmlElement
    public void setType(String type) {
        this.type = type;
    }

    @XmlElement
    public void setAddressLine1(String addressLine1) {
        this.addressLine1 = addressLine1;
    }

    @XmlElement
    public void setAddressLine2(String addressLine2) {
        this.addressLine2 = addressLine2;
    }

    @XmlElement
    public void setAddressLine3(String addressLine3) {
        this.addressLine3 = addressLine3;
    }

    @XmlElement
    public void setCity(String city) {
        this.city = city;
    }

    @XmlElement
    public void setState(String state) {
        this.state = state;
    }

    @XmlElement
    public void setZip(String zip) {
        this.zip = zip;
    }

    @XmlElement
    public void setCountry(String country) {
        this.country = country;
    }
}
