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
public class TransHead {

    private Long dateStamp;

    private String stateCode;

    private Long timeStamp;

    private Integer transactionType;

    @XmlElement
    public void setDateStamp(Long dateStamp) {
        this.dateStamp = dateStamp;
    }

    @XmlElement
    public void setStateCode(String stateCode) {
        this.stateCode = stateCode;
    }

    @XmlElement
    public void setTimeStamp(Long timeStamp) {
        this.timeStamp = timeStamp;
    }

    @XmlElement
    public void setTransactionType(Integer transactionType) {
        this.transactionType = transactionType;
    }
}
