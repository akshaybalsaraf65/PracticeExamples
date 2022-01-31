package Serialization;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerializationExample1 {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		// TODO Auto-generated method stub

		SerializationExample s = new SerializationExample();
		SerializationExample2 ss1 = new SerializationExample2();
		SerializationExample3 ss2 = new SerializationExample3();
		File f = new File("abc10072021.txt");
		System.out.println(f.exists());
		Boolean flag = f.exists();
		if(!flag) {
			f.createNewFile();
		}
		
		FileOutputStream fos = new FileOutputStream(f);
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(s);
		oos.writeObject(ss1);
		oos.writeObject(ss2);
		
		FileInputStream fis = new FileInputStream(f);
		ObjectInputStream ois = new ObjectInputStream(fis);
//		SerializationExample ss	= (SerializationExample) ois.readObject();
//		SerializationExample2 se2	= (SerializationExample2) ois.readObject();
//		SerializationExample3 se3	= (SerializationExample3) ois.readObject();
//		System.out.println(ss.i);
//		System.out.println(ss.j);
//		
//		System.out.println(se2.k);
//		System.out.println(se2.m);
//		
//		System.out.println(se3.o);
//		System.out.println(se3.p);
		
		Object o = ois.readObject();
		
		if(o instanceof SerializationExample) {
			System.out.println(((SerializationExample) o).i);
			System.out.println(((SerializationExample) o).j);
		}else if(o instanceof SerializationExample2) {
			System.out.println(((SerializationExample2) o).k);
			System.out.println(((SerializationExample2) o).m);
		}else if(o instanceof SerializationExample3) {
			System.out.println(((SerializationExample3) o).o);
			System.out.println(((SerializationExample3) o).p);
		}
		
		SerializationExample4 se4 = new SerializationExample4();
		System.out.println(se4.username);
		System.out.println(se4.password);
		System.out.println(se4.pinno);
		
		FileOutputStream fos1 = new FileOutputStream("abc100720211.txt");
		ObjectOutputStream oos1 = new ObjectOutputStream(fos1);
		oos1.writeObject(se4);
		
		FileInputStream fis1 = new FileInputStream("abc100720211.txt");
		ObjectInputStream ois1 = new ObjectInputStream(fis1);
		SerializationExample4 ssee4 = (SerializationExample4)ois1.readObject();
		System.out.println(ssee4.username);
		System.out.println(ssee4.password);
		System.out.println(ssee4.pinno);
		
		SerializationExample6 se6 = new SerializationExample6();
		se6.i = 40;
		se6.j = 40;
		System.out.println(se6.i);
		System.out.println(se6.j);
		
		File f1 = new File("abc1007202111.txt");
		System.out.println(f1.exists());
		Boolean flag1 = f1.exists();
		if(!flag1) {
			f1.createNewFile();
		}
		FileOutputStream fos2 = new FileOutputStream(f1);
		ObjectOutputStream ous2 = new ObjectOutputStream(fos2);
		ous2.writeObject(se6);
		
		FileInputStream fis2 = new FileInputStream(f1);
		ObjectInputStream ois2 = new ObjectInputStream(fis2);
		SerializationExample6 ssee6 = (SerializationExample6)ois2.readObject();
		System.out.println(ssee6.i);
		System.out.println(ssee6.j);
	}

}
