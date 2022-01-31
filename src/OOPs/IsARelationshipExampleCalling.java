package OOPs;

public class IsARelationshipExampleCalling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Parent Class Calling>>>>>>>>>>>>>>>>>>>>>>>>>>");
		IsARelationshipExample p = new IsARelationshipExample();
		p.m1();
	//	p.m2();  //  Compile Time Error
		
		System.out.println("Child Class Calling>>>>>>>>>>>>>>>>>>>>>>>>>>");
		IsARelationshipExample2 c = new IsARelationshipExample2();
		c.m1();
		c.m2();
		
		System.out.println("Parent Reference Child Class Object Class Calling>>>>>>>>>>>>>>>>>>>>>>>>>>");
		IsARelationshipExample p1 = new IsARelationshipExample2();
		p1.m1();
	//	p1.m2();  //  Compile Time Error
		
		System.out.println("Child Reference Parent class Object Compile Time Error Class Calling>>>>>>>>>>>>>>>>>>>>>>>>>>");
	//	IsARelationshipExample2 c1 = new IsARelationshipExample();  // Compile Time Error
	}

}
