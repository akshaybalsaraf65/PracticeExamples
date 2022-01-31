package InnerClass;

public class InnerClassExample4MethodLocalInnerClass {

	
	public void m1() {
		
		class inneraa{
			
			public void sum(int x, int y) {
				System.out.println("sum is : " + (x+y));
			}
		}
		
		inneraa a = new inneraa();
		a.sum(20, 30);
		a.sum(40, 50);
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		InnerClassExample4MethodLocalInnerClass i = new InnerClassExample4MethodLocalInnerClass();
		i.m1();
	}

}