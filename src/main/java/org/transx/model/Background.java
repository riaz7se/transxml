package org.transx.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

import javax.xml.bind.annotation.XmlRootElement;

@Setter
@Getter
@SuperBuilder
@NoArgsConstructor
@XmlRootElement
public class Background {
    private String quesNumber;
    private String quesResponse;

}
