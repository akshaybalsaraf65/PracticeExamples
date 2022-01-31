package ExceptionHandling;

public class MultithearidingExample9Join {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		MultithearidingExample8Join.mt = Thread.currentThread();
		MultithearidingExample8Join m = new MultithearidingExample8Join();
		m.start();
		for(int i =0;i<10;i++) {
			System.out.println("main thread");
		}
	}

}
