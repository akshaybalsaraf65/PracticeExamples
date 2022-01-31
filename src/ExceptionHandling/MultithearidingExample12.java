package ExceptionHandling;

public class MultithearidingExample12 extends Thread{

	@Override
	public void run() {
		
		for(int i = 0; i <= 10000; i++) {
			System.out.println("ak" +i);
		}
		try {
			
			for(int i = 0;i<10;i++) {
				System.out.println("lazy thread");
				Thread.sleep(2000);
			}
		} catch (InterruptedException e) {
			// TODO: handle exception
			System.out.println("interrupted thread");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
