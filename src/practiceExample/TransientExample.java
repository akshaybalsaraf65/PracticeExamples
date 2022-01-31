package practiceExample;

import java.io.Serializable;

public class TransientExample implements Serializable {

	int id;
	String name;
	transient int age;
	
	public TransientExample(int id,String name, int age) {
		this.id = id;
		this.name = name;
		this.age = age;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
