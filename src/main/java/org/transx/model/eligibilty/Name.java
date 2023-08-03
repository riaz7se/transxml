package org.transx.model.eligibilty;

import lombok.Getter;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@Getter
@XmlRootElement
public class Name {

    private String first;

    private String middle;

    private String firmOrLast;

    @XmlElement
    public void setFirst(String first) {
        this.first = first;
    }

    @XmlElement
    public void setMiddle(String middle) {
        this.middle = middle;
    }

    @XmlElement
    public void setFirmOrLast(String firmOrLast) {
        this.firmOrLast = firmOrLast;
    }
}
