package OOPs;

public class overloading {

//	overloading
//
//	two methos are set to be overloaded if and only if both methods having same name but different argument types
//
//	in clanguage method overloading concept not available hence we cant declare multiple methods with same name 
//	but different arguments types if there is change in argument type compulsory go for new method name which 
//	increases complecity of programming 
//
//	abs(int i) ==> abs(10);
//	abs(long i) ==> abs(10l);
//	abs(float i) ==> abs(10.5f);
//
//	but in java we can declare in methods with same name but different argument types such type of methods 
//	are called overloaded methods
//
//	abs(int i)
//	abs(long i)  // overloading  methods
//	abs(float i)
//
//	having overloading concept in java reduces complxcity of programming
	
	public void m1() {
		System.out.println("empty method no-arg ");
	}
	public void m1(int i) {
		System.out.println("int "+i);
	}
	
	public void m1(double d) {
		System.out.println("double "+d);
	}
	public void m1(String s) {
		System.out.println("string "+s);
	}
	
	
//	* in overloading method resoluation always takes care by compiler based on reference type hence overloading 
//	is also consider as compile time polymorphism and static polymorphism and early binding
	
	
//	byte ----> short ---->
//                        \
//                         ----> int ----> long ----> float ----->double
//                        /
//             char ---->  

	
	//automatic promation in overloading
//case 1 
//while resolving overloaded methodes if exect match match method not available then we wont get any compile time error 
//emideetly first it will promet argument to next level and check whethrt match method is available or not if match method 
//available than it will be considerd if match method not available than compile promatch argument once again to next level 
//this process will be continued antil all possible promations still if matched method not available than we will get compile 
//time error
//the following are all possiable promations in overloading 
//
//this process is called automatic promation in overloading
	

//  case 2
//
//  while resolving overloadled method compile always give president child type argument compile parent type argument
//	public void m1(Object o) {
//		System.out.println("object "+ o);
//	}

	
//	case 3
	
	
	public void m1(StringBuffer sb) {
		System.out.println("stringbuffer "+ sb);
	}
	
//	case 4
	
	public void m1(int i,float f) {
		System.out.println("int-float "+ i + " " + f);
	}
	
	public void m1(float f, int i) {
		System.out.println("float-int "+ f + " " + i);
	}
	
	
//  case 5
	
	public void m1(int... i) {
		System.out.println("var-arg");
	}
	
//	in general var-arg method will get list priority if no other method matched than only var-arg method chance it 
//	exactly same defalt case switch
//
//	case 6
//	
//	class animal{
//
//	}
//
//	class monkey extends animal{
//
//	}
//
//	class test{
//
//	public void m1(animal a){
//	System.Out.println("animal version");
//	}
//	public void m1(mokey m){
//	System.Out.println(monkey version");
//	}
//
//
//
//	public static void main(String[] args){
//
//	test t = new test();
//
//	animal a = new animal();
//	t.m1(); animal version
//
//	monkey m = new monkey();
//	t.m1(); monkey version
//
//	anial a1 = new monkey();
//	t.m1(); animal version
//
//	}
//
//	}
//
//
//	Note :
//
//
//	in overloading method resoluation always take care by compiler based on reference type
//
//	in overloading run time object own to play any role  

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		overloading o = new overloading();
		o.m1();
		o.m1(2);
		o.m1(10.5);
		o.m1("s");
		o.m1('a');
//		o.m1(null);  // Compile Time Error The method m1(String) is ambiguous for the type overloading
		o.m1(new StringBuffer("s"));
		o.m1(10,10.5f);
		o.m1(10.5f,10);
//		o.m1(10,10);  // Compile Time Error The method m1(int, float) is ambiguous for the type overloading
//		o.m1(10.5f,10.5f);  // Compile TIme Error The method m1(float, int) in the type overloading is not applicable 
		                    //                    for the  arguments (float, float)
		
		o.m1();
		o.m1(10,20,30);
	}

}
