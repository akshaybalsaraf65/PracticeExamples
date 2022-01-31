package FileInputOutput;

import java.io.File;
import java.io.IOException;

public class FileInputOutputExample {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		File f = new File("abc09072021");
		System.out.println(f.exists());
		f.createNewFile();
		System.out.println(f.exists());
		
		File f1 = new File("akfio");
		System.out.println(f1.exists());
		f1.mkdir();
		System.out.println(f1.exists());
	}

}
