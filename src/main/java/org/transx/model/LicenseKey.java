package org.transx.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.xml.bind.annotation.XmlRootElement;

@Setter
@Getter
@NoArgsConstructor
@XmlRootElement
public class LicenseKey {
    private String licenseId;
    private String resLicenseId;
    private String resState;
}
