package practiceExample;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class TransientExample1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		TransientExample te = new TransientExample(1, "ak", 23);
		
		FileOutputStream f = new FileOutputStream("f.txt");
		ObjectOutputStream out = new ObjectOutputStream(f);
		out.writeObject(te);
		out.flush();
		
		out.close();
		f.close();
		System.out.println("success");
	}

}
