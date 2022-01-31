package OOPs;

public class IsARelationshipExample2 extends IsARelationshipExample{

	@Override
	public void m1() {
		// TODO Auto-generated method stub
		System.out.println("Child Child Calling");
		super.m1();
	}
	public void m2() {
		System.out.println("Child Calling");
	}
}
