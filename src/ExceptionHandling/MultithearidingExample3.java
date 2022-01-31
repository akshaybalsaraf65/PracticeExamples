package ExceptionHandling;

public class MultithearidingExample3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(Thread.currentThread().getPriority());
		Thread.currentThread().setPriority(7);
		System.out.println(Thread.currentThread().getPriority());
		MultithearidingExample2 m = new MultithearidingExample2();
		Thread t = new Thread(m);  // target runnable
		t.setPriority(9);
		t.start();
		System.out.println("*****" + t.getName());
		System.out.println("*****" + t.getPriority());
		
		Thread t2 = new Thread();
		t2.run();
		System.out.println("//////" + t2.getName());
		
		for(int i = 0; i<20;i++) {
			System.out.println("main thread");
		}  // executed main thread
		System.out.println("---->" + Thread.currentThread().getName());
		System.out.println(Thread.MIN_PRIORITY);
		System.out.println(Thread.MAX_PRIORITY);
		System.out.println(Thread.NORM_PRIORITY);
		System.out.println("***///"+ Thread.currentThread().getPriority());
		System.out.println("///***"+ t.getPriority());
	}

}
