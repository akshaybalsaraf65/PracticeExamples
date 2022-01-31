package ExceptionHandling;

public class MultithearidingExample5Yield {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MultithearidingExample4Yield m = new MultithearidingExample4Yield();
		m.start();
		
		for(int i = 0; i < 40; i++) {
			System.out.println("main thread");
		}

	}

}
