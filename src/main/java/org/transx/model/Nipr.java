package org.transx.model;

import lombok.Getter;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

@Getter
@XmlRootElement
public class Nipr {

    private List<Transaction> transaction;

    @XmlElement
    public void setTransaction(List<Transaction> transaction) {
        this.transaction = transaction;
    }
}
