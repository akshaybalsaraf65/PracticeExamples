package OOPs;

public class ConstructorExample1 {

	static {
		System.out.println("static block");
	}
	public static void m1() {
		System.out.println("---->");
		m2();
	}
	
	public static void m2() {
		System.out.println("<-----");
		m1();
	}
	
	ConstructorExample1(){
//		this(10);   // Compile Time Error : Recursive constructor invocation ConstructorExample1()
	}
	
	ConstructorExample1(int i){
//		this();   // Compile Time Error : Recursive constructor invocation ConstructorExample1()
	}
	
	ConstructorExample1(double d){
		this();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("hello");
	}

}
