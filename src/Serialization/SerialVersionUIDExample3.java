package Serialization;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class SerialVersionUIDExample3 {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		// TODO Auto-generated method stub

		FileInputStream fis = new FileInputStream("abc1007202111111.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		SerialVersionUIDExample svu = (SerialVersionUIDExample) ois.readObject();
		System.out.println(svu.i);
		System.out.println(svu.j);
		System.out.println(svu.k);
	}

}
