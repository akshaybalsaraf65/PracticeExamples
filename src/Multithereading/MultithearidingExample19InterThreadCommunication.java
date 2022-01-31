package Multithereading;

public class MultithearidingExample19InterThreadCommunication {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		MultithearidingExample18InterThreadCommunication m = new MultithearidingExample18InterThreadCommunication();
		m.start();
		//m.join();
		//Thread.sleep(10000);
		synchronized(m) {
			m.wait();
		}
		System.out.println(m.total);
	}

}
