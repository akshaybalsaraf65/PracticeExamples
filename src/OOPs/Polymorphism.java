package OOPs;

public class Polymorphism {

//	polymorphism :
//
//		one name but multiple forms is concept of polymorphism
//
//		example 1
//
//		method name is the same but we can apply for different type of arguments(overloading)
//		abs(int)
//		abs(long)
//		abs(float)
//
//		example 2
//
//		method signatue is same but in parent class one type of implementation and in child class another type implementation(overriding)
//
//		class p{
//
//		marry(){
//		System.Out.printlm("abc");
//		}
//
//		}
//
//		class c extends p{
//
//		marry(){
//		System.Out.println("xyz");
//		}
//
//		}
//
//		example 3
//		usese of parent reference to hold child object is concept of polymorphism
//
//		list l = new al();
//		         new ll();
//		         new stack();
//		         new vector();
//
//		parent class reference can be used hold child object but byusing that reference we can call only method available in parent class and we cant call child specific method
//
//		p p = new c();
//		p.m1();
//		p.m2();
//
//		p----> m1();
//		|
//		|
//		|
//		|
//		c----> m2();
//		Compile Time Error : cannot find symbol
//		                     symbol method m2()
//		                     location : class p
//
//
//		but byusing child object reference we can call both parent and child class methods
//
//		c c = new c();
//		c.m1();
//		c.m2();
	
	
//	when we should go for parent reference to hold child object
//
//	if we dont know exect runt time time of object than we should go for parent reference
//
//	example
//	the first element present in arrylist can be any type it may studen type customer object or string buffer object 
//	hence return type of get method is object, we can hold any object
//
//	object o = l.get(0);
	
	
//	-----------------
//	| encapsulation |
//	-----------------
//               |
//               | security
//               |
//	------------------
//	|    oops         |
//	------------------
//          | flexibility   | reusibility
//          |               |
//  -----------------       ---------------
//  | polymorphism   |      | inheritance |
//  -----------------       ----------------
//
//    fig : 3 pilars of oops
	
	
//	-----------------
//	| polymorphism  |
//	----------------------------
//                 /            \
//                /              \
//               /                \
//              /                  \----------
//staticpolymorphism                        dynamic polymorphism
//(or)                                            (or)
//compile timepolymorphism                  run timepolymorphism
//(or)                                             (or)
//early binding                               late binding
//    /\                                   |
//   /  \                                  | 
//  /    \---------                        |
// /               |                       |
//overloading   methodhiding          overriding
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
