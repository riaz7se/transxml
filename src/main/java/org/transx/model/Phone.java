package org.transx.model;

import lombok.Getter;
import lombok.experimental.SuperBuilder;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@Getter
@SuperBuilder
@XmlRootElement
public class Phone {
    private Integer phoneCode;

    private Integer phoneNumber;

    @XmlElement
    public void setPhoneCode(Integer phoneCode) {
        this.phoneCode = phoneCode;
    }

    @XmlElement
    public void setPhoneNumber(Integer phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
