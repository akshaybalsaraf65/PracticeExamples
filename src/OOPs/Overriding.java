package OOPs;

import java.io.IOException;

public class Overriding {

//	whatevere method parent has by default available to child through inheritance if child class not satisfied with 
//	parent class implementaion yhan child is allowed to redefine thr method based on its requirement this process is 
//	called overriding
//
//	the parent class method which is overridden is called overridden method and child class method which is overriding 
//	is called overrding method
	
	 public void property() {
		 System.out.println("cash");
	 }
	 
	 public void marry() throws IOException {
		 System.out.println("abc");
	 }
	 
//	 * in overriding method resulation always takes care by JVM based on run time object and hence overriding 
//	   is also consider as runtime polymorphism or dynamic polymorphism or late binding
	 
	 
//	 rules for overriding
//
//	 1. in overridng method name and argument must be match that is method signature must be same
//
//	 2. in overriding return must be same but this rule is applicable until 1.4 version only from 1.5 version onwards 
//	 we can take co-varient return types according to this child class method return need not be same as parent method 
//	 return type its child method type also allowd
//
//	 class p{
//
//	 public object m1(){
//	 return null;
//	 }
//
//	 }
//
//	 class c extends p{
//
//	 public string m1(){
//	 return null;
//	 }
//
//	 }
//
//	 parent class method return type   object                      number         string        double
//	                                      |                          |                |            |
//	 child class method return type    object|String|StringBuffer  numver|integer   object        int
//	                                     yes                          yes             no           no
//
//	 co-varient retun type concept applicable only for object types but not for primattive types
	 
//	 parent class private method not available to child and hence overriding concept not applicable for private methods
//
//	 based on over rquirement we can defing private method in child class it is valid but not overriding 
	 
	 
	 private void m2() {
		 System.out.println("call private parent");
	 }
	 
//	 we cant override parent class method final in child class if you trying to overriding  we will get compile time error
	 
	 
	  
//	 parent class abstract method we should override in child class to provide implementation
//
//	 abstract class p{
//
//	 public abstract void m1();
//
//	 }
//
//	 class c extends p{
//
//	 public void m1(){
//	 }
//
//	 }public final void m3() {
//		 System.out.println("call final parent");
//	 }
	 
	 
//	 we can override non abstract method as abstract
//
//	 class p{
//
//	 public void m1(){
//	 }
//
//	 }
//
//	 abstract class c extends p{
//
//	 public abstract void m1();
//
//	 }
	 
	 
//  the main adventage of this we can stop availbility of parent method implementaion in the next level child class
	 
//	 in overrideng following modifiers wont keep any restriction like
//	 1. synchronized
//	 2. native
//	 3. stricfp
//
//	 parent method     final      non-final       abstract       synchronized     native
//	                     |           |               |                |                |
//	 child method      non-final   final        non-abstract    non-synchronized  non-native
//	                     no         yes              yes            yes              yes
	 

	 
//	 while overriding we cant reduce scope of access modifiers but we can increase the scope
//
//	 class p{
//
//	 public void m1(){
//	 }
//
//	 }
//
//	 class c extends p{
//
//	 void m1(){
//	 }
//
//
//	 }
//
//
//	 Compile Time Error : m1() in c cannot override m1() in p;
//	                      attempting to assign weather access privilege ; was public
	 
	 
//	 if child class method throws any checked exception compilsory parent class method should throw same 
//	 checked exception are its parents otherwise we will get compile time error but there there are no restruction 
//	 for unchecked exception
//
//
//	 class p{
//
//	 public void m1() throws IOException{
//	 }
//
//	 }
//
//	 class c extends p{
//	 public void m1() throws EOFException,InterruptException{
//	 }
//
//	 }


//	 overriding with respected to static methods
//
//	 we cant override static method as non static otherwise we will get compile time error
	 

	 public static void m1(){

		 System.out.println("call static parent");
	 }

	 public void m3() {
		 System.out.println("call static m3 parent");
	 }
	 
//	 if both parent and child class method static then we wont get any compile time error it seen overridin concept 
//	 applicable for static methods but it is not ovrriding and method hiding
	 
	 
	 public static void m4(){

		 System.out.println("call static parent");
	 }
	 
	 
//	 overriding with respected to var-arg methods
//   we can override var-arg method but another var-arg method only if you try override with normal method than it will become 
//	 overloading but not overriding
	 
	 
	 public void m5(int... x){
		 System.out.println("call var-atg parent");
	 }
	 
//	 in the above program is replace child method with var-arg method than it will become overriding in this case output is
//	 parent
//	 child
//	 child
//
//	 
	 
	 
    int x = 888;
    
    
//    variable resuation always takes care by compiler based on reference type respected of weather variable is 
//    static or non-static (overriding concept applicable only for method but not for variable)
    
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
