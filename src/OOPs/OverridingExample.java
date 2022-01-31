package OOPs;

import java.io.IOException;

public class OverridingExample extends Overriding {
	
	@Override
	public void marry() throws IOException {
		// TODO Auto-generated method stub
		System.out.println("xyz");
		super.marry();
	}
	
	private void m2() {
		System.out.println("call private child");
	}
	
//	public void m3() {
//		// TODO Auto-generated method stub
//
//	}
//  Compile Time Error final method cant overriding
	
	
//	public  void m1() {
//		System.out.println("call static child");
//	}
// compile Time Error static method cant override
	
	
	public static  void m1() {
		System.out.println("call static child");
	}
	
	
//	similary we cant override non static method as static
//	@Override
//	public static void m3() {
//		// TODO Auto-generated method stub
//		super.m3();
//	}
// Compile Time Error cant override non static method as static
	
	
	public static void m4() {
		// TODO Auto-generated method stub
		System.out.println("call static child");

	}
	
	
	public void m5(int... x) {
		// TODO Auto-generated method stub
		System.out.println("call var-arg child");
		super.m5(x);
	}
	
	
    int x = 999;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("first call parent");
		Overriding o = new Overriding();
		o.property();
		try {
			o.marry();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		o.m1();
		o.m4();
		System.out.println("------------");
		o.m5(10);
		System.out.println(o.x);
		
		System.out.println("second call child");
		OverridingExample oe = new OverridingExample();
		oe.property();
		try {
			oe.marry();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		oe.m2();
		oe.m1();
		oe.m4();
		System.out.println("------------");
		oe.m5(45);
		System.out.println(oe.x);
		
		System.out.println("than call parent reference child object");
		Overriding o1 = new OverridingExample();
		o1.property();
		try {
			o1.marry();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		o1.m1();
		o1.m4();
		System.out.println("------------");
		o1.m5(56);
		System.out.println(o1.x);
		
		
		
		// OverridingExample oe1 = new Overriding();
	}

}
