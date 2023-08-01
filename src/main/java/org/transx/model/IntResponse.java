package org.transx.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

@Setter
@Getter
@SuperBuilder
@NoArgsConstructor
@XmlRootElement
public class IntResponse {

    private Long dateStamp;

    private List<RespMessage> respMessage;

    private Long timeStamp;


    @XmlElement
    public void setDateStamp(Long dateStamp) {
        this.dateStamp = dateStamp;
    }

    @XmlElement
    public void setRespMessage(List<RespMessage> respMessage) {
        this.respMessage = respMessage;
    }

    @XmlElement
    public void setTimeStamp(Long timeStamp) {
        this.timeStamp = timeStamp;
    }
}
