package org.transx.model.eligibilty;

import lombok.Getter;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@Getter
@XmlRootElement
public class Biographic {

    private Name name;

    private String birthDate;

    @XmlElement
    public void setName(Name name) {
        this.name = name;
    }

    @XmlElement
    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }
}
