package Serialization;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class SerializationExample4 implements Serializable{

	String username = "akshay";
	transient String password = "12345";
	transient int pinno = 1234;
	
	private void writeObject(ObjectOutputStream oos) throws Exception{
	
		oos.defaultWriteObject();
		String password = "12345" + this.password;
		oos.writeObject(password);
		int pinno = 1234 + this.pinno;
		oos.writeInt(pinno);
	}
	
	private void readObject(ObjectInputStream ois) throws Exception{
		
		ois.defaultReadObject();
		String password = (String) ois.readObject();
		this.password = password.substring(5);
		int pinno = (int) ois.readInt();
		this.pinno = pinno - 1234;
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
