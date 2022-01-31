package JavaLangPackage;


//autoboxing :
//
//automatic conversion premittive to wrapper object by compiler is called autoboxing
//
//example
//
//integer i = 10;
//
//compiler converts int to integer automatically by autoboxing
//
//afer compiltions above line become
//
//integer i = integer.valueof(10);
//
//internally autoboxing concept is implement byusing valueof()
//
//autounboxing
//
//automatic conver of wrapper object to premitive bycompiler is called autounboxing
//
//integer ii = new integer(10);
//int i = ii;
//
//compiler converts integet into int automatically 
//
//after compileation above line will become
//
//int i = ii.intvalue();
//
//
//that is internally autounboxing concept implemented bysusing xxxvalue()

public class AutoboxingAtounboxingExample {

	static Integer i = 10;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int k = i;
		System.out.println(k);
		m1(5);
	}
	
	public static void m1(Integer l) {
		int j = l;
		System.out.println(j);
	}
	
	public static int m1(int l) {
		
		
		return (int) l;
		
	}
	
	public static void m1(int... l) {
		System.out.println("text");
		
	}

}
