package ExceptionHandling;

public class MultithearidingExample13 {

	public static void main(String[] args) {
		
		MultithearidingExample12 m = new MultithearidingExample12();
		m.start();
		m.interrupt();
		System.out.println("main thread");
	}
}
