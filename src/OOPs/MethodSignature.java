package OOPs;

public class MethodSignature {

//	in java method signature consist of methods names followed by arguments types
//
//	public static int m1(int i,float f)
//	               ||
//	               ||
//	              \  /
//	               \/
//	          m1(int,float) <------- method signature
	
	
//	return type is not part of method signature in java
//
//	example
	

//   compiler will use method signature to resolve method call
	
	public void m1(int i) {
		System.out.println(i);
	}
	
	public void m2(String s) {
		System.out.println(s);
	}
	
//	within a class two method with same signature not allowed

//	public void m3(int i){
//
//	}
//
//	public int m3(int i){
//
//	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MethodSignature ms = new MethodSignature();
		ms.m1(2);
		ms.m2("s");
//		ms.m3(10.5); // Compile Time Error: cannot find symbol
		             //                     symbol: method m3(double)
		             //                     location: class test
	}

}
