package ExceptionHandling;

import Multithereading.MultithearidingExample;

public class MultithearidingExample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MultithearidingExample m = new MultithearidingExample();
		m.start();
		
		for(int i = 0; i < 20; i++) {
			System.out.println("main thread");
		}
		m.start();
	}

}
