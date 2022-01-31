package Multithereading;

import java.io.IOException;

public class MultithearidingExample21Deadlock {

	public synchronized void d1(MultithearidingExample20Deadlock m) {
		
		System.out.println("thread 2");
		
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
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
	}

}
