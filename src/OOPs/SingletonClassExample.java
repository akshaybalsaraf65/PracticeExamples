package OOPs;

public class SingletonClassExample {

	private static SingletonClassExample s = new SingletonClassExample();
	
	private SingletonClassExample() {
		
	}
	
	public static SingletonClassExample getSingletonClassExample() {

		return s;	
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SingletonClassExample s1 = SingletonClassExample.getSingletonClassExample();
		
		SingletonClassExample s2 = SingletonClassExample.getSingletonClassExample();
	}

}
