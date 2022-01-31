package OOPs;

public class IsARelationship {

//	Is-a relationship :
//
//		* inheritance : is-a relationship it is also know as inheritance
//		* extends : the main advantage is-a relationship is code reausuablity
//		* Advantage of is-a relationship reasuibility : by using extend keyword we can implement is-a relationship
//

	
//	example :
//
//		class p{
//
//		public void m1(){
//		System.Out.println("parent");
//		}
//
//		}
//
//		class c extends p{
//
//		public void m2(){
//		System.Out.println("child");
//		}
//
//		}
//
//
//		class test{
//
//		public static void main(String[] args){
//
//		p p = new p();
//		p.m1();  // valid
//		p.m2();  // invalid
//
//		c c = new c();
//		c.m1(); // valid
//		c.m2(); // invalid
//
//		p p1 = new c();
//		p1.m1();  //valid
//		p1.m2();  //invalid
//
//		c c1 = new p();  // invalid
//
//		}
//
//		}
	
	
//	Conclusions :
//
//		1. whatever methods parent has bydiffult available to child and hence child reference we can called both parent 
//	       and child class methods
//
//		2. whatever methods child has by default not available to the parent and hence parent reference we cant call 
//	       child specifie methods
//
//		3. parent reference cant be use to hold child object but byusing that reference we cant call child specifices 
//	       methods but we can call methods presents in parent class
//
//		4. parent reference can be use to hold child object but child referenct cant be use to hold parent object
	
	
//	without inheritance example :
//
//		class vloan{
//		300 methods
//		}
//
//		class hloan{
//		300 methods
//		}
//
//		class ploan{
//		300 methods
//		}
//
//
//	with inheritance example :
//
//		class loan{
//		250 methods
//		}
//
//		class vloan extends loan{
//		50 methods
//		}
//
//		class hloan extends loan{
//		50 methods
//		}
//
//		class hloan extends loan{
//		50 methods
//		}
	
	
//	Note :
//
//		The most commom method which are applicable for any type of child, we have to define in parent class 
//		the specifice method which are applicable for particular child we have to defind in child class
	
//	total java api is implemented based on inheritance concept 
//	1. the most common method which are applicable for any java object are defind in object class 
//	and hence every class in java is a child classs of object either directly or indirectly so that 
//	object class method by default available every java class without rewrithing due to this object class 
//	access root for all java classes 
//
//	2. throwable class define most common method which are required every exception and error 
//	classes hence this class access root for java exception hirecie
	
	
//	Conclusion :
//
//
//		multiple inheritance
//
//		a java classs cant access more than than class at a time hence java own provide support for multiple inheritance in class
//
//		class a extends b,c{
//		}
//
//		invalid Compile Time Error
//
//		Note :
//
//		1. if over class doesent exted in any other class than only over class is direct child class object
//
//		class a {
//
//		}
//
//		a is child of object
//
//		2. if over class extebds any other class than over class is indiect child class of object
//
//		class a extends b{
//
//		}
//
//		b  object
//
//		  a
//
//		object <-- b <-- a
//
//		either directly or indirectly java own provide support for inheritance with respected to classes
//
//		// ? // why java wont provode support for multiple inheritance
//
//		 there may be chance of ambiguity problem hence java own provide support for multiple inheritance
//
//
//		p1 --> m1()             p2 --> m1()
//		    \                     /
//		     \                   /
//		             c
//		           
//		            c.m1();
//		       Ambiguity problem
//
//		but interface cant extend any number of interface simeltionously hence java 
//		provide support for multiple inheritance with respect to interface
//
//		interface a{
//
//		}
//
//		interface b{
//
//		}
//
//		interface c extends a,b{
//
//		}
//
//		// ?  //  why ambiguity problem want be there in interfaces
//
//		pi1 --> m1();              pi2 --> m1();
//		      \                           /
//		       \                         /
//		                ci --> m1();
//		                    |
//		                    |
//		                implementation class
//		                  m1(){
//
//		                  }
//
//		event do multiple method declaration available but implementation is unike and hence there is no chance of 
//		ambicuity problem interfaces
	
	
//	Note :
//
//		strickly speking through interfaces we go any inheritance
	
	
//	cyclic inheritance :
//
//		cyclic inheritence is not allowed in java offcours is not required
//
//		example :
//
//		class a extends a{
//
//		}
//
//		class a extends b{
//
//		}
//
//		class b extends a{
//
//		}
//
//		Compile Time Error :
//		                      cyclic inheritanceinvolving a
		                      
		                      
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
