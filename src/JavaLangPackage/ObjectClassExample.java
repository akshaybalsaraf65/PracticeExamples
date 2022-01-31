package JavaLangPackage;

import java.lang.reflect.Method;
import java.util.ArrayList;

public class ObjectClassExample {

	
//	java.lang package
//
//	1. introduction
//	2. object class
//	3. string class
//	4. string buffer class
//	5. string builder class
//	6. wrapper class
//	7. autoboxing and autounboxing
//
//	introduction
//
//	for writing any java program whether it simple or complex the most comly required classes and interfaces are group separate package which is nothing but java.lang package
//
//	we are not required import java.lang package explictly beacuse all class and interface present in lang package by default available to every java program
//
//	java.lang.object
//
//	the most commly required method for every java class (whether it is predefined class or custmized class) or definded separate class which is nothing but object class
//
//	every class in java is the child class of object either directlt or indirectly so that object class method bydefalut available to every java class hence object class is considered as root of all java class
//
//	Note :
//
//	1. if over class deoesnt contain any other class than only over class is direct child class of object
//
//	example
//
//	class a{
//
//	}
//
//	object
//	|
//	|
//	a
//
//	2. if over class extend any other class than over class is indirect child class of object 
//
//	example
//
//	class a extends b{
//
//	}
//
//	object
//	|
//	|
//	b
//	|
//	|
//	a
//
//	conclusion :
//
//	whether dirctly or indirectly java own provide support for multiple inheritance with respected to class
//
//	object class defined the following 11 methods
//
//	public string toString()
//	public native int hashcode()
//	public boolean equals(object o)
//	protected native object clone() throws clonenotsupportedexception
//	protected void finalize() throws throwable
//	public final class getclass()
//	public final void wait() throws interruptedexception
//	public final native void wait(long ms) throws interruptedexception
//	public final void wait(long ms,int ns)throws interruptedexception
//	public native final void  notify()
//	public native final void notifyall()

//	toString()
//
//	we can use toString() to get string representing  of an object
//	String s = Obj.toString();
//
//	whenever we are trying to print object reference internally toString() method will be called
//
//	example
//
//	student s = new student();
//	System.out.println(s);
//
//
//	if over class doent contain toString method than object class tostring method will be executed
	
	String name;
	int rollno;
	
	ObjectClassExample(String name,int rollno){
		this.name = name;
		this.rollno = rollno;
	}
	
	public String toString() {
		return name +"...." +rollno;
	}
	
//	in the above example object class toString() got execured which is implemented was as follows
//
//	public STring toString(){
//
//	return getclass().getname() + "@" + integer.tohexstring(hashcode());
//
//	}
//
//	------------------------------------------
//	| classname@hashcode_in_hexadecimal_form |
//	------------------------------------------
//
//	based on over requirment override toString to provide over iwn string representition
//
//	for example
//	whener you tring to print student object refence to print his name and roll no we havve override tostring method as follows
//
//	in all wrapper class , in all collection class string class string buffer string builder class tostring method is overriden meaningful string representition hence it is highly recommended to override tostring method in over class also
	
//	getClass()
//
//	we can use getClass() to get runtime class defination of n object
//
//	public final class getClass
//
//	by using this class class object we can access class level properties like full qualified name of the class methods information constructor information etc

//	finalize()
//
//	just befor destroing an object garbe  colleor finalize method to perform cleanup activity
//
//	once finalize method complete automatically garbeg collector destroyn object
	
//	we can use this methods for inter thread communication
//
//	that thread which expectiing updation,it is responsible to call wait() than immedittly will entered inti waiting state
//
//	the thread which is responsible updation, after performing updation the thread can call notify() the waiting thread will get notification and continue execution with does updates
	
	public static void main(String[] args) throws ClassNotFoundException {
		// TODO Auto-generated method stub

			int count =0;
			Class c = Class.forName("java.lang.Object");
			Method[] m = c.getDeclaredMethods();
			for(Method m1:m) {
				count++;
				System.out.println(m1.getName());
			}
			System.out.println("The Number of methods:"+ count);
			
			
			int count1 = 0;
			Class cc = Class.forName("java.lang.String");
			Method[] mm = cc.getDeclaredMethods();
			for(Method m1 : mm) {
				count1++;
				System.out.println(m1.getName());
			}
			System.out.println("The Number of methods:"+ count1);
			
			ObjectClassExample ss = new ObjectClassExample("ak", 1);
			ObjectClassExample ss1 = new ObjectClassExample("aki", 2);
			
			System.out.println(ss.name.toString());
			System.out.println(ss.toString());
			System.out.println(ss1);
			
			String ssw= new String ("aa");
			System.out.println(ssw);
			Integer i = new Integer(10);
			System.out.println(i);
			ArrayList l = new ArrayList();
			l.add("ak");
			l.add("aa");
			System.out.println(l);
			ObjectClassExample o = new ObjectClassExample("sas", 10);
			System.out.println(o);
			
			
			
			int count2 =0;
			Object oo1 = new String("ak");
			Class cc1 = oo1.getClass();
			System.out.println(cc1.getName());
			Method[] m3 = cc1.getDeclaredMethods();
			for(Method m1:m3) {
				count2++;
				System.out.println(m1);
			}
			System.out.println(count2);
	}

}
