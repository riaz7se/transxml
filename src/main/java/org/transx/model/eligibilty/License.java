package org.transx.model.eligibilty;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import java.util.List;

public class License {

    private String state;

    private String classCode;

    private String id;

    private String active;

    private String classDescription;

    private List<Loa> loas;

    @XmlAttribute
    public void setState(String state) {
        this.state = state;
    }

    @XmlAttribute
    public void setClassCode(String classCode) {
        this.classCode = classCode;
    }

    @XmlElement
    public void setId(String id) {
        this.id = id;
    }

    @XmlElement
    public void setActive(String active) {
        this.active = active;
    }

    @XmlElement
    public void setClassDescription(String classDescription) {
        this.classDescription = classDescription;
    }

    @XmlElement
    public void setLoas(List<Loa> loas) {
        this.loas = loas;
    }
}
