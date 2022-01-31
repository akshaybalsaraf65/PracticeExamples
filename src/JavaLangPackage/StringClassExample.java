package JavaLangPackage;

public class StringClassExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		String
//
//		case 1
		
		String s = new String("ak");
		s.concat("aki");
		System.out.println(s);
		
//		once we create string object we cant perform any change in existing object if are trying to perform any change with thos changesa a new object will be created this non changable behaviours is nothing but immubility of string
//
//		s-----> ak
//
//		      akaki
		
		StringBuffer sb = new StringBuffer("akk");
		sb.append("akki");
		System.out.println(sb);
		
//		once we create stringbuffer object we can perform any change in the existing object this chanable behaviours is nothing but mutablity of string buffer object
//
//		sb-----> akkakki
		
//		case 2
		
		String s1 = new String("ak");
		System.out.println(s == s1);
		System.out.println(s.equals(s1));
		
//		in string class .equal() is overriden for contain comparision hence even do object are different if containent is same .equals() returns true
		
		StringBuffer sb1 = new StringBuffer("akk");
		System.out.println(sb == sb1);
		System.out.println(sb.equals(sb1));
		
//		in stringbuffer class .equal() not overriden for containt comparision hence object class .equal() got exicuited which is ment for reference comaprisum (address comparision) due to this if object are different .equals() returns false even do containt is same
		
//	case 3

	String s3 = new String("ak");

//	in this case 2 object will be created one in the heap area and other is in scp (String Constant Pool ) and s is always pointing to heap object

	String s4 = "ak";

//	in this case only one object will be created in scp and  s is always point to that object
	
//	Note : 
//
//		1. object createion in scp is optional first it will check is there object already present in scp with required content if object already present than existing object will be reused
//
//		if object not already available than only a new object will be created
//
//		but this rule is applicable only for scp but not for heap
//
//		2. garbej collector is not allowd access scp area hence even do object doent contain reference coolect if  eligiable gc if it is present in scp area
//
//		all scp object will be destroied automatically at the time JVM shutdown
	
	String s5 = new String("ak");
	String s6 = new String("ak");
	String s7 = "ak";
	String s8 = "ak";

//	Note :

//	whenerver we are using new operator compilsory a new object will be created in the heap area hence there may be chance existing 2 object with same containt in heap area but not in scp that is duplicat object are possible in the heap area but not in scp

	String s9 = new String("ak");
	s9.concat("akk");
	String s10 = s9.concat("akki");
	s9 = s9.concat("akkii");

	System.out.println(s9);
	System.out.println(s10);
	
//	Note :
//
//		for every string constant one object will be placed in scp area
//
//		becaus of some runtime operation if and object is required to create that object will be placed only in heap area but not in scp area
	
	String s11 = new String("ak");
	s11.concat("akki");
	String s12 = s11.concat("akak");
	s11 =s11.concat("akak");

	System.out.println(s11);
	System.out.println(s12);
	
	String s13 = new String("akaki");
	String s14 = s13.intern();
	System.out.println(s14);
	}

}
