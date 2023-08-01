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
public class License {

    private IntResponse intResponse;

    private Integer licenseClass;

    @XmlElement
    public void setIntResponse(IntResponse intResponse) {
        this.intResponse = intResponse;
    }

    @XmlElement
    public void setLicenseClass(Integer licenseClass) {
        this.licenseClass = licenseClass;
    }
}
