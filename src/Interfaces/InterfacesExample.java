package Interfaces;

public interface InterfacesExample {

	// Interfaces

/*	1. Introduction
	2. interfaces declaration and implementation
	3. extends vs implements
	4. interface methods
	5. interface variable
	6. interface naming complies
	    (i) method naming complies
	    (ii) variable naming complies
	7. marker interface
	8. adapter classes
	9. interfaces vs adapter class vs concrete class
	10. difference bet interface and abstract class
	11. conclusion
	*/
	
	// def 1 : // any services requirement specification (srs) is nothing but interfaces
	// def 2 : // any contract between client and services provider is nothing but interfaces
	//def 3 : // inside interfaces every method is always abstract whethere is declaring are not hence interfaces consider as 100 % adstract class
	
	// summary def // any services requirement specification or any contract bet client and services provider or 100 % pure abstract class is nothing but interfaces
	
	// interfaces declaration & implementation :
	
	public void m1();
	public void m2();
	
	
	/*
	 * interfaces methos always public or abstract intraface interfact void m1();
	 * 
	 * public to make method available to erery implementation claim
	 * 
	 */	
	
	// hence inside intraface the following method declaration are equal
	
	/*
	 * void m3();
	 * public void m3();
	 * abstract void m3();
	 * public abstract void m3();
	 */
	
	// are this method declaration are equal
	// as every intrafaces method is always public and abstract we cant declare intrafece method with the follwing modifiers
	
	/*
	 * public ==> private, protected 
	 * abstract ==> static,final,synchronized,strictfp,native
	 */
	
	// which are following method declation are allowed inside intraface
	// public void m4() {} //invalid
	// public void m5(); //valid
	// protected void m6(); //invalid
	// static void m7(); // invalid
	// public abstract native void m8(); //invalid
	// abstract public void m9(); // valid
	
	// an interface can contain variable the main purpose of intreaface variable is to define requirement level constant
	// every interface variable is always public, static ,final weather is declaring are not
	/*
	 * public to make this variable to every implementation class 
	 * static withod existing object also, implementation class cant access this variable 
	 * final if one implementation class changes value than reamining implementation class will sbe effected to restrict this erery intrafaces variable is always final
	 */
	
	//hence within interface the folling variable declaration are equals
	
	// as erery interfaces  variable is always public , static , final  we cant declare with folling modifiers  
	// public , static , final ==> private , protected , transient , volatile
	// for interface variable compilsory we should perform inicilizilation at the time of declaration otherwise we will get compile time error
	// int x8; // compile time error
	
	int x = 10;
	public int x1 = 10;
	static int x2 = 10;
	final int x3 = 10;
	public static int x4 = 10;
	public final int x5 = 10;
	static final int x6 = 10;
	public static final int x7 = 10;
	
	//inside implementation class we can access interface variable but we cant modify values
	
	// interfaces method naming conflix
	
	// case 1 : if 2 interfaces can contain method with same signature and same return type than in implemenentation class we have to provide implementation for only one method
	/*
	 * interface left{
	 * public void mm();
	 * }
	 * interface right{
	 * public void mm();
	 * }
	 * class test implements left,right{
	 * public void mm() {
	 * 
	 * } }
	 */
	// case 2 : if 2 interfaces can contain method with same name but different argument type then in implementation class we have to provide implementation both method this methods access overloaded methods
	/*
	 * interface left{
	 * public void mm();
	 * }
	 * interface right{
	 * public void mm(int i);
	 * }
	 * class test implements left,right{
	 * public void mm() {
	 * 
	 * }
	 * public void mm(int i){
	 * 
	 * } }
	 */
	// case 3 : if 2 interfaces contain a methods with same signature  but different return type than it is impossible to implement both interface simeltinously ( if return are not coverient )
	/*
	 * interface left{
	 * public void mm();
	 * }
	 * interface right{
	 * public int mm();
	 * }
	 * class test implements left,right{
	 *}
	 */
	// ? // Is java class can implement any number of interfaces simeltinously
	// ans // Yes , accept a particular case
	// if 2 interfaces cantains a method with same signature but different return types than it is impossible to implement both interfaces simeltinously
	
	// interfaces variable naming conflix
	
	// 2 interfaces can contain a variable with same name and thair may be chance of variable naming conflix  but we solve this problem by using interfaces names
	/*
	 * interface left{
	 * int x = 777;
	 * }
	 * interface right{
	 * int x = 888;
	 * }
	 * class test implements left,right{
	 * public static void main(String[] args){
	 * System.Out.Println(left.x);
	 * System.Out.Println(right.x);
	 * }
	 *}
	 */
	
	// Marked interfaces or Ability interfaces or Tagged interfaces
	
	/*
	 * if an interfaces doesent contain any method and by implementing intraface if
	 * over object will get some object ability such type of interfaces are called
	 * marker interfaces
	 * 
	 * 1. Seriziable(I)
	 * 2. Clonable(I)
	 * 3. RandomAccess(I)
	 * 4. SingleThreadModel(I)
	 * 
	 * These are marked for some ability
	 */
	
	/*
	 * example 1. by implementing seriziable interfaces over objects can be saved to
	 * file and can traveel accross the network example 2 by iimplementing clonable
	 * interfaces over object or position to produce axectly duplicate clone object
	 * 
	 * // ? // without having any methods how the object get some ability in marker
	 * interfaces // ans // internally JVM is responsible to provide required
	 * ability
	 * 
	 * // ? // why JVM is provide required ability in marker interfaces // ans // to
	 * reduce complicity of programming and to make java language as simple
	 * 
	 * // ? // Is it possible create over own marker interface // ans // Yes , but
	 * customization JVM is required
	 */
	
	// Adapter interface
	
	public int m3();
	public int m4();
	
	//Adapter class is simple java class that implements an interface with only empty implementation
	/*
	 * interface x{
	 * m1(); 
	 * m2(); 
	 * m3(); 
	 * . 
	 * . 
	 * . 
	 * . 
	 * m1000(); 
	 * }
	 */
	//abstract class abapterx implements x{
	//m1(){}
	//m2(){}
	//m3(){}
	//m4(){}
	//m5(){}
	//.
	//.
	//.
	//.
	//m1000(){}
	//}

	//if we implement an interface for each erery method an interface compilsory we should implementation whether it is required are not required
	//interface x{
	//m1();
	//m2();
	//m3();
	//.
	//.
	//.
	//.
	//m1000();
	//}
	/*
	 * class abapterx implements x{
	 *   m1(){}
	 *   m2(){} 
	 *   m3(){}
	 *   m4(){} 
	 *   m5(){} 
	 *   . 
	 *   . 
	 *   . 
	 *   .
	 * m1000(){} } 
	 * 
	 * class test implements x{
	 *  m3(){ } 
	 *  m1(){} m2()
	 *  {} 
	 *  . 
	 *  . 
	 *  . 
	 *  . 
	 *  m1000(){}
	 * }
	 */
	/*
	 * the problem in this approach is it increases length of the code and reduces
	 * reduiliblity we can solve this problum by using adapter class insted of
	 * implementing interfaces if exteding adapter calss we have to provide
	 * implentation only for required method and we not responsiblable for each and
	 * erery method of interfaces so that legth of code will be reduced
	 */
	/*
	 * class test extends adapterx{
	 *  m1(){ } 
	 *  } 
	 *  class sample extends adapterx{ 
	 *  m2(){ }
	 * } 
	 * class demo extends adapterx{
	 * m1000(){ }
	 * }
	 */
	
	// Note : marker interface and adapter class simplifies complicity of programming and this are best utilities to the programmer and promer life will become simple
	
	// interfaces  vs abstract class vs concrete class
	
	// interfaces  vs abstract class vs concrete class

	// if we dont know anything abou implementation just have requiremet specification than shouuld go for interfaces

	// example : 
	//  servelet(I)

	// if we are about implementation but not completely (partially implementation) than we should go for abstract class

	// example :
	 // genericservlet(Ac)
	 // httpservlet(ac)

	// if we are talking about implementations complementaly and ready to provide service than should go for concreate class

	// example :
	 // myownservlet

	 //                      -----------
	// Interface  ----------> | servlet(I) |   --------> plan
	     //                    -----------
	// |                          |                     |
	// |                          |                     |
	   //                     -------------------
	// Abstract class  ------> | genericservlet(ac) | --->parially completely building                       
	  //                       | httpservlet(ac)    |
	    //                      ------------------
	// |                          |                      |
// 	|                          |                      |
	//                          ------------- 
	// concreate class ------->| myownservlet |----> fully completely building
	   //                       -------------
	
	
	// difference interface and abstract class

	// interface
	// 1. if we dont konw anything about implementation and just we have requirement specification than we should go for interfaces
	 
	// 2. inside interface every method always public and abstract whether we declareing are not 
	// hence interface is consider as  100 %  pure abstract class

	// 3. as erery interface method is alway public and abstract
	 // hence we can delclare following modifiers
	// private proteded final static synchronizesd native and strictfp

	//4 .every varibale present interface is always public static final whethere are declar are not

	// 5. as a every interface variable is always public static final we cant declare  with following modifiers 
	// private protected volitile transient

	// 6. for interface variable compilsory incilicilation at the time declaration only otherwise we will get compile time error

	// abstract class

	// 1. if we are talking about implementation but not com[pletly (partiall implementation) than shoule go for abstract class

	// 2. every method present inside abstract claass need not be public abstract we take concret method also

	// 3. there are no restriction on abstract class nmethod modifieres

	// 4. every variable present in abstract class need not be public static final

	// 5. there are no restraction on abstract class variable modifiers

	// 6. abstract class variable we not perform initalization at time declaration
	
	// ? // anyway we cant create object for abstract class but abstract class can contain constructor what is need
	// ans // abstract class constructor will be exucted whenover child class object to perform inicilization of child class object
	// more code code redunduncy
	
}
