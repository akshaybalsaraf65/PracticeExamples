package Multithereading;

public class MultithearidingExample20Deadlock {

	public synchronized void d1(MultithearidingExample21Deadlock m) {
		
		System.out.println("thread 1");
		
		try {
			
			Thread.sleep(2000);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		System.out.println("thread 1 call method");
		m.last();
	}
	
	public synchronized void last() {
		System.out.println("last mathod");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
