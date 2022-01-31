package OOPs;

public class InstanceANDStaticControlFlow {

	
	{
		System.out.println("FIB");
	}
		static{
		System.out.println("FSB");
		}
		InstanceANDStaticControlFlow(){
		System.out.println("Constructor");

		}

		public static void main(String[] arg){
		
		InstanceANDStaticControlFlow t = new InstanceANDStaticControlFlow();
		System.out.println("main");
		InstanceANDStaticControlFlow t1 = new InstanceANDStaticControlFlow();
		}
		static{
		System.out.println("SSB");
		}
		{
		System.out.println("SIB");
		}


}
