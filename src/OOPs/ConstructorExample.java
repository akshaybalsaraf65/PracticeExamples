package OOPs;

public class ConstructorExample extends Constructor {

//	demo progam to object created in class
	
	static int count = 0;
	{
		count ++;
	}
	ConstructorExample(){
		super();
		System.out.println("constructor");
//		super();  // Compile Time Error : Constructor call must be the first statement in a constructor
	}
	
	ConstructorExample(int i){
	}
	
	ConstructorExample(double d){
	}
	
	
	int x = 200;
	
	public void m1() {
		System.out.println(this.x);
		System.out.println(super.x);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ConstructorExample c = new ConstructorExample();
		ConstructorExample c1 = new ConstructorExample(10);
		ConstructorExample c2 = new ConstructorExample(10.5);
		System.out.println("the no of object created : " +count);
		c.m1();
	}

}
