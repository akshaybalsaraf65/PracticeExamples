package OOPs;

public class InstanceANDStaticControlFlowExample1 {

	
	private static String m1(String msg){
		System.out.println(msg);
		return msg;
		}

		static String m = m1("1");

		{

		m = m1("2");

		}

		static{

		m = m1("3");

		}
		public static void main(String[] arg){
		Object obj = new InstanceANDStaticControlFlowExample1();

		}
		
		
//		Note : 
//
//		from static area we cant access instance members directly while executing static area JVM may not identify 
//		instance members
		
		
//		// ? //how many ways we can creating object in java are in how many way in get object in java
//		// ans // 
//
//		1. by using new operator
//
//		test t = new test();
//
//		2. by using new instance() method
//
//		test t = (test) Class.forName("Test).newInstance();
//
//		3. by using factory method
//
//		Runtime r = Runtime.getRuntime();
//		DateFormat df = DateFormat.getInstance();
//
//		4. by using clone method
//
//		test t1 = new test();
//		test t2 = (test) t1.clone();
//
//		5. by using deserialization
//
//		FileInputStream fis = new FileInputStream("abc.sev");
//		ObjectInputStream ois = new ObjectInputStream(fis);
//		dog d2 = (dog)ois.readObject();
		
		
}
