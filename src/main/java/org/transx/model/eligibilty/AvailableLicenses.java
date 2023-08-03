package org.transx.model.eligibilty;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

@XmlRootElement
public class AvailableLicenses {

    private List<License> license;

    @XmlElement
    public void setLicense(List<License> license) {
        this.license = license;
    }
}
