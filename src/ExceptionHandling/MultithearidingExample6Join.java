package ExceptionHandling;

public class MultithearidingExample6Join extends Thread{

	
	@Override
	public void run() {
	
		for(int i = 0; i < 10; i++) {
			System.out.println("ak");
			
			try {
				Thread.sleep(2000);
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
