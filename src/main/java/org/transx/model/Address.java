package org.transx.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@Setter
@Getter
@SuperBuilder
@NoArgsConstructor
@XmlRootElement
public class Address {

    private String addressCode;

    private String addrLine1;

    private String city;

    private String countryCode;

    private String stateCode;

    private String zipCode;

    public String getAddressCode() {
        return addressCode;
    }

    @XmlElement(name="ADDRESS_CODE")
    public void setAddressCode(String addressCode) {
        this.addressCode = addressCode;
    }

    public String getAddrLine1() {
        return addrLine1;
    }

    @XmlElement(name="ADDRESS_LINE_1")
    public void setAddrLine1(String addrLine1) {
        this.addrLine1 = addrLine1;
    }

    public String getCity() {
        return city;
    }

    @XmlElement(name="CITY")
    public void setCity(String city) {
        this.city = city;
    }

    public String getCountryCode() {
        return countryCode;
    }

    @XmlElement(name="COUNTRY_CODE")
    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public String getStateCode() {
        return stateCode;
    }

    @XmlElement(name="STATE_CODE")
    public void setStateCode(String stateCode) {
        this.stateCode = stateCode;
    }

    public String getZipCode() {
        return zipCode;
    }

    @XmlElement(name="ZIP_CODE")
    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }
}
