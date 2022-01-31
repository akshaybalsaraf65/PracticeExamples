package practiceExample;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class TransientExample2 {

	public static void main(String[] args) throws IOException, IOException, ClassNotFoundException {
		// TODO Auto-generated method stub

		ObjectInputStream in = new ObjectInputStream(new FileInputStream("f.txt"));
		TransientExample ts = (TransientExample) in.readObject();
		System.out.println(ts.id+""+ts.name+""+ts.age);
		in.close();
	}

}
