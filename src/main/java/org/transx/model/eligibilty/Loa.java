package org.transx.model.eligibilty;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Loa {

    private String name;

    private String active;

    @XmlElement
    public void setName(String name) {
        this.name = name;
    }

    @XmlElement
    public void setActive(String active) {
        this.active = active;
    }
}
