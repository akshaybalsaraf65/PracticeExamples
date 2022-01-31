package InnerClass;

import InnerClass.InnerClassExample.InnerC;

public class InnerClassExample1 {

	public static void main(String[] args) {
		InnerClassExample i = new InnerClassExample();
		InnerClassExample.InnerC io = i.new InnerC();
		io.m1();
		
		InnerClassExample.InnerC ii = new InnerClassExample().new InnerC();
		ii.m1();
		
		
		new InnerClassExample().new InnerC().m1();
	}
}
