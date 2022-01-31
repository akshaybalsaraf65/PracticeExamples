package OOPs;

public class Cohesion {

	
//	cohesion
//
//	for every compoent clear well defind functionality is defind than that component is set to be follow high cohesion
//
//
//	low cohesion
//	high cohesion
//
//
//	high cohesion is always a good programming practice because it has several advantages
//	1. without affecting remaining components we can modify any component hence enhasment will be come easy
//	2. it promates reuablity of the code(where validation is reuired we can reuse same validate servlet without rewriting)
//	3. it improves maintaiblity of applications
//
//	Note loosely couply and high cohesion are good programming practices
	
	
//	example
// high cohesion
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		CohesionExample ce = new CohesionExample();
		System.out.println(ce.mul(10, 20));
		
		CohesionExample1 ce1 = new CohesionExample1();
		System.out.println(ce1.getName("ak"));
		CohesionExample2 ce2 = new CohesionExample2();
		System.out.println(ce2.getAge(23));
		CohesionExample3 ce3 = new CohesionExample3();
		System.out.println(ce3.getNumber(45854545));
		CohesionExample4 ce4 = new CohesionExample4();
		System.out.println(ce4.getaddress("kk"));
	}

}
