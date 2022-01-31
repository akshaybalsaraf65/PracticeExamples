package TestExample;

public class Example extends Test {

	public void m11() {
		System.out.println(10.3/3);
	}
	
	strictfp public void m2() {
		System.out.println(10.3/3);
	}
	
	// calculating sum using strictfp modifier
    public strictfp double sum()
    {
        double num1 = 10e+10;
  
        double num2 = 6e+08;
  
        return (num1+num2);
  
    }
    
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("calling Example class");
		Example e = new Example();
		e.m1();
		System.out.println("calling strictfp method");
		e.m2();
		System.out.println(e.sum());
		Test t = new Test();
		System.out.println(t.t.toString());
		
		Example ee  = new Example();
		System.out.println(ee.t.toString());
		ee.m1();
		
		Test tt = new Example();
		System.out.println(tt.t.toString());
		tt.m1();
		
		Test tr = new Test();
		System.out.println(tr.t.toString());
		tr.m1();
	}

}
