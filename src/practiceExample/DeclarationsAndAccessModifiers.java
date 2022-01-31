package practiceExample;

  class DeclarationsAndAccessModifiers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Declarations and Access Modifiers
		 * 1. Java Source File Structure
		 * 2. Class Level Modifiers
		 * 3. Member Lelel Modifiers
		 * 4. Interfaces
		 */
		
		// Java Program can contain any number of classes but atmost one class can be declare as public
		// if there is public class than name of program and name of public class must be matched
		// otherwise  we will get compile time error
		// example
		
		 class a  {
			 
		 }

		 class b {
			 
		 }
		 
		 class c {
			 
		 }
		 
		 // case 1. if there is no public class than we can use any name and there are no restrication like
		 // a.java
		 // b.java
		 // c.java
		 // akshay.java
		 
		 // case 2. if class b is public than name of program should be b.java
		 // otherwise we will get compile time error seeing
		 // CE : class b is public, should be declare in a file named b.java
		 
		 // case 3. if class b and c declared as public and name of program is b.java
		 // than we will get compile time error seeing
		 // CE : class c is public, should be declare in a file named c.java
		 
		 
		// there as name of program and name as class must be matched
		 
		/*
		 * System.out.println("trying to call"); String ts = Test.s;
		 * System.out.println(ts);
		 */
	}

}
  
  class aa{
	  public static void main(String[] args) {
		System.out.println("aa class declare");
	}
  }
  
  class bb{
	  public static void main(String[] args) {
		  System.out.println("bb class declare");
	}
  }
  
  class cc{
	  public static void main(String[] args) {
		  System.out.println("cc class declare");
	}
  }
  
  class dd{
	  public static void main(String[] args) {
		aa a = new aa();
		bb b = new bb();
		cc c = new cc();
	}
  }