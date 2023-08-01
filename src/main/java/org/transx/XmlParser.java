package org.transx;

import org.transx.model.Address;
import org.transx.model.Applicant;
import org.transx.model.Background;
import org.transx.model.Transaction;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import java.io.File;
import java.util.ArrayList;

public class XmlParser {
    public static void main(String[] args) throws JAXBException {
        JAXBContext jaxbContext = JAXBContext.newInstance(Applicant.class);

//        Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
//        Transaction transaction = (Transaction) jaxbUnmarshaller.unmarshal(new File("data\\response.xml"));

        Applicant applicant = Applicant.builder().build();
        Address address = Address.builder().build();
        ArrayList<Address> addressList = new ArrayList<>();
        addressList.add(Address.builder().addressCode("1").stateCode("1").countryCode("1").build());
        addressList.add(Address.builder().addressCode("55").stateCode("2").countryCode("3").build());
        applicant.setAddress(addressList);

        ArrayList<Background> backgroundList = new ArrayList<>();
        backgroundList.add(Background.builder().quesNumber("q1").quesResponse("qq1").build());
        applicant.setBackground(backgroundList);

        Marshaller jaxbMarshaller = jaxbContext.createMarshaller();
        jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
        jaxbMarshaller.marshal(applicant, new File("applicant.xml"));
    }
}
