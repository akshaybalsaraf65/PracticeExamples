package OOPs;

public class Encapsulation {

//	Encapsulation :
//
//		the process of binding data and correcponding methods into a single unit is nothing but encapsulation
//
//		example :
//
//		class student{
//
//		data members 
//
//		    +                                    [capsule]
//
//		methods(behavirous)
//
//		}
//
//
//
//		if any compoent follows data hiding and abstraction such type of component is set to be encupsulated component
//
//		encapsulation = data hiding + abstraction
//
//		example : 

	private double balance;
	
	public double getBalance() {
		balance = 0.0;
		// validation
		
		return balance;
		
	}
	
	public double setBalance(double balance) {
		// validation
		this.balance = balance;
		
		return balance;
	}

//	Advantage :
//
//		the main advantage of encapsulation are
//
//		1. we can achive security
//		2. enhasment will become easy
//		3. it improve maintability of the application
	
//	Disadvantage :
//
//		The main advantage is encapsulation is we can achive
//		Security
//		The main disadvantage of encapsulation is it increases length of code and slow down execution


	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
