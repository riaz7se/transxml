package org.transx.model.eligibilty;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import java.util.List;

public class Applicant {

    private String type;
    private String agencyType;
    private String npn;

    private AddressList addressList;

    private List<License> licenseList;

    public String getType() {
        return type;
    }

    @XmlAttribute
    public void setType(String type) {
        this.type = type;
    }

    public String getAgencyType() {
        return agencyType;
    }

    @XmlAttribute
    public void setAgencyType(String agencyType) {
        this.agencyType = agencyType;
    }

    public String getNpn() {
        return npn;
    }

    @XmlElement
    public void setNpn(String npn) {
        this.npn = npn;
    }

    @XmlElement
    public void setAddressList(AddressList addressList) {
        this.addressList = addressList;
    }

    @XmlElement
    public void setLicenseList(List<License> licenseList) {
        this.licenseList = licenseList;
    }
}
