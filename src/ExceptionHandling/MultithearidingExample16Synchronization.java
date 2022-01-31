package ExceptionHandling;

public class MultithearidingExample16Synchronization {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MultithearidingExample15Synchronization mm = new MultithearidingExample15Synchronization();
		MultithearidingExample14Synchronization m = new MultithearidingExample14Synchronization(mm, "ak");
		MultithearidingExample14Synchronization m1 = new MultithearidingExample14Synchronization(mm, "akk");
		MultithearidingExample14Synchronization m2 = new MultithearidingExample14Synchronization(mm, "aki");
		MultithearidingExample14Synchronization m3 = new MultithearidingExample14Synchronization(mm, "aky");
		MultithearidingExample14Synchronization mm4 = new MultithearidingExample14Synchronization(mm, "akki");



		m.start();
		m1.start();
		m2.start();
		m3.start();
		mm4.start();
	}

}
