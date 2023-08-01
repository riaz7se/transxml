package org.transx.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@Getter
@SuperBuilder
@NoArgsConstructor
@XmlRootElement
public class RespMessage {

    private String actionReqd;

    private String comments;

    @XmlElement
    public void setActionReqd(String actionReqd) {
        this.actionReqd = actionReqd;
    }

    @XmlElement
    public void setComments(String comments) {
        this.comments = comments;
    }
}
