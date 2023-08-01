package org.transx.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@Getter
@NoArgsConstructor
@XmlRootElement
public class EmploymentHistory {

    private String city;
    private String countryCode;
    private String dateFrom;
    private String dateTo;
    private String employerName;
    private String position;
    private String stateCode;

    @XmlElement
    public void setCity(String city) {
        this.city = city;
    }
    @XmlElement
    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }
    @XmlElement
    public void setDateFrom(String dateFrom) {
        this.dateFrom = dateFrom;
    }
    @XmlElement
    public void setDateTo(String dateTo) {
        this.dateTo = dateTo;
    }
    @XmlElement
    public void setEmployerName(String employerName) {
        this.employerName = employerName;
    }
    @XmlElement
    public void setPosition(String position) {
        this.position = position;
    }
    @XmlElement
    public void setStateCode(String stateCode) {
        this.stateCode = stateCode;
    }
}
