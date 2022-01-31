package ExceptionHandling;

public class MultithearidingExample15Synchronization {

	public synchronized void wish(String name) {
		
		for(int i = 0; i < 10; i++) {
			System.out.print("good morning :");
		
		try {
			Thread.sleep(2000);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		System.out.println(name);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
