package practiceExample;

import static java.lang.System.out;
import static java.lang.Integer.MAX_VALUE;
import static java.lang.Byte.*;

 class Test {

	/*
	 * private class a{
	 * 
	 * }
	 * 
	 * 
	 * static class b{
	 * 
	 * }
	 * 
	 */
	
	// public , private , protected , default, are  considered as spiciers accept this remin this consider as modifiers but rules is applicable only for old languages like c++ but not in java
	// in java all as consider as modifiers only there is no world like specifiers
	// private class Test at that compile time error modifier private not allowed here
	// public class
	// if class declare as public than we can acess that class anyware
	
	static String s = "akshay";
	static int MAX_VALUE = 999;
	public void  m1() {
		System.out.println("trying to call");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		out.println("akshay");
		System.out.println(MAX_VALUE);
	}

}
