package org.transx.model;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@Getter
@NoArgsConstructor
@XmlRootElement
public class Contact {

    private Email email;

    @XmlElement
    public void setEmail(Email email) {
        this.email = email;
    }
}
