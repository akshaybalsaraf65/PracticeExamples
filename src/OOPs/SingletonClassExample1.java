package OOPs;

public class SingletonClassExample1 {

	private static SingletonClassExample1 s = null;
	
	private SingletonClassExample1() {
		
	}
	
	public static SingletonClassExample1 getSingletonClassExample1() {
		if(s == null) {
			s = new SingletonClassExample1();
		}
		return s;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SingletonClassExample1 s3 = SingletonClassExample1.getSingletonClassExample1();
		
		SingletonClassExample1 s4 = SingletonClassExample1.getSingletonClassExample1();
	}

}
