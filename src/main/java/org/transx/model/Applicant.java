package org.transx.model;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

@SuperBuilder
@NoArgsConstructor
@XmlRootElement
public class Applicant {

    private List<Address> address;

    private List<Background> background;

    @XmlElement(name="Address")
    public List<Address> getAddress() {
        return address;
    }

    public void setAddress(List<Address> address) {
        this.address = address;
    }

    public List<Background> getBackground() {
        return background;
    }

    @XmlElement(name="Background")
    public void setBackground(List<Background> background) {
        this.background = background;
    }
}
