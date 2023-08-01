package org.transx.model;

import jakarta.xml.bind.annotation.XmlRootElement;
import lombok.Getter;
import lombok.experimental.SuperBuilder;

import javax.xml.bind.annotation.XmlElement;

@Getter
@SuperBuilder
@XmlRootElement
public class Authorization {

    private Address address;

    private String authFirmName;

    private String complianceOfficer;

    private Email email;

    private String firstName;

    private String lastName;

    private Phone phone;

    private String preparerCode;

    @XmlElement
    public void setAddress(Address address) {
        this.address = address;
    }

    @XmlElement
    public void setAuthFirmName(String authFirmName) {
        this.authFirmName = authFirmName;
    }

    @XmlElement
    public void setComplianceOfficer(String complianceOfficer) {
        this.complianceOfficer = complianceOfficer;
    }

    @XmlElement
    public void setEmail(Email email) {
        this.email = email;
    }

    @XmlElement
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    @XmlElement
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @XmlElement
    public void setPhone(Phone phone) {
        this.phone = phone;
    }

    @XmlElement
    public void setPreparerCode(String preparerCode) {
        this.preparerCode = preparerCode;
    }
}
