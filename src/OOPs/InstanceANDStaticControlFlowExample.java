package OOPs;

public class InstanceANDStaticControlFlowExample {

	
	public static String m1(String msg){
		System.out.println(msg);
		return msg;
		}

		public InstanceANDStaticControlFlowExample(){

		m = m1("1");

		}

		{
		m = m1("2");
		}

		String m = m1("3");

		public static void main(String[] arg){
		Object o = new InstanceANDStaticControlFlowExample();

		}

}
