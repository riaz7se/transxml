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
public class Loa {

    private Integer loaCode;

    @XmlElement
    public void setLoaCode(Integer loaCode) {
        this.loaCode = loaCode;
    }
}
