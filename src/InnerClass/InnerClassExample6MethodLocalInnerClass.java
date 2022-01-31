package InnerClass;

public class InnerClassExample6MethodLocalInnerClass {

	public void m1() {
		
		final int x = 10;
		
		class inner{
			
			public void m2() {
				System.out.println(x);
			}
		}
		
		inner a = new inner();
		a.m2();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		InnerClassExample6MethodLocalInnerClass ss = new InnerClassExample6MethodLocalInnerClass();
		ss.m1();
	}

}
