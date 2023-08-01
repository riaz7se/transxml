package org.transx.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.xml.bind.annotation.XmlRootElement;

@Setter
@Getter
@NoArgsConstructor
@XmlRootElement
public class EmploymentHistory {
    private String city;
    private String countryCode;
    private String dateFrom;
    private String dateTo;
    private String employerName;
    private String position;
    private String stateCode;


}
