package ExceptionHandling;

public class MultithearidingExample4Yield extends Thread{

	@Override
	public void run() {
		
		for(int i = 0; i < 40; i++) {
			System.out.println("child thread");
			Thread.yield();
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
