package Serialization;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerialVersionUIDExample1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		SerialVersionUIDExample svu = new SerialVersionUIDExample();
		File f = new File("abc1007202111111.txt");
		System.out.println(f.exists());
		Boolean flag3 = f.exists();
		if(!flag3) {
			f.createNewFile();
		}
		
		FileOutputStream fis = new FileOutputStream(f);
		ObjectOutputStream oos = new ObjectOutputStream(fis);
		oos.writeObject(svu);
	}

}
