package OOPs;

public class TightlyEncapsulatedClass {

//	Tightly encapsulated class :
//
//		a class to set to b tightly encapsulted if and only if evch and every variable declare as private
//
//		weather class contain corresponding getter and setter method are not and wether this method are 
//		declare as public or not this thing we not require to check
	
//      Example :
	
	    private double balance;
	    
	    public double getBalance() {
	    	balance = 0.0;
	    	
	    	return balance;
	    }
	    
//    ?    // which of following class are tightly encapsulated
//    ans    // 

//	 class a{
//	 private int x = 10; // tightly encapsulated class
//	 }
//
//	 class b extends a{
//	 int y = 20;         // Not tightly encapsulated class
//	 }
//
//	 class c extends a{
//	 private int z = 30; // tightly encapsulated class
//	 }
	    
//	  class a{
//	  int x = 10;   // Not tightly encapsulated class
//	  }
//
//	  class b extends a{
//	  private int y = 20;  // Not tightly encapsulated class
//	  }
//
//	  class c exends b{
//	  private int z = 30;  // Not tightly encapsulated class
//	  }
	    
//	  Note : if parent class class not tightly encapsulated than no child class is tightly encapsulated
	    
	    
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
