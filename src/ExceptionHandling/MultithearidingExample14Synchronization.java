package ExceptionHandling;

public class MultithearidingExample14Synchronization extends Thread{

	
	MultithearidingExample15Synchronization d;
	String name;
	
	MultithearidingExample14Synchronization(MultithearidingExample15Synchronization d,String name){
		
		this.d = d;
		this.name = name;
	}
	
	@Override
	public void run() {
		d.wish(name);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
