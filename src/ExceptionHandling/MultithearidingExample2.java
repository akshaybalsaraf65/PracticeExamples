package ExceptionHandling;

public class MultithearidingExample2 implements Runnable{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("////////\\\\\\" + Thread.currentThread().getName());
		System.out.println("////////\\\\\\" + Thread.currentThread().getPriority());
		for(int i = 0; i<20;i++) {
			System.out.println("child thread");
		}  // executed child thread
	}  // job of thread

}
