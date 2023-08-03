package org.transx.model.eligibilty;

import lombok.Getter;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@Getter
@XmlRootElement
public class Response {

    private Transaction transaction;

    private EligibilityResponse eligibilityResponse;


    @XmlElement
    public void setTransaction(Transaction transaction) {
        this.transaction = transaction;
    }

    @XmlElement
    public void setEligibilityResponse(EligibilityResponse eligibilityResponse) {
        this.eligibilityResponse = eligibilityResponse;
    }
}
