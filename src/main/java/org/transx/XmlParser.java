package org.transx;

import org.transx.model.*;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import java.io.File;
import java.util.ArrayList;

public class XmlParser {

/*    public String niprResponse() throws JAXBException {

        //for every transaction xml
        String transactionXml = "";

        String finalNiprResponse = "";
        int transactionCount = 10;

        while (transactionCount < 0) {
            //make splited request
            //get splited transactionXml response
            Transaction transaction = parseResponseXmlToTransaction(transactionXml);
//            parseFinalResponseXml(transaction);
        }
    }*/

    public Transaction parseResponseXmlToTransaction(String transactionXml) throws JAXBException {
        JAXBContext jaxbContext = JAXBContext.newInstance(Transaction.class);
        Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
        return (Transaction) jaxbUnmarshaller.unmarshal(new java.io.StringReader(transactionXml));
    }


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

        TransHead trnasHead = TransHead.builder().timeStamp(23423432L).dateStamp(234234L).build();

        applicant.setTransHead(trnasHead);

        Marshaller jaxbMarshaller = jaxbContext.createMarshaller();
        jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
        jaxbMarshaller.marshal(applicant, new File("applicant.xml"));
    }
}
