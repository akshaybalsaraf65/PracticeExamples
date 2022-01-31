package FileInputOutput;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterInputOutputExample {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		FileWriter fw = new FileWriter("abc090720211.txt",true);
		fw.write(97);
		fw.write("kshay/nakki");
		char[] ch = {'a','b','c','d'};
		fw.write(ch);
		fw.flush();
		fw.close();
		System.out.println("success");
		
//		we have to inser line separate \n manually which is whereed from system to system it is defaculty to the programmer
//		
//		we can solve this problem by using bufferwritter and printwriter class
	}

}
