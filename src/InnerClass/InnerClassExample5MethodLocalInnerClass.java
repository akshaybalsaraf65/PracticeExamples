package InnerClass;

public class InnerClassExample5MethodLocalInnerClass {

	int x = 10;
	static int y = 20;
	
	public void m1() {
		
		class inneraass{
			
			public void m2() {
				System.out.println(x);
				System.out.println(y);
			}
		}
		
		inneraass aa = new inneraass();
		aa.m2();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		InnerClassExample5MethodLocalInnerClass aass = new InnerClassExample5MethodLocalInnerClass();
		aass.m1();
	}

}
