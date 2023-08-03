package org.transx.model.eligibilty;

import lombok.Getter;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

@Getter
@XmlRootElement
public class Transaction {

    private String type;

    private String task;

    private String state;

    @XmlAttribute
    public void setType(String type) {
        this.type = type;
    }

    @XmlAttribute
    public void setTask(String task) {
        this.task = task;
    }

    @XmlAttribute
    public void setState(String state) {
        this.state = state;
    }
}
