package OOPs;

public class Coupling {

	
//	coupling
//
//	the degree of dependancy bet the component is called coupling
//
//	if depencancy is more than its is consider as tightly coupling  and if dependancy is less then its consider lossely 
//	coupling
//
//	example
//
//	class a{
//
//	static iny i = b.j;
//
//	}
//
//	class b{
//
//	static int j = c.k;
//
//	}
//
//	class c{
//
//	static int k = d.m1();
//
//	}
//
//	class d {
//
//	public static int m1(){
//	return 10;
//
//	}
//
//	}
//
//	by above compont are set to be tightly couply with other because depency bet componet is more
//	tightly coupling is not good programming pratice because it has server series disadvantage
//	1. without affecting remaing components we cant modify any component and hence inhancement will be diffecult
//	2. it separeses reusuability
//	3. it reduces maintaiblity of the application
//	 hence we have to maintain dependacy bet component as less as  possible that is lossely coupling is a good programming 
// 	 practice
	 
	 CouplingExample ce = new CouplingExample();
	 
	 public void topic() {
		 ce.understand();
	 }
	 
	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Coupling c = new Coupling();
		c.topic();
		
		CouplingExample cce = new CouplingExample(5, 15, 20);
		System.out.println(cce.volume);
		
		CouplingInterfaceExample cie = new CouplingExample1();
		cie.understand();
		
		CouplingInterfaceExample cie1 = new CouplingExample2();
		cie1.understand();
		
		CouplingInterfaceExample cie2 = new CouplingExample3();
		cie2.understand();
		
		CouplingInterfaceExample cie3 = new CouplingExample4();
		cie3.understand();
		
		cce.Box(25, 56, 25);
		System.out.println(cce.getVolume());
		
	
	}

}
