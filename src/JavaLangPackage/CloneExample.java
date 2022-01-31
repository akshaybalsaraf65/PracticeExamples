package JavaLangPackage;

public class CloneExample implements Cloneable {

	int i = 10;
	int j = 20;
	
	public static void main(String[] args) throws CloneNotSupportedException {
		// TODO Auto-generated method stub

		CloneExample ce = new CloneExample();
		CloneExample ce1 = (CloneExample) ce.clone();
		
		ce1.i = 100;
		ce1.j = 200;
		System.out.println(ce);
		System.out.println(ce1);
		
		System.out.println(ce.i + "" + ce.j);
		System.out.println(ce1.i + "" + ce1.j);
	}

}
