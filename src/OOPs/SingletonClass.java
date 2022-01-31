package OOPs;

public class SingletonClass {

	
//	singleton class :
//
//		for any java class if allowed to crete only one object such type class is called singleton class
//
//		example
//
//		runtime
//		businessdelecate
//		servicelocator
//
//		advantage of singleton class
//
//		if servral peopal have same requirement than it is not requirement to create a separate object for every requirement
//		we have to create only one object and we can reuse same object every similar requirement so that 
//	    performance and memory utilication will be improve this is a central idea of singleton class
//
//		example
	
//	how to create over own singleton class
//
//	we can create over own singleton class for this 
//	we have to use private constructor and private static variable and public factory method
//
//	apporach 1
	
//	private static SingletonClassExample s = new SingletonClassExample();
//	
//	private SingletonClassExample() {
//		
//	}
//	
//	public static SingletonClassExample getSingletonClassExample() {
//
//		return s;	
//	}
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//
//		SingletonClassExample s1 = SingletonClassExample.getSingletonClassExample();
//		
//		SingletonClassExample s2 = SingletonClassExample.getSingletonClassExample();
//	}
	
//	Note :
//
//    runtime class is internally implemented by using this approach
	
//	approach 2
//	
//	private static SingletonClassExample1 s = null;
//	
//	private SingletonClassExample1() {
//		
//	}
//	
//	public static SingletonClassExample1 getSingletonClassExample1() {
//		if(s == null) {
//			s = new SingletonClassExample1();
//		}
//		return s;
//	}
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//
//		SingletonClassExample1 s3 = SingletonClassExample1.getSingletonClassExample1();
//		
//		SingletonClassExample1 s4 = SingletonClassExample1.getSingletonClassExample1();
//	}
	
//	at any point of time for test class we can create only one object hence test class is singleton class
	
//	class is not final but we are not allowed to create child class how it is possible
//
//	by declaring every constructor as private we can restrick child class creation
//
//	class p{
//
//	private p(){
//
//	}
//
//	}
//	class c extends p{
//
//
//	}
//
//	for above class it is imposible to create child class
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Runtime s = Runtime.getRuntime();
		Runtime s1 = Runtime.getRuntime();
		Runtime s2 = Runtime.getRuntime();
	}

}
