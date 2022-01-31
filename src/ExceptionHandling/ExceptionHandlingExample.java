package ExceptionHandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;

import OOPs.ExceptionHandlingExample1;

public class ExceptionHandlingExample {

	
//	Exception Handling :
//	
//	introduction
//	runtime stack mechanisum
//	default exception handling in java
//	exception hierarchy
//	customized exception handling by using try catch
//	control flow in try catch
//	methods to print exception
//	try with multiple catch blocks
//	finally block
//	difference bet final , finally , finalize
//	control flow in try-catch-finally
//	control flow in nested try-catch-finally
//	various possible combinations of try catch finally
//	throw keyword
//	throws keyword
//	exception handling keywords summary
//	various possible compile time errors in exception handling
//	customized or user defined exceptions
//	top -10 exceptions
//	1.7 version enhacements
//	 1. try with resource
//	 2. multi catch block
//	===================================================================================
	
//	an unexpected unwanted event that distops normal flow of programis called exception
//
//	example
//
//	tyrepunctureexception
//	sleppingexception
//	filenotfoundexception
//	etc
//
//	what is purpose of exception handling
//
//	it is highly recommended to handel exception and main objective exception handling is graceful termination of the program
//
//	exception handling doesnt mean reparing an exception we have to provide alternative ways to continue rest of program normally is a concept of exception handling
//
//	for example
//
//	over program is requirement is to read data from remote file located at london at run time if london file is not available over program shold not be terminated abnomally we have to provide some local file to continue rest of program normally this way of define alternative is nothing but exception handling
//
//	try{
//
//	read data from remote file location at london
//
//	}
//	catch(filenotfoundexception e){
//
//	use local file and location rest of the program normally
//
//	}

//	runtime stack mechanisum :
//
//		for every thread JVM will create runtime stack each and every method performed by thread will be stored in the corresponding stack
//		each entry in stack is call stack frame or activatication record afer completing every method call the corresponding entry from stack will be removed after complemeting all method call stack will become empty and that empty stack will be destroved by JVM just befor terminating the thread
//
//		class stack{
//
//		public static void main(String[] arg){
//		dostuff();
//
//		}
//
//		public static void dostuff(){
//
//		domorestuff();
//
//		}
//
//		public static void domorestuff(){
//		System.out.println("Hello");
//
//		}
//
//		}
//
//
//
//		|         |   |         |   |         |   |         |   |         |   |         |   |         |
//		|         |   |         |   |         |   |         |   |         |   |         |   |         |
//		|         |   |         |   |         |   |         |   |         |   |         |   |         |
//		|         |   |         |   |         |   |         |   |         |   |         |   |         |
//		|         |==>|         |==>|         |==>|_________|==>|         |==>|         |==>|         |
//		|         |   |         |   |_________|   |domorest(|   |         |   |         |   |         |
//		|         |   |_________|   |dostuff()|   |dostuff()|   |dostuff()|   |_________|   |         |
//		|         |   |__main()_|   |__main()_|   |__main()_|   |__main()_|   |_main()__|   |         |-----
//		|_________|   |_________|   |_________|   |_________|   |_________|   |_________|   |_________|     |
//		                                                                                                    |
//		 Runtime     stack frame                                                            this empty stack will be
//		  stack         (or)                                                                destroyed by JVM
//		  for         activation
//		  main         record
//		  thread
	
	
//	default exception handling in java :
//
//		inside a method if any exception occer the method in which riced is responsible to create exception object 
//		including follwing information
//		1. name of exception
//		2. decription of exception
//		3. location at which exception occers [stack trace]
//
//		after creation exception object method handover that object to the JVM
//
//		JVM will check whether the method contain any exception handling code or not if the method doesnt contain 
//		exception handling code than JVM terminate method abnormally and remove corresponding entry from the stack
//
//		than JVM identifies caller method and checks whether caller method contain any handling code or not
//
//		if the caller method doesnt contain handling code than JVM terminate also abnormally and remove corresponding 
//		entry from stack
//
//		this process will be continued until main method and if main main method also doesnt contain handling code than 
//		JVM terminate main method also abnormally removes corresponding entry from the stack
//
//		than JVM handovers responsbility of exception handling to default exception exception handler , which is part of 
//		JVM
//
//		default exception handler prints exception information in the following format and terminates program abnormally
//
//		exception in thread main "xxx" name of exception : decription stack trace
	
//	example
	
	public static void dostaff() {
		
		domorestaff();
		System.out.println("system");
	}
	
	public static void domorestaff() {
		
		System.out.println("hello");
		try {
//			String s = null;
//			int ss = s.length();
		//	System.out.println(10/0);
		} 
		catch (NullPointerException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		System.out.println("by");
	}
	
//	Note :
//
//		in a program if atlist one method terminate abnormally than the program terminaltion is abnormal terminalation
//		if all methods terminates nornally than only program termination is normal termination
	
//	exception hierarchy :
//
//                                                                          throwable
//                                                                              |
//------------------------------------------------------------------------------------------------------------------------------------------
//|                                                                                                                                        |
//exception                                                                                                                                  error
//|                                                                                                                                        |
//----------------------------------------------------------------------                                      ---------------------------------------------------
//|                 |                |                 |               |                                      |                     |                           |
//runtimeexceotion  ioexception   servletexception  remoteexception interptedexception                          vmerror           assertionerror         exceptioninitalitionerror 
//|                |                                                                                        |     |
//|                |                                                                          stackoverflowerror  outofmemoryerror
//|                |
//aae                   eofexception
//npe                   filenotfoundexception
//cce                   interruptedioexception
//indexoutofboundexception
//|---- arrayioobex
//|---- stringioobex
//illegalargumentexception
//|---- numberformatexception
//
//
//throeable class access root for java exceptin hierarchy
//throwable class definge to child class
//1. exception
//2. error
//
//1. exception
//
//most of time exception are caused by over program and this are recoverable
//example
//if program is requirement to read data from remote file locating at londan at runtime remote file not available than 
//we will get runtime exception saying filenotfound exception
//
//if filenotfound accores we can provide local file and continue rest of program normally
//
//try{
//
//read data remote file locat at londan
//}
//catch(filenotfoundexception e)
//{
//use local file continue rest of program normally
//}
//
//2. error
//
//most of time error are not caused by over program and these are due to lak of syatem resources
//error are non recoverable 
//example
//
//if outofmemoryerror accors being a programer we can do anything and program will be terminated abnormally
//systemabdin or serveradmin is responsible to increase heap memory

//	checked exception vs unchecked exception
//	-----------------------------------------------------------
//
//	the exception which are checked by compiler for execution of program are called checked exception
//
//	example 
//
//	hallticketmissingexception
//	pennotworkingexception
//	filenotfoundexception
//	etc
//
//	in over program if there is chance of rising checked exception than compilsory we should handle that checked exception (either by try catch or throws keywords) otherwise we will get compile time error
//
//	the exception which are not checked by compiler whether program handling or not such type s=exception are called unchecked exception
//
//	example
//
//	arethemathicmexception
//	bomblastexception
//	etc
//
//	Note :
//
//	whether is checked or unchecked every exception occers at runtime only ther is no chance occers exception at compiler time
//
//	runtimeexception and its child class , error and child class are unchecked except this reaming or checked
//
//	fullychecked vs particallychecked
//
//	a checked exception set to be fullychecked if and only if all its child class are check
//
//	example
//
//	ioexception
//	interparatedexception
//
//	a checked exception set to be particallycheck if and only if some of it child class are unchecked
//
//	example
//
//	exception
//	throwable
//
//	Note :
//
//	the only possible particallyexception in java are exception , throwable
//
//	describe the behaover of following exception
//
//	ioexception             --> checked(fully)
//	runtimeexception        --> unchecked
//	interruptedexception    --> checked(fully)
//	error                   --> unchecked
//	throwable               --> checked(partially)
//	arithmeticexception     --> unchecked
//	nullpointerexception    --> unchecked
//	exception               --> checked(partially)
//	filenotfoundexception   --> checked(fully)
	
	public static void print() {
		PrintWriter p;
		try {
			p = new PrintWriter("abc.txt");
			p.println("hello");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
//	customized exception handling by using try catch :
//
//		it is highly recommended handel exception
//		the code which may raise an exception iscalled risky code and we have define that code inside try  block and corresponding handling code we have to define we have to catch block
//
//		try{
//		risky code
//		}
//		catch(exception e){
//		handling code
//		}
//
//		without try-catch
//
//		class test{
//
//		public static void main(String[] arg){
//
//		System.out.println("statement1");
//		System.out.println(10/0);
//		System.out.println("statement2");
//
//		}
//
//		}
//      abnormal termination
//	
//		with try-catch
//
//		class test{
//
//		public static void main(String[] arg){
//
//		System.out.println("statement1");
//		try{
//		System.out.println(10/0);
//		}
//		catch(arithematicexception e){
//		System.out.println(10/2);
//		}
//		System.out.println("statement2");
//
//		}
//
//		}
//      normal termination

//	control flow in try catch :
//
//		try{
//		statement1;
//		statement2;
//		statemeent3;
//		}
//		catch(exception e){
//		statement4;
//		}
//		statement5;
//
//		case 1
//
//		if there is no exception 1,2,3,5 normal termination
//
//		case 2
//
//		if an exception anrise at statement2 and corresponding catch block match 1,4,5 normal termination
//
//		case 3
//
//		if exception rised at statement2 and corresponding catch block not match 1,abnormal termination 
//
//		case 4 
//		if an exception rised at statememt4 or statement5than it is always abnormal termination
//
//		Note :
//
//		within try block withn exceptin rised than rest of try block wont be excuted even do we handel that exception 
//		hence with try block we have to take only risky code and length try block should be as less as posible
//
//		in addition to try block there may be chance of rising exception inside catch and finally block
//
//		if any statement which is not part of try block rised an exception than it is abnormal termination
	
//	throwable class defing following class method to print exception information
//
//	method                 ||     printable format
//	                       ||
//	1. printstacktrace()   ||     name of exception : description stack trace
//	2. tostring()          ||     name of exception : description
//	3. getmessage()        ||     description
//
//	class test{
//
//	public static void main(String[] args){
//
//	try{
//	System.out.println(10/0);
//	}
//	catch(arithematicexception e)
//	{
//	 e.printstacktrace();
//	 System.out.println(e); or System.out.println(e.tostring());
//	 System.out.println(e.getmessage);
//	}
//
//	}
//
//	}
//
//	Note :
//
//	internally default exception handle will use printstacktrace method to print exception information to the console
	
	public static void declareexception() {
		
		try {
			System.out.println(10/0);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			System.out.println("-----------------------");
			System.out.println(e);
			System.out.println("-----------------------");
			System.out.println(e.toString());
			System.out.println("-----------------------");
			System.out.println(e.getMessage());
		}
	}
	
//	try with multiple catch blocks :
//
//		the way of handling an exception is varied from exception to exception hence from every exception type it is highly remcommded to separate catch block that is try with multi catch block is always possible and remcommeded to use
//
//
//
//		try{
//
//		rusky code
//
//		}
//		catch(exception e){
//
//		}
//
//		try{
//
//		risky code
//
//		}
//		catch(arithemeticexception e){
//
//		perform alternative arithematic operations
//
//		}
//		catch(sqlexception e){
//
//		use mysql dc insted of oracle dc
//
//		}
//		catch(filenotfoundexception e){
//
//		use local file instead of remote file
//
//		}
//		catch(exception e){
//
//		// default exception handling
//
//		}
	
//	if try with multiple catch block present than the order of catch bloch is very important we have to take child 
//	first than parent otherwise we will get compile time error saying exception xxx has alread been caught
//
//	try{
//
//	risky code
//
//	}
//	catch(exception e){
//
//	}
//	catch(arithematicexception e){
//
//	}
//
//	// invalid 
//
//	try{
//
//	risky code
//
//	}
//	catch(arithematicexception e){
//
//	}
//	catch(exception e){
//
//	}
//
//	// valid
	
//	we cant declare two catch block same for exception otherwise we will get compile time error
//
//	try{
//
//	risky code
//
//	}
//	catch(arithematicexception e){
//
//	}
//	catch(arithematicexception e){
//
//	}
//
//	// invalid
	
//	difference bet final , finally , finalize
//
//	final :
//
//	final is a modifer applicable for class methods and variable
//	if aclass declar as final than we cant extends that class that is we cant create child class for 
//	that class that is inheritance not possible for final class
//
//	if a method is final we cant override that method in the child class
//
//	if a varriable declare as final than we cant perform reassignment for that variable
//
//	finally :
//
//	finally is a block always associated with try-catch to maintain cleanup code
//
//	try{
//
//	risky code
//
//	}
//	catch(exception e)
//	{
//	handling code
//	}
//	finally{
//	cleanup code
//	}
//
//	the specility finally block is it will be executed always respective of whether exception is 
//	rised or notrised and whether handled or nothandled
//
//	finalize :
//
//	finalize is a method always invoked by garbez collector just befor destroing object to perform cleanup activity
//	once finalize method complete immeditly garbeg collector destroy object
//
//	Note :
//
//	finally block is responsible to perform cleanup activity related to try block that is whatever resorces 
//	we open at try block will be closed inside finally block
//
//	whereas finalize method is responsible cleanup activity realated to object that is whatever resoerses associates 
//	with object will be delocated befor destroing object byusing finalize method
	
//	various possible combinations of try catch finally :
//
//		1. in try catch finally order is important
//		2. wherever we are writing try compilsory we should write either catch or finally otherwise 
//		   we will get compile time error that is try without catch or finally is invalid
//		3. whenever we are writing catch block compilsory try block must be required that is catch without try is invalid
//		4. whenerver we are writhing finally block compilsory try block that is finall withot try is invalid
//		5. inside try catch finally block we can declare try catch and finall block that is 
//		   nasted of try catch finally is allowed
//		6. for try catch finall block curly braces are mandatory
	
//	throw keyword :

	public static void throwdeclare() {
		
		throw new ArithmeticException("/ by zero");
	}
	
//  throws keyword :
//	
//	we can handle this compile time error byusing following two ways
//
//	1. byusing try-catch
//	2. throws
//
//
//	we can use throws keywords to delegate responsbility of exception handling 
//	to the caller (it may onter method or JVM) than caller method is responsible to handel that exception

    public static void throwsdeclare() throws Exception {
    	
    	System.out.println(10/0);
	}
    
//    exception handling keywords summary :
//
//    	try     --> to maintain risky code
//    	catch   --> to maintain exception handling catch
//    	finally --> to maintain cleanup code
//    	throw   --> to hand over our  created executed exception onject to the JVM manually
//    	throws  --> to delegate responsiblity of creation handling to the caller
    
//    various possible compile time errors in exception handling :
//
//    	1. unreported exception xxx ; must be caught or declared to be thrown
//    	2. exception xxx has already been caught
//    	3. exception xxx is never thrown in body of corresponding try statement
//    	4. unreacheable statement
//    	5. incomatible types
//    	    found test
//    	    required:java.lang.throwable
//    	6.try without catch or finally
//    	7. catch without try
//    	8. finally without try
    
//  customized or user defined exceptions :
	
    public static void custexception() {
    
    	throw new ExceptionHandlingExample1();
    }
    
//    top -10 exceptions :
    
//    arrarindexoutofboundexception
//    nullpointerexception
//    classcastexception
//    stackoverflowerror
//    noclassdeffounderror
//    exceptioninintializererror
    
//   static int x = 10/0;
    
//    static {
//    	String s = null;
//    	System.out.println(s.length());
//    }
    
//    illegalargumentexception
//    numberformatexception
//    illegalthreadstateexception
//    asserationerror
    
    public static void topexception() {

    	int[] x = new int[4];
    	System.out.println(x[0]);
//    	System.out.println(x[10]);
//    	System.out.println(x[-10]);
    	
//    	String s = null;
//    	System.out.println(s.length());
    	
//    	Object o = new Object();
//    	String s = (String)o
    	
    	Object ob = new String("ak");
    	String ss = (String)ob;
    	
//    	Thread t = new Thread();
//    	t.setPriority(5);
//    	t.setPriority(15);
    	
//    	int i = Integer.parseInt("1");
//      int ii = Integer.parseInt("ten");
    	
//    	Thread t = new Thread();
//    	t.start();
//    	t.start();
    	
//    	int i = 5;
//    	assert(i > 10);
    	
    }
    
//    1.7 version enhacements :
//
//
//    	as the part of 1.7 version in exception handling following two concept introduce
//
//    	1. try with resources
//    	2. multi-catch block
    
    public static void enhasment() {
    	
    	try(FileInputStream fis = new FileInputStream("abc.txt")){
    		
    		System.out.println("welcome to my file");
    	}catch (ArithmeticException | NullPointerException e) {
			// TODO: handle exception
    		e.printStackTrace();
		}catch (NoSuchMethodError | IOException e) {
			// TODO: handle exception
		}
    	catch (Exception e) {
			// TODO: handle exception
		}
    }
    
//    try {
//		System.out.println(10/0);
//	} catch (ArithmeticException e) {
//		// TODO: handle exception
//		throw new NullPointerException();
//	}
    
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		dostaff();
		System.out.println("another field");
		print();
		declareexception();
		throwdeclare();
		throwsdeclare();
		custexception();
		topexception();
		enhasment();
	}

}
