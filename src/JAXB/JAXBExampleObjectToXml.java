package JAXB;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

public class JAXBExampleObjectToXml {

	public static void main(String[] args) throws JAXBException, FileNotFoundException {
		
		JAXBContext contextObj = JAXBContext.newInstance(Employee.class);
		
		Marshaller marshallerObj = contextObj.createMarshaller();
		marshallerObj.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
		
		Employee emp1 = new Employee(101, "akaki", 10000);
		
		marshallerObj.marshal(emp1, new FileOutputStream("employee.xml"));
	}
}
