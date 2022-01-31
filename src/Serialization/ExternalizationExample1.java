package Serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class ExternalizationExample1 {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		// TODO Auto-generated method stub

		ExternalizationExample ex = new ExternalizationExample("akshay", 20,20);
		FileOutputStream fos = new FileOutputStream("abc100720211111.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(ex);
		
		FileInputStream fis = new FileInputStream("abc100720211111.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		ExternalizationExample ex1 = (ExternalizationExample) ois.readObject();
		System.out.println(ex1.s);
		System.out.println(ex1.i);
		System.out.println(ex1.j);
		
	}

}
