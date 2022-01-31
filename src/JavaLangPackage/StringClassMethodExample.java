package JavaLangPackage;

public class StringClassMethodExample {
	
	
//	important methods of string class
//
//	public Char charAt(int index);
//
//	returns that character locating at the specified index
//
//	example
//
//	String s = "akaki";
//	System.out.println(s.charAt(3));
//	System.out.println(s.charAt(30));
//
//	public String concat(String s);
//
//	overloaded + and  + equals operator ment for concatatinations only 
//
//	example
//
//	String s = "akakaki";
//	s = s.concat("akakki");
//	//s = s+"akakki";
//	//s += "akakki";
//	System.out.println(s);
//
//	public boolean equals(object o)
//
//	to perform content comparison where case is important.
//	this is overriding version of object class equals() method
//
//
//	public boolean equalsIgnoreCase(String s)
//
//	to perform content comparison where case is not important
//
//	String s = "aki";
//	System.out.println(s.equals("AKI"));
//	System.out.println(s.equalsIgnoreCase("AKI"));
//
//	Note :
//	in general we can use equalsignorecase() to validate usernames where case is not important whereas we can use equals() to validate password where case is important
//
//
//	public String subString(int being);
//
//	returns substring from begin index to end index of the string
//
//	public String subString(int begin,int end);
//
//	returns substring from begin index to end -1 index
//
//	example
//
//	String s = "akaki";
//	System.out.println(s.subString(3));
//	System.out.println(s.subString(2,6));
//
//	public int length();
//
//	returns number of character in string
//
//	example
//
//	String s = "akaki";
//	System.out.println(s.length());
//
//	Note :
//
//	length variable aplicable for arrays but not for string objects whereas length() aplicable for string objects but not arrays
//
//	public String replace(char oldchar,char newchar);
//
//	example
//
//	String s = "akaki";
//	System.out.println(s.replace('a','k'));
//
//	public String toLowerCase();
//	public String toUpperCase();
//
//	public String trim();
//
//	to remove blank space present at begin and end of string but not middel blank space
//
//	example
//
//	String s = "akaki";
//	System.out.println(s.trim());
//
//	public int indexOf(Char ch);
//
//	returns index of first occurrence of specified character
//
//	public int lastIndexOf(Char ch);
//
//	String s = "akaki";
//	System.out.println(s.indexOf('a'));
//	System.out.println(s.lastIndexOf('a'));
//
//	*** Note :
//
//	because of runtime operation if there is chance in containt than with does changes a new object will be creates on the heap
//
//	if there no change in contant than existing object will be reused on the new object want be created
//
//	whether the object present in heap or scp the rule is same
//
//	String s1 = new String("akaki");
//	String s2 = s1.toUpperCase();
//	String s3 = s1.toLowerCase();
//	System.out.println(s1 == s2);
//	System.out.println(s1 == s3);
//
//	String s4 = s2.toLowerCase();
//	String s5 = s4.toUpperCase();
//
//
//	String s1 = "akaki";
//	String s2 = s1.toString();
//	System.out.println(s1==s2);
//	String s3 = s2.toLowerCase();
//	String s4 = s2.toUpperCase();
//	String s5 = s4.toLowerCase();
//
//	how to create oue own immutable class
//
//	once we create an object we cant perform any changes in that object if are trying to perform any change if there is change in containt than with does changes a new object will be created if there is no changes in containt than existing object will be reused this behaviours is nothing but immutablity
//
//	String s1 = new String("akaki");
//	String s2 = s1.toUpperCase();
//	String s3 = s1.toLowerCase();
//
//	we can create our own immutable class
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		final StringBuffer sb = new StringBuffer("akaki");
		sb.append("akii");
		System.out.println(sb);
		
		final String s = new String("akaki");
		s.concat("akaki");
		System.out.println(s);
	}

}
