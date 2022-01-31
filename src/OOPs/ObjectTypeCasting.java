package OOPs;

public class ObjectTypeCasting {

	
//	object type casting
//
//	we can use parent reference to hold child object
//
//	example
//
//	object o = new String("ak");
//
//	we can use intetface reference to hold implemented class object
//
//	example
//
//	Runnable r = new Thread();
//
//	A b = (c) d;
//	    A                        b                    =            (c)                              d;
//	    |                        |                                  |                               |         
//	class|interface name  name of reference variable        class|interface name           reference variable  name
//
//	1. (compile time checking one that type of d (c) must relation either child to parent and parent to child same type) 
//	other wise we will compile error inconvertable types found : d type reuired c
//
//	example 1
//

	Object o = new String("ak");
	StringBuffer st = (StringBuffer) o;
	
//  example 2
//	
//	String s = new String("ak");
//	StringBuffer sb = (StringBuffer)s;
// Compile Time Error : Cannot cast from String to StringBuffer
	
	
//	within bracket compile time checking 2
//	'c' must be either same or derived type of a otherwise we will get compile time error saying incompatable types 
//	found c required a
//
//	example 1. 

	Object oob = new String("ak");
	StringBuffer sb = (StringBuffer) oob;

//	example 2.

//	Object oos = new String("ak");
//	StringBuffer ssb = (String) oos;
// Compile TIme Error
	
	
//	runtime checking
//
//	runtime object type of d must be either same or derrived type of c otherwise we will get run time exception saying 
//	ClassCastException
//	
//	example 1
	
	Object oot = new String("ak");
	StringBuffer sb1 = (StringBuffer) oot;
	
//	example 2
	
	Object oot2 = new String("ak");
	Object sb2 = (String)oot2;
	
	
//	strickly speking through type casting we are not creating any new object for the existing object we are proving 
//	another type of reference variable that is we performing type castion but not object casting

	String s1 = new String("ak");
	Object o1 = (Object) s1;
	
	

//	-------------------
//	|                 |
//	|       ak        |
//	|                 |
//	-------------------
//    |             |
//    |             |
//	  |             |
//	  |             |
//    String s       Object o
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Object oot = new String("ak");
		Object sb = (String)oot;
		System.out.println(sb);
		
		String ff = new String("ak");
		Object oo = (String) ff;
		System.out.println(oo);
		
		Integer i = new Integer(10);
		Number n = (Number)i;
		Object ir = (Object)n;
		System.out.println(ir);
		System.out.println(i == n);
		System.out.println(n == ir);
	}

}
