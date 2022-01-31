package JAXB;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

public class JAXBExample {

	private static final String FILE_NAME = "jaxb-emp.xml";
	
	public static void main(String[] args) throws JAXBException {
		// TODO Auto-generated method stub
		
		Employee1 emp = new Employee1();
		emp.setId(102);
		emp.setAge(22);
		emp.setName("akaki");
		emp.setGender("Male");
		emp.setRole("employee");
		emp.setPassword("123456");
		
		jaxbObjectToXML(emp);
		Employee1 empFromFile = jaxbXMLToObject();
		System.out.println(empFromFile.toString());
	}
	
	private static Employee1 jaxbXMLToObject() throws JAXBException {
		
		JAXBContext context = JAXBContext.newInstance(Employee1.class);
		
		Unmarshaller un = context.createUnmarshaller();
		
		Employee1 emp = (Employee1) un.unmarshal(new File(FILE_NAME));
		
		return emp;
		
	}
	
	private static void jaxbObjectToXML(Employee1 emp) throws JAXBException {
		
		JAXBContext context = JAXBContext.newInstance(Employee1.class);
		
		Marshaller m = context.createMarshaller();
		
		m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
		
		m.marshal(emp, new File(FILE_NAME));
	}
}
