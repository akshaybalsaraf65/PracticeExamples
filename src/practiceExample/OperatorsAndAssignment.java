package practiceExample;

public class OperatorsAndAssignment {

	
	public static int m1(int i) {
		System.out.println(i);
		return i;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Increment
		 * pre-Increment ==> y = ++x; 
		 * post-Increment ==> y = x++;
		 */
		
		/*
		 * Decrement 
		 * pre-Decrement ==> y = --x; 
		 * post-Decrement ==> y = x--;
		 */
		System.out.println("Increment Operator");
		int x = 10;
		int y = 11;
		System.out.println("Value of x : "+x);
		System.out.println("Value of y : "+y);
		y = x++;
		System.out.println("Value of x : "+x);
		System.out.println("Value of y : "+y);
		System.out.println("Decrement Operator");
		int x1 = 10;
		int y1;
		System.out.println("Value of x : "+x1);
		//System.out.println("Value of y : "+y1);
		y1 = --x1;
		System.out.println("Value of x : "+x1);
		System.out.println("Value of y : "+y1);
		
		int x2 = 10;
		int y2 = ++y;
		
		int x3 = 1;
		x3 = x3++;
		System.out.println(x3);
		
		int x4 = 10;
		int y4 = ++(x4);
		System.out.println(x4);
		
		char ch = 'a';
		ch++;
		System.out.println("char value : "+ ch);
		
		 double d = 10.5;
		 d++;
		 System.out.println(d);
		 
		 Byte b1 = 10;
		 b1 = (byte) (b1+1);
		 System.out.println("Byte Value : "+b1);
		 
		 Byte b2 = 10;
		 b2++;
		 System.out.println(b2);
		 
		 Byte  b3 = 10;
		 Byte b4 = 20;
		 Byte b5 = (byte) (b3 + b4);
		 System.out.println(b5);
		 
		// Arithmatic Operators(+,-,*,/,%)
		 
		// max(int,type of a,type of b)
		 int i = 10;
		 int i1 = 20;
		 int i2 = i + i1;
		 System.out.println(i2);
		 
		 char ch1 = 'a';
		 char ch2 = 'b';
		 
		 System.out.println(ch1 + ch2);
		 System.out.println(ch1 + 0.95);
		 
		/*
		 * byte + byte = int 
		 * byte + short = int 
		 * short + short = int 
		 * byte + long = long
		 * long + double = double 
		 * float + long = float 
		 * char + char = int 
		 * char + double = double
		 */
		// System.out.println(10/0); java.lang.ArithmeticException: / by zero
		 
		// String Concatentaion Operators (+)
		 String str = "akak" + "askks";
		 System.out.println(str);
		 System.out.println(str + x +y+x+y);
		 System.out.println(y + x + str);
		 System.out.println(x +y +str + x +y);
		 
		// Relational Operator (<,<=,>,>=)
		 System.out.println(10<20);
		 System.out.println('a'<10);
		 System.out.println('a'<97.6);
		 System.out.println('a'>'A');
		 // System.out.println(true < false); // Compile Time Error
		 
		 // equlity operators (==,!=)
		 
		 System.out.println(10 == 20);
		 System.out.println('a' == 'b');
		 System.out.println('a' == 97.0);
		 System.out.println(false == false);
		 
		 Thread t = new Thread();
		 Object o = new Object();
		 String s = new String();
		 System.out.println(t == o);
		 System.out.println(o == s);
		 // System.out.println(s == t);  // Compile Time Error
		 
		 // Difference between == operator & .equals() method
		 
		 // == operator reference comparisum
		 // .equals() cotaint comparator
		 // example
		 String s1 = new String("akshay");
		 String s2 = new String("akshay");
		 String s3 = null;
		 
		 System.out.println(s1 == s2);
		 System.out.println(s1.equals(s2));
		 System.out.println(s3 == null);
		 System.out.println(null == null);
		 
		 // Instance Of Operator
		 Thread t1 = new Thread();
		 System.out.println(t1 instanceof Thread);
		 System.out.println(t1 instanceof Object);
		 System.out.println(t1 instanceof Runnable);
		 
		 // Bitwise Operators(&,l,^)
		 // & -> AND ==> return true if both arguments are true
		 // OR -> OR ==> return true if atleast one argument in true
		 // ^ -> X-OR ==> return true if both arguments are different
		 // Example System.out.println(true & false); false
		 //         System.out.println(true | false); true
		 //         System.out.println(true ^ false); true
		 
		 System.out.println(4 & 5);
		 System.out.println(4 | 5);
		 System.out.println(4 ^ 5);
		 
		 // Bitwise Complement Operator (N)
		 // System.out.println(~true); // Compile Time Error use for Integer
		 System.out.println(~4);
		 
		 // Boolean Complement Operator (!)
		 // System.out.println(!4); //Compile Time Error use for Boolean
		 System.out.println(!true);
		 
		 // Short-Circuit Operators (&&,||)
		 
		 int x6 = 10;
		 if(++x6 < 10 && (x6/0 > 10)) {
			 System.out.println("Hello");
		 }else {
			 System.out.println("Hi");
		 }
		 
		 // Type-Cast Operator
		 // 1. Implicit Type-catogry
		 // 2. Explict Type-catogry
		 
		 int x7 = 'a';
		 System.out.println(x7);
		 
		 double d1 = 10;
		 System.out.println(d1);
		 
		 int x8 = 150;
		 short ss = (short) x8;
		 System.out.println(ss);
		 Byte bb = (byte) x8;
		 System.out.println(bb);
		 
		 // Assignment Operator
		 // three types of assignment operators
		 // 1. Simple :
		 int a = 10;
		 int b,c,d2;
		 // 2. Chained :
		  a= b = c = d2 = 20;
		  System.out.println(a);
		 // 3. Compound :
		  a += 20;
		  System.out.println(a);
		  int vv = a = b=c=d2=30;
		  System.out.println(a);
		  System.out.println(vv);
		  
		  int cc = 10;
		  cc += 20;
		  System.out.println(cc);
		  
		  byte bb1 = 10;
		  bb1 = (byte) (bb1 +1);
		  System.out.println(bb1);
		  
		  byte bb2 = 10;
		  bb2++;
		  System.out.println(bb2);
		  
		  byte bb3 = 10;
		  bb3+=3;
		  System.out.println(bb3);
		  
		  byte bb4 = 127;
		  bb4 +=3;
		  System.out.println(bb4);
		  
		//  Conditional Operator (?:)
		// Syntax :  
		  int x9 = (10<20)?30:40;
		  System.out.println(x9);
		  int x10 = (10>20)?30:((40>50)?60:70);
		  System.out.println(x10);
		  
		// new Operator
		// create new object
		  
		  OperatorsAndAssignment op = new OperatorsAndAssignment();
		  
		// [] Operator
		// declare and create array use
		  
		  int[] x11 = new int[10];
		  
		// Evaluation Order Of Java Operators :
		  
		  System.out.println(m1(1) + m1(2) * m1(3) / m1(4) + m1(5) * m1(6));
		  
        // new vs newInstance()
	    // instanceof vs isInstance()
		// ClassNotFoundException vs NoClassDefFoundError
		  
		// new ==>> create new object
		  OperatorsAndAssignment op1 = new OperatorsAndAssignment();
		// newInstance ==> there are some places we cant use new operator in particular case newInstance operator
		/*
		 * try { String[] agrd = {"akshay","ak"}; args = agrd; Object od =
		 * Class.forName(agrd[0]).newInstance();
		 * System.out.println("Object created for " + od.getClass().getName()); } catch
		 * (InstantiationException e) { // TODO Auto-generated catch block
		 * e.printStackTrace(); } catch (IllegalAccessException e) { // TODO
		 * Auto-generated catch block e.printStackTrace(); } catch
		 * (ClassNotFoundException e) { // TODO Auto-generated catch block
		 * e.printStackTrace(); }
		 */
		  System.out.println(op1 instanceof OperatorsAndAssignment);
		/*
		 * Thread tt = new Thread(); try {
		 * System.out.println(Class.forName(args[0]).isInstance(tt)); } catch
		 * (ClassNotFoundException e) { // TODO Auto-generated catch block
		 * e.printStackTrace(); }
		 */
	}

}
