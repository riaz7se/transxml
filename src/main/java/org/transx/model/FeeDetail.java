package org.transx.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.math.BigDecimal;

@Getter
@SuperBuilder
@NoArgsConstructor
@XmlRootElement
public class FeeDetail {

    private BigDecimal feeAmount;

    private String feeDescription;

    @XmlElement
    public void setFeeAmount(BigDecimal feeAmount) {
        this.feeAmount = feeAmount;
    }

    @XmlElement
    public void setFeeDescription(String feeDescription) {
        this.feeDescription = feeDescription;
    }
}
