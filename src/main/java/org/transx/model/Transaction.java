package org.transx.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.xml.bind.annotation.XmlRootElement;
import java.math.BigDecimal;

@Setter
@Getter
@NoArgsConstructor
@XmlRootElement
public class Transaction {

    private Applicant applicant;

    private Authorization authorization;

    private Contact contact;

    private String customer;

    private Integer custBatch;

    private String custTrans;

    private String entity;

    private FeeDetail feeDetail;

    private License license;

    private Payment payment;

    private BigDecimal stateFee;

    private BigDecimal transFee;

    private TransHead transHead;

    private String transStatus;

    private String valid;

}
