package OOPs;

public class InstanceControlFlow {

	
//	instance control flow

	int i = 10;
	{
	m1();
	System.out.println("first instance block");
	}

	InstanceControlFlow(){
	System.out.println("counstrctor");

	}

	public static void main(String[] arg){
	
	InstanceControlFlow t = new InstanceControlFlow();
	System.out.println("main");
	InstanceControlFlow t1 = new InstanceControlFlow();

	}

	public void m1(){

	System.out.println(j);

	}

	{

	System.out.println("second instance block");

	}

	int j = 20;
	
	
//	whener we are execution a java class first a static cobtrol flow will be executed in static control flow we are 
//	creating object the following sequence even be executed as a part of instance control flow
//
//	1. identification of instance member from top to bottom[3 to 8 step this exanple]
//	2. excution of instance variable assignment and instance block from top to bottom[9 to 14 step this example]
//	3. execution of constructor[15 step this example]
	
	
//	        i= 0[RIWO]
//			j= 0[RIWO]
//			i= 10[R&W]
//			i= 20[R&W]


//	     Note :
//
//		 static control flow is a one time activity which will be perform at time class loading
//		 but instance control is not one time activity it will perform for every object cteation
//		 object creation is the the costly operation if there no specific requirment there not requirement create object
		 
		 
//      instance control folw in parent to child relationship
}
