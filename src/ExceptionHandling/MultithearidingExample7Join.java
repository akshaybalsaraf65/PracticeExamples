package ExceptionHandling;

public class MultithearidingExample7Join {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		MultithearidingExample6Join m = new MultithearidingExample6Join();
		m.start();
		m.join();
		
		for(int i = 0; i < 10; i++) {
			System.out.println("mm");
		}
	}

}
