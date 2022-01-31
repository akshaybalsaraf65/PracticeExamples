package FileInputOutput;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderInputOutputExample {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

//		constructors
//		
//		FileReader fr = new FileReader(String fileName);
//		
//		FileReader fr = new FileReader(File file);
		
//		methods
//		
//		read();
//		int i = fr.read();
		
//		FileReader fr = new FileReader("abc090720211.txt");
//		int i = fr.read();
//		while(i != -1) {
//			System.out.println((char)i);
//			i = fr.read();
//		}
		
		File f = new File("abc090720211.txt");
		FileReader fr = new FileReader("abc090720211.txt");
		char[] ch = new char[(int) f.length()];
		fr.read(ch);
		for(char ch1: ch) {
			System.out.println(ch1);
		}
		System.out.println("****************************************");
		FileReader fr1 = new FileReader("abc090720211.txt");
		int i = fr1.read();
		while(i != -1) {
			System.out.println((char)i);
			i = fr1.read();
		}
		
	}

}
