package org.transx.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@Setter
@Getter
@NoArgsConstructor
@XmlRootElement
public class Name {

    private String firmOrLastName;

    private String firstName;

    private Integer nameCode;

    private String type;

    @XmlElement
    public void setFirmOrLastName(String firmOrLastName) {
        this.firmOrLastName = firmOrLastName;
    }

    @XmlElement
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    @XmlElement
    public void setNameCode(Integer nameCode) {
        this.nameCode = nameCode;
    }

    @XmlElement
    public void setType(String type) {
        this.type = type;
    }
}
