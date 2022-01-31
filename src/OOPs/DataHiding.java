package OOPs;

public class DataHiding {

//	OOPs Concept
	
//	data hiding
//	abstraction
//	encapulation
//	tightly encapsulated class
//	is-a relationship
//	has-a relationship
//	method signature
//	* overloading
//	* overriding
//	* static control flow
//	* instance control flow
//	* constructors
//	coupling
//	cohesion
//	type-casting
//
//	Data hiding :
//
//	out side person cant access over internal data directly are are internal data should not go out directly this oops features is nothing but data hiding
//
//	after validation or authentications outside person can access internal data 
//
//	example 1:
//
//	after proving proper username and password we can able to access over gmail inbox information 
//
//	example 2:
//
//	even do valid customer of bank we can able to access over account account information and we cant access other account information
//	by declaring data member (variable) as private we canachive data hiding 

//  example :
	
	private double balance;
	
	public double getBalance() {
		balance = 0.0;
		// validation
		
		return balance;
	}
	
//	Advantage :
//
//		 the advantage of data hiding is Security
//		note : is highly recommed to declare data member (variable) as private

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
