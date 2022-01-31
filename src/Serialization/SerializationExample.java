package Serialization;

import java.io.Serializable;

public class SerializationExample implements Serializable{

	
//	introduction :
//
//		serialization :  the process of writer state of object to a file is called serialization but strickly speacking it is process converting an object from java supported form into either file supported from are network supported form
//
//
//
//		byusing fileoutstream and objectoutputstream classes we can achive or we can implement serialization 
//
//											-------------------
//											|		  |
//					----------			________	|		  |
//					|	 |				|	|		  |
//					|	 |		------->	--------|		  |
//					|	 |				--------|		  |
//					|	 |			________|FOS	|		  |
//					----------	          oos.writeobject(d1)	|		  |
//					    d1		    				|		  |
//					  object					|		  |
//											-------------------
//												abc.txt	
//
//
//		deserialization : the process of reading state of an object from the file is called deserialization but strickly speaking it is process of converting object from eother file supported or network supoorted into java supported form
//
//		byusing fileinputstream and objectinputstream we can implement deserialization
//
//													-------------------
//													|		  |
//					----------			________	|		  |
//					|	 	|				|			|		  |
//					|	 |		<-----------	--------|		  |
//					|	 |				--------|		  |
//					|	 |			________|FIS	|		  |
//					----------	         ois.readobject()	|		  |
//					    d2		    				|		  |
//					  object					|		  |
//											-------------------
//												abc.txt
//												
//												

	int i = 20;
	transient int j = 20;
							
		
//	we can serialization only serialization object an object is set to be serializable if and only if the surrespoinding class implement seriazable interface
//	
//	serializable interface present in java.io package and it doesnt contain any methods it is a marker interface
//	
//	if we are trying to serilizae non serializable object than we will get runtime exception saying notseriazialble exception
	
//	transient keywords applicable only for variable but not for methods and class
	
//	we can serialization any number object to the file but in which order we serialization in same order only we have deserialization that is order of object is important in serialization
	
//	object graph :
//		
//	wherever we are serialization an object, the set all object which are reachable from object will be serialization automatically this group of object is nothing but object graph
//	
//	in object graph every object should serialization if atleast one object is not serializable than we will get run time exception not serializable exception
	
//	in above program whenever we are serialization that object automacticall SerializationExample2 , SerializationExample3 serializaable this are part of object graph of SerializationExample
//	
//	among SerializationExample , SerializationExample2 , SerializationExample3 if atleast one object is not serializable than we will get run time exception saying notserizatableexception
	
//	custoimized serialization :
//		
//		during default serialization there may be chance of lost of information because of transient keyword
//	
//	    in above example before serialization SerializationExample4 object can provide proper username and password after deserialization SerializationExample4 object can provide only username but not password this is due to declaring password variable as transient hence during default serializationthey may be chance of lost of onformation because of transient keyword to recover this lost of information we should go for customized serialization
	
//		we can implement customized serialization by using following 2 methods
//		
//		1.	private void writeObject(ObjectOutputStream oos) throws Exception
	
//			this method will be executed automatically at the time of serialization hence at the time serialization if you want to perform any activity we have defind that in this method only
//			
//		2.	private void readObject(ObjectInputStream ois) throws Exception
			
//			this method will be executed automatically at the time of deserialization hence at the time of deserialization if you want perform any activity we have to defind that in this method only
	
//	Note : the above methods are call back methods because this are executed automatically by the JVM
	
//	while performing which object serialization we have to do extra work in the curresponding class we have define above methods for example while performing SerializationExample4 serialization if required to do extra work in the SerializationExample4 class we have to define above methods
	
//	serialization with respected to inheritance :
	
//		case 1
	
//			even do child class doesnt implement serialization we cant serialization child class object if parent serializable interface that is serializable nature is inherited parent to child hence if parent is serializable than bydefault every child is serializable
	
//			Note : object class doesnt implement serializable interface

//		case 2
	
//			even 2 parent object doesnt implement serialization we can serialization child class implents serializable interface that is 2 serialization child class object parent class need not be serializable
	
//			at the time of serialization JVM will check is any variable inheriting from non-serializable parent or not in any variable inheriting from  non-serialization parent than JVM ignore original value and save default value to the file
//			at the time of deserialization JVM will check all serializable or not if any parent class is non serializable than JVM will execute instance control fow every non-serializable parent and share instance variable to the current object
	
//		while exeecuting instance control flow of non-serializable parent JVM always call no argument contrctors hence every non-serializable class should compilsory contant no argument constructors it may be default constructors generated by compiler and customized construcors explictly provided by programmer
//		otherwise we will get runtimeexception saying invalidclassexception
	
//	externalization :
	
//		in serialization everything takes care by JVM and programmer doesent have any control
//	
//		in serialization it is always possible to save total object to the file and it not possible to save part of the object , which may creates performance problem
//	
//		to overcome this problem we should go for externalization
//	
//		the main advantage of externalization over serialization is every thing takes care by programmer and JVM doesnt have any control
//	
//		based on over requirement we can save either total object or part of the object , which improves performance of system
	
//			to provider externalizable ability any java object compolsury curresponding class  implement externalizable
//			
//			methods :
//				
//			externalizable interface defines 2 mwthods
//			
//				1. writeExternal()
//				
//				2. readExternal()
	
//	  		Serializable(I)    1.1 version    (parent)
//				^
//				|
//				|
//				|
//				|
//				|
//				|
//	   		Externalizable(I)    1.1 version    (child)
//		
//			externalizable is child interface of serializable
	
//	SerialVersionUID :
	
//		in serialization both senser and reciver need not be same persion , need not to use same mission and need not be same location than persion may different , than mission may fiiferent and location may be different
	
//		in serialization both sender and receiver should has .class file at the begining only just state of object is travelling from sender to receiver
	
//		at the time of serialization with every object sender side JVM will save unique identifier
//		JVM is responsible to generate this unique identifier based on .class file
//	
//		at the time deserialization receiver side JVM will compare unique identifier associated with object with local class unique identifiers if both are matched than only deserialization will be performed otherwise we will get runtime exception invalidclassexception
//		this unique identifiers is nothing but SerialVersionUID
	
//		problems of depending on default SerialVersionUID generated by JVM
//		both sender and receiver shold use same JVM with respected to vendor and platform and version otherwise receiver anable to deserialization because of different SerialVersionUID
	
//		both sender and receiver should use same .class file version after serialization if there is any change in .class file at receiver side than receiver unable to deserialization
	
//		to generate SerialVersionUID internally JVM may use complex algorithm which may creates performance problem
		
//		we can solve above problem byconfiguring over own SerialVersionUID
//		we can configure over own SerialVersionUID as follows
		
//		private static final long SerialVersionUID = 1l;
	
//		in the above program after serialization if we perform any change .class file and receiver side we wont any problem at the time of deserialization
		
//		in this case sender and receiver not required maintain same JVM versions
	
//		some ides promt programmer to enter SerialVErsionUID explictly
	
//	    Note : some ided may generates automatically SerialVersionUID
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
