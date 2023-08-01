package org.transx.model;

import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

@SuperBuilder
@NoArgsConstructor
@XmlRootElement
public class Applicant {
    private List<Address> address;

    private List<Background> background;

    private String bankAffiliate;

    private Long birthDate;

    private Integer countryCode;

    private List<Email> email;

    private EmploymentHistory employmentHistory;

    private String gender;

    private LicenseKey licenseKey;

    private Name name;

    private Long npn;

    private List<Phone> phone;

    private Integer type;

    @XmlElement
    public void setAddress(List<Address> address) {
        this.address = address;
    }

    @XmlElement
    public void setBackground(List<Background> background) {
        this.background = background;
    }

    public void setBankAffiliate(String bankAffiliate) {
        this.bankAffiliate = bankAffiliate;
    }
    @XmlElement
    public void setBirthDate(Long birthDate) {
        this.birthDate = birthDate;
    }
    @XmlElement
    public void setCountryCode(Integer countryCode) {
        this.countryCode = countryCode;
    }
    @XmlElement
    public void setEmail(List<Email> email) {
        this.email = email;
    }
    @XmlElement
    public void setEmploymentHistory(EmploymentHistory employmentHistory) {
        this.employmentHistory = employmentHistory;
    }
    @XmlElement
    public void setGender(String gender) {
        this.gender = gender;
    }
    @XmlElement
    public void setLicenseKey(LicenseKey licenseKey) {
        this.licenseKey = licenseKey;
    }
    @XmlElement
    public void setName(Name name) {
        this.name = name;
    }
    @XmlElement
    public void setNpn(Long npn) {
        this.npn = npn;
    }
    @XmlElement
    public void setPhone(List<Phone> phone) {
        this.phone = phone;
    }
    @XmlElement
    public void setType(Integer type) {
        this.type = type;
    }
}
