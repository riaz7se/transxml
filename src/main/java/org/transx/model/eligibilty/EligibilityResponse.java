package org.transx.model.eligibilty;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class EligibilityResponse {

    private Applicant applicant;

    private AvailableLicenses availableLicenses;

    @XmlElement
    public void setApplicant(Applicant applicant) {
        this.applicant = applicant;
    }

    @XmlElement
    public void setAvailableLicenses(AvailableLicenses availableLicenses) {
        this.availableLicenses = availableLicenses;
    }
}
