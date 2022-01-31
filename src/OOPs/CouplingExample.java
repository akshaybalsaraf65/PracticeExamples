package OOPs;

public class CouplingExample {

	
	public void understand() {
		System.out.println("Tight coupling concept ---->");
	}
	CouplingExample(){
		
	}
	int volume;
	CouplingExample(int x,int y,int z){
		this.volume = x*y*z;
	}
	
	 private int volume1;
     public void Box(int length, int width, int height) 
     {
         this.volume = length * width * height;
     }
     public int getVolume() 
     { 
         return volume; 
           
     }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
