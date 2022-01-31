package ExceptionHandling;

public class MultithearidingExample11Sleep {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		for(int i = 1; i <= 10; i++) {
			System.out.println("ak" +i);
			Thread.sleep(2000);
		}
	}

}
