package OOPs;

public class InstanceControlFlowExample extends InstanceControlFlow {

	int x = 100;
	{

	m2();
	System.out.println("CFIS");

	}

	InstanceControlFlowExample(){

	System.out.println("child as constructor");
	}

	public static void main(String[] args){

		InstanceControlFlowExample ie = new InstanceControlFlowExample();
	System.out.println("child main");
	InstanceControlFlowExample ie2 = new InstanceControlFlowExample();
	}

	public void m2(){

	System.out.println(y);
	}
	{
	System.out.println("CSIB");

	}

	int y = 200;
	
	
//	whenerver we are creating child class object the following sequency will be performed automatically as the the part of 
//	instance control flow
//
//	1. identification of instance member flow parent to child[4 to 14 step this example]]
//	2. execution of instance variable assignment and instance block only in parent class[15 to 19 step this example]]
//	3. execution of parent constructor[20 step this example]]
//	4. excution of instance variable assignment and instance block in child class[21 to 26 step this example]]
//	5. execution child constructor[27 step this example]
//
//	i =0[RIWO]
//	j =0[RIWO]
//	x =0[RIWO]
//	y =0[RIWO]
//	i =10[R&W]
//	j =20[R&W]
//	x =100[R&W]
//	y =200[R&W]
}
