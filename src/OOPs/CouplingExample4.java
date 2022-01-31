package OOPs;

public class CouplingExample4 extends CouplingExample3 implements CouplingInterfaceExample{

	@Override
	public void understand() {
		// TODO Auto-generated method stub
		System.out.println("perfect match");
	}

	
	public static void main(String[] args) {
		CouplingExample2 ce = new CouplingExample2();
		ce.understand();
	}
}
