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
public class Payment {

    private String accountId;

    private String paymentType;

    public String getAccountId() {
        return accountId;
    }

    @XmlElement
    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    public String getPaymentType() {
        return paymentType;
    }

    @XmlElement
    public void setPaymentType(String paymentType) {
        this.paymentType = paymentType;
    }
}
