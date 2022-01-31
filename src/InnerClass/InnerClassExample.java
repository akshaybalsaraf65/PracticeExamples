package InnerClass;

public class InnerClassExample {

	
//	inner class :
//
//		sometimes we can declare class inside another class such type of classes are called inner class
//
//		inner classes concept introduced in 1.1 version to fixeed GUI bugs as a part event handling but because of powerfull features and benifits of inner classes solwely programmer started using inregular coding also
//
//		without existing one type of object if there is no chance of existing another type of object when you should go for inner class
//
//		example 1
//
//		unveristy consist of servral department without existing university there is no change of existing department hence we have to department inside unversity class
//
//		class university{
//
//			class department{
//
//			}
//
//		}
//
//		example 2
//
//		without existing car object there is no chance of existing engine object hence we have to declare engine class inside car class
//
//		class car{
//
//			class engine{
//
//			}
//		}
//
//		example 3
//
//		map is group of key value pairs and each kay value pair is called n entry whithout existing map object there is no chance of entry object hence interface entry is defined inside map interfaces
//
//		interface map{
//
//			interface entry{
//
//			}
//
//		}
//
//		Note :
//
//		without existing outer class object there is no chance of existing inner class object
//
//		the relation between outer and inner class is not is-a relation and it has-a relationship (composition or aggregation)
//
//		based on position declaration and behavours all inner class are divided into four types
//
//		1. normal or regular inner class
//		2. method local inner class
//		3. anonymous inner class
//		4. static nested class
//
//		if we are declaring any named class directly inside a class without static modifier such type of inner class is called normal or regular inner class
//		
//
//	example 1
	
	
//	inside inner class we cant declare any static members hence we cant declare main method and we cant run inner class direclty from commend prompt
//
//	class outer{
//
//		class inner{
//
//		public static void main(String[] arg){
//		
//		System.out.println("inner class");
//
//		}
//
//	}

//	case 1
//
//	access inner class code from static area of outer class 

	class InnerC{
		
		public void m1() {
			System.out.println("txt");
		}
		
	}
	
//	case 2
//
//	access inner class code from instance area of outer class 

//	within inner class this always referes current inner class object if you want to refer current outer class object we have
//	to use outerclassname.this


	public void m2() {
		System.out.println("tt");
		InnerC c = new InnerC();
		c.m1();
	}
	
//	case 3
//
//	access inner class code from ouside of outer class

//	from normal or regular inner class we can acces both static and non static member of outer class directlt
	
//	method local inner class :
//
//		sometimes we can declar  a class inside a method such type of inner class are called method local inner class
//
//		the purpose of method local inner class is to define method specific repeited requirent function
//
//		method local inner class and best suitable to meet nested method requirement
	
	
	public static void main(String[] args) {
		InnerClassExample in = new InnerClassExample();
		InnerClassExample.InnerC ic = in.new InnerC();
		
		ic.m1();
		
		InnerClassExample.InnerC ii = new InnerClassExample().new InnerC();
		ii.m1();
		
		new InnerClassExample().new InnerC().m1();
		
		
		InnerClassExample io = new InnerClassExample();
		io.m2();
	}
}
