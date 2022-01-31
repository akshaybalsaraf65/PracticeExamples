package Multithereading;

public class MultithearidingExample22Deadlock extends Thread{

	MultithearidingExample20Deadlock m1 = new MultithearidingExample20Deadlock();
	MultithearidingExample21Deadlock m2 = new MultithearidingExample21Deadlock();
	
	public void mm1() {
		m1.d1(m2);
	}
	
	@Override
	public void run() {
		m2.d1(m1);
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MultithearidingExample22Deadlock mm = new MultithearidingExample22Deadlock();
		mm.mm1();
	}

}
