package JAXB;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

@XmlRootElement
public class Employee1 {

	private int id;
	private String gender;
	private int age;
	private String name;
	private String role;
	private String password;
	@XmlAttribute
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@XmlElement
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	@XmlTransient
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Employee1() {
		super();
	}
	public Employee1(int age, String name, String role, String password) {
		super();
		this.age = age;
		this.name = name;
		this.role = role;
		this.password = password;
	}
	@Override
	public String toString() {
		return "Employee1 [age=" + age + ", name=" + name + ", role=" + role + ", password=" + password + "]";
	}
	
	
}
