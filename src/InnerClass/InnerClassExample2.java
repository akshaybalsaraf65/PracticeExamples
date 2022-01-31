package InnerClass;

public class InnerClassExample2 {

	int x = 10;
	static int y = 20;
	
	class innerClass{
		
		public void m1() {
			System.out.println(x);
			System.out.println(y);
		}
	}
	
	class innerCC{
		
		int x = 100;
		public void m2() {
			int x = 1000;
			System.out.println(x);
			System.out.println(innerCC.this.x);
			System.out.println(this.x);
			InnerClassExample2 i = new InnerClassExample2();
			System.out.println(i.x);
			System.out.println(InnerClassExample2.this.x);
			
			
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		new InnerClassExample2().new innerClass().m1();
		new InnerClassExample2().new innerCC().m2();
	}

}
