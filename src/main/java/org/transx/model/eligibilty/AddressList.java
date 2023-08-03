package org.transx.model.eligibilty;

import lombok.Getter;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

@Getter
@XmlRootElement
public class AddressList {

    private List<Address> addresssList;

    private List<License> licenseList;

    @XmlElement
    public void setAddresssList(List<Address> addresssList) {
        this.addresssList = addresssList;
    }

    @XmlElement
    public void setLicenseList(List<License> licenseList) {
        this.licenseList = licenseList;
    }
}
