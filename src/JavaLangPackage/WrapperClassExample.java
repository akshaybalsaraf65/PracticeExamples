package JavaLangPackage;

public class WrapperClassExample {

	
//	utility methods
//
//	1. valueof()
//	2. xxxvalue()
//	3. parsexxx()
//	4. tostring()
//
//	1. valueof()
//
//	integrer i = integer.valueof(10);
//		   = integer.valueof("10");
//
//	we can use valueof() to create wrapper object for give premittive or string
//
//	every wrapper class except character class acept contain static value of method to create wrapper object to give string 
//
//	example
//
//	-------------------------------------------
//	| public static wrapper valueof(string s) |
//	-------------------------------------------
//
//	integer i = integer.valueof("10");
//	double d = double.valueof("10");
//	boolean b = integer.valueof("10");
//
//	2. xxxvalue()
//
//	we can use xxxvalue() to get primitive for giver wrapper object
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Boolean x = new Boolean("yes");
		Boolean y = new Boolean("no");
		
		System.out.println(x.equals(y));
		
		Integer i = Integer.valueOf("1111", 2);
		System.out.println(i);
		
		Boolean b = Boolean.valueOf("akaki");
		Boolean p = b.booleanValue();
		System.out.println(p);
		
		String s = "10";
		int ii = Integer.parseInt("1111",2);
		System.out.println(ii);
		
		Integer it = new Integer(10);
		String st = it.toString();
		System.out.println(st);
		
		String ss = Integer.toString(10, 2);
		System.out.println(ss);
	}

}
