package Multithereading;

public class MultithearidingExample18InterThreadCommunication extends Thread{

//	2 thread can communicate each other by using wait , nitify , notity all methods
//	that threa which expection updations is responsible to call wait method than imm tnto waiting statte 
//	the thread which is responsible to perform udation 
	
	int total = 0;
	
	@Override
		public void run() {
		
		synchronized(this) {
		for(int i = 1; i <= 100; i++) {
			total = total + i;
		}
		//this.notify();
		this.notifyAll();
		System.out.println(total);
		}
		}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
