package JAXB;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

public class JAXBExampleXmlToObject {

	public static void main(String[] args) throws JAXBException {
		
		File file = new File("employee.xml");
		JAXBContext jaxbcontext = JAXBContext.newInstance(Employee.class);
		
		Unmarshaller jaxbUnmarshaller = jaxbcontext.createUnmarshaller();
		
		Employee e = (Employee) jaxbUnmarshaller.unmarshal(file);
		
		System.out.println(e.getId());
		System.out.println(e.getName());
		System.out.println(e.getSalary());
	}
}
