package practiceExample;

public class varARGSmethod {

	public static void m1(int... x) {
		System.out.println("var-args 1st method" + x.length);
		int total = 0;
		for(int x1 : x) {
			total = total + x1;
		}
		System.out.println(total);
	}
	public static void m2(int x, int... y) {
		System.out.println("value x : " + x);
		System.out.println("value y : " + y);
		System.out.println("var-args 2nd method" + y.length);
		int total = 0;
		for(int x1 : y) {
			total = total + x1;
		}
		System.out.println(total);
	}
	public static void m3(int... x) {
		System.out.println("tested");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Untile 1.4 version we cant declare method with variable number of arguments
		 * if we there is change in number of arguments compilsory we go for new method
		 * it increases length of code and decrease resuability to overcome this problem
		 * some pepole introduced var agrs method in 1.5 version according we can
		 * declare a method which can take variable number of arguments such type method
		 * are called var args methods we can declare var args methods as follows
		 * m1(int... x)
		 * m1();
		 * m1(10);
		 * m1(10,20);
		 * m1(10,20,30,40);
		 */
		m1();
		m1(10);
		m1(10,20);
		m1(10,20,30,40);
		m1(new int[] {10,20,30,40,100});
		
		m2(0);
		m2(10);
		m2(10,20);
		m2(10,20,30,40);
		
		
		m3();
	}

}
