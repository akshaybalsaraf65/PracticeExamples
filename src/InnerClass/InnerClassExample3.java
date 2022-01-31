package InnerClass;

public class InnerClassExample3 {

	
	class innera{
		
		
		class innerb{
			
			public void m1() {
				System.out.println("txt");
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		InnerClassExample3 ww = new InnerClassExample3();
		InnerClassExample3.innera aawe = ww.new innera();
		InnerClassExample3.innera.innerb ewee = aawe.new innerb();
		ewee.m1();
		
		InnerClassExample3.innera.innerb aa = new InnerClassExample3().new innera().new innerb();
		aa.m1();
		
		new InnerClassExample3().new innera().new innerb().m1();
	}

}
