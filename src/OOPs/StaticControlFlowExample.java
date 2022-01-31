package OOPs;

public class StaticControlFlowExample extends StaticControlFlow {

//	static int x = m1();
//	
//	public static int m1() {
//		System.out.println("hello");
//		return 10;
//	}
	
//	{
//		System.out.println("hello");
//	}
	
//	static StaticControlFlowExample ss = new StaticControlFlowExample();
//	StaticControlFlowExample(){
//		System.out.println("hello");
//	}
	
	
//	1. identication of static member from top to bottom [1 to 11 step this example] 
//	2. execution of static variable assigment and static block from top to bottom [12 to 22 step this example]
//	3. exection of main matod [23 to 25 step this example]
	
	
	static int x = 100;

	static{

	m2();
	System.out.println("Deriver first Static Block");
	}

	public static void main(String[] arg){
	m2();
	System.out.println("Derived Main");
	}
	
	public static void m2(){

	System.out.println(y);

	}

	static{
	System.out.println("Deriver Second Static Block");
	}
	static int y = 200;
	
	
//	        i = 0[RIWO]
//			j = 0[RIWO]
//			x = 0[RIWO]
//			y = 0[RIWO]
//			i = 10[R&W]
//			j = 20[R&W]
//			x = 100[R&W]
//			y = 200[R&W]
	
	
}
