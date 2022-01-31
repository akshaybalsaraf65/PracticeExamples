package OOPs;

public class StaticControlFlow {

//	    static control flow :
//
//		wheneber is are exeuting java class the following sequence of steps  will be executed as the part of static 
//		control flow
//
//		1. identication of static member from top to bottom [1 to 6 step this example] 
//		2. execution of static variable assigment and static block from top to bottom [7 to 12 step this example]
//		3. exection of main matod [13 to 15 step this example]
	
	
	static int i = 10;
	
	static {
		
		m1();
		System.out.println("first ststic block");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		m1();
		System.out.println("main mathod");
	}
	
	public static void m1() {
		
		System.out.println(j);
	}
	
	static {
		
		System.out.println("second static block");
	}
	
	static int j = 20;
	
	
//	        i = 0[RIWO]
//			j = 0[RIWO]
//			i = 10[R&W]
//			j = 20[R&W]
//
//			inside static block if try to read variable that read operation is called direct read
//			if are calling method within that method if try to read variable that a read operation is called indirect read
//
//			class test{
//
//			Static int i = 10;
//
//			Static{
//
//			m1();
//			System.Out.println(i); -----------> direct read
//
//			}
//
//
//
//			public Static void m1(){
//
//			System.Out.println(i) ----------> indirect read
//
//			}
//
//			}
	
	
//	       if a variable is just identify by JVM and original value not at assigned then the variable is set to be in read 
//	       indirecty and write only state (RIWO)
//	       if a variable is in read indiriectly write only state than we cant perform directy read but we can perform 
//	       indirect read
//	       if we are try to read directly than we will get compile time error saying illegal forward reference
	
	
//	static
//	{
//		System.out.println(x);       // Cannot reference a field before it is defined
//	}
//	
//	static int x = 20;
	
	
//	    static block :
//
//		static block will be executed at a time of class loading hence at a time class loading if perform any activity we have to define that inside static block
//
//		at a time java class loading the currsponding native library should be loaded hence we have to define inside static block
//
//		class test{
//
//		static{
//
//		System.LoadLibrary("native library path");
//
//		}
//
//		}
//
//		after loading every database driver class we have to register driver class to driver manager but inside database driver class there is static block to perform this activity we are not responsible to register explicitly
//
//		class DbDriver{
//
//		static{
//
//		register this driver with drivermanager
//
//		}
//
//		}
	
	
//	within a class declare any number of static block but all this will be static block from top to bottom
//
//	// ? // within writing main method is its possible to print some statement to the console
//	// ans // yes , byusing static block
//
//	class test{
//
//	static{
//
//	System.Out.peintln("Hello a can print");
//	System.exit(0);
//	}
//
//	}
//	
//	
//	static{
//
//		System.out.println("Hello a can print");
//		System.exit(0);
//		}
	
//	static int x = m2();
//
//	public static int m2(){
//
//	System.out.println("Hello  i am print");
//	//System.exit(0);
//	return 0;
//
//	}
	
	{
		
		System.out.println("hello hi i can print");
		//System.exit(0);
	}
	
	static StaticControlFlow t = new StaticControlFlow();
	StaticControlFlow(){
		System.out.println("hello i can print");
        //System.exit(0);
		
		// ? // without writing main method and static block its is possible to print some statement to console

		// ans // Yes ,

//		class test{
//
//		static int x = m1();
//
//		public static int m1(){
//
//		System.Out.println("Hello  i am print");
//		System.exit(0);
//		return 10;
//
//		}
//
//		}
//
//		class test {
//
//		static test t = new test();
//
//		{
//		 System.out.println("hello i can print");
//		 System.exit(0);
//		}
//
//		}
//
//
//		class test{
//
//		static test  t = new test();
//
//		test(){
//
//		System.out.println("hello i can print");
//
//		}
//
//
//		}
//
//      Note :
//
//		from 1.7 verson onwards main method is mandatory to start a program execution hence from 1.7 version onward 
//		without writing main method it is impossible to print some statementto console

	}
}
