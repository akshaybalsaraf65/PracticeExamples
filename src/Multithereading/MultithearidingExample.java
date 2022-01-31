package Multithereading;

public class MultithearidingExample extends Thread {

//	introduction
//	the ways to define a thread
//	  1. by extending thread class
//	  2. by implementing runnable(I)
//	getting and setting name of thread
//	*thread priorities
//	the methods to prevent thread execution
//	 1.yield()
//	 2.join()
//	 3.sleep()
//	synchronization
//	interthread communication
//	deadlock
//	deamon threads
//	multithreading enhancements
//
//
//	introduction :
//
//	                           multitasking
//	                         -------------------
//	                                  |
//	                   ---------------------------------
//	                  /                                 \
//	         process based                          thread based
//
//	multitasking :
//
//	executing sevaral task simeltinously is a concept of multitasking
//	there are two types multitasking 
//	1. process based multitasking
//	2. thread based multitasking
//
//	1. process based multitasking :
//	executing sevral task simeltinously where each task several indepent 
//	program (process) is called process based multitasking
//
//	example
//	typing a java program in editor we can listen audio song from same system at a time 
//	we download a file from net all these task will be executed simeltinously and independent 
//	of each other hence it is process based multitasking process based multitasking is best 
//	suitable at os level
//
//	2. thread based multitasking :
//	executing several task simeltinosly where each task each separat indepedent part of 
//	same program is call thread based multitasking and each indepent part is call a thread
//
//	thread based multitasking is suitable at programatic level
//
//	whether it is process based or thread based the main objective of multitasking is to reduce 
//	responsive time system and to improve performance
//
//	the main important application area of multithreading are
//	1. to develop multimedia graphic
//	2. to develop annimation
//	3. to develop video games
//	4. to develop web server and application server etc
//
//	when comparied old languages developing multithreaded application in java is very 
//	easy because java provided inbuild support for mutithread 
//	with reach api [thread , runnable , threadgroup ...]
	
//	define a thread :
//
//	we can define a thread in following two ways
//
//	1. by extending thread class
//	2. by implementing runnable interface
//
//	class mythread extends thread{
//
//	public void run(){
//
//	for(int i=0;i<10;i++){
//	System.out.println("child thread");
//	}
//	 // execting child thread
//	}
//
//	}
//
//
//	class threaddemo{
//
//	public static void main(String[] args){
//
//	mythread t = new mythread();  // thread instantiation
//	t.start();                    // starting of a thread
//
//	for(int i = 0; i< 10; i++){
//	System.out.println("main thread");
//	}
//	  //  executing by main thread
//	}
//
//	}
	
//case 1
//
//thrad schedular :
//
//it is part of JVM 
//it is responsible to schedule threads that is if multiple thread waiting to get chance of 
//execution than in which order thread will be executed is decided by thread schedular
//
//we cant expect exect algorith followed by thread schedular it is varried from JVM to JVM hence we 
//cant expect thread execution order and exect output
//hence whenever cheviattion of multithreading there is no garrunty of exect output but we 
//can provide several possible output
//
//the following are wheres possible output for above program
//
//main thread
//child thread
//child thread
//child thread
//main thread
//
//case 2
//
//difference bet t.start() and t.run()
//
//in the case of t.start() a new thread will be created which is responsible for the execution of run method
//but in the case of t.run a new thread want be created and run method will be 
//executed just like normal method call by main thread
//hence above program if replace t.start() with t.run() than output is
//child thread
//child thread
//main thread
//main thread
//
//     // this total output produced only main thread
//
//case 3
//
//importance thread class start method
//
//thread class method is responsible to register thread with thread schedular and all other 
//mandatory activity hence without executing thread class start method there is no 
//chance  new thread in java due to this thread class start method is considerd as heart of multithreading
//
//start(){
//
//1. register the thread with thread schedular
//2. perform all other mandatory activities
//3. invoke run();
//
//}
//
//case 4
//
//overloading of run() method
//
//overloading of run method is always possible but thread class start method 
//can invoke no argument run method the other overloaded method we have 
//to call expectly like a normal method call
//
//class mythread extends thread{
//
//public void run(){
//
//System.out.println("no arg method");
//
//}
//
//public void run(int i){
//
//System.out.println("arg method");
//
//}
//
//}
//
//class threaddemo{
//
//public static void main(string[] args){
//
//mythread t = new mythread();
//t.start();
//
//}
//
//}
//
//  // no arg method
//
//case 5
//
//if you are not overriding run method
//
//if ypu not overriding run() method than thread class class method 
//will be executed which has empty implementation hence we wont get any output
//
//class mythread extends thread{
//
//}
//
//class threaddemo{
//
//public static void main(string[] args){
//
//mythread t = new mythraed();
//t.start();
//
//}
//
//}
//
//  // no output
//
//Note :
//
//it is highly recommeded override run() method otherwise dont go for multithreading concept
//
//case 6
//
//overriding start method
//
//if you override start() method than over start() method will be executed 
//just like normal method call and new thread wont be created
//
//class mythread extends thread{
//
//public void start() {
//		System.out.println("start method");
//	}
//	
//	
//	public void run() {
//			System.out.println("child thread");
//	}
//
//}
//
//}
//
//class threaddemo{
//
//public static void main(string[] args){
//
//mythread t = new mythraed();
//t.start();
//System.out.println("main");
//}
//
//}
//
//  //  start method        //
//      main thread        // produced by only main thraed
//
//Note :
//
//it is not recommeded to override start method otherwise dont go for multithreading concept
//
//case 7
//
//class mythread extends thread{
//
//public void start() {
//                super.start();
//		System.out.println("start method");
//	}
//	
//	
//	public void run() {
//			System.out.println("child thread");
//	}
//
//}
//
//}
//
//class threaddemo{
//
//public static void main(string[] args){
//
//mythread t = new mythraed();
//t.start();
//System.out.println("main");
//}
//
//}
//
//  // start method
//  // child thread
//  // main thread
//
//case 8
//
//thread life cycle
//
//mythread t - new mythread();
//------------------   		 ----------------------              		                --------------------                       --------------------
//|                | t.start();   |                     |  if thraed schedular allocates processor|                    |        it run()     |                  |
//|    new / born  |------------> |   read/runnable     |---------------------------------------> |    running         | ----------------->  |     dead         |
//|                |   		|                     |              		                |                    | method complete     |                  |
//------------------   		----------------------               		                ----------------------                     --------------------
//
//case 9
//
//after statring a thread if you are trying to restart a same threat than 
//we will get runtime exception saying illegalthreadstateexception
//
//thraed t = new thread();
//t.start();
//
//t.start(); // illegalthreadstateexception
	
//	define a thread by runnaable interface
//
//	we can definr a thread by implementing runnable interface
//
//
//	 ------------------------------------------------
//	| mythread -----> thread  ------> |runnable (i)| |
//	 ------------------------------------------------
//	                                  |            |
//	                                  | myrunnable |
//	                                  --------------
//
//	runnable intetface present in java.lang package and its contain only one method run()
//
//	  ---------------------
//	  | public void run() |
//	  ---------------------
//
//	public class MultithearidingExample2 implements Runnable{
//
//		public static void main(String[] args) {
//			// TODO Auto-generated method stub
//
//		}
//
//		@Override
//		public void run() {
//			// TODO Auto-generated method stub
//			
//			for(int i = 0; i<20;i++) {
//				System.out.println("child thread");
//			}  // executed child thread
//		}  // job of thread
//
//	}
//
//	public class MultithearidingExample3 {
//
//		public static void main(String[] args) {
//			// TODO Auto-generated method stub
//
//			MultithearidingExample2 m = new MultithearidingExample2();
//			Thread t = new Thread(m);  // target runnable
//			t.start();
//			
//			for(int i = 0; i<20;i++) {
//				System.out.println("main thread");
//			}  // executed main thread
//		}
//
//	}
//
//	 // main thread
//	 // child thread
//	we will get mixed output and we cant till exect output
//
//	case study
//
//	myrunnable r = new myrunnable();
//	thread t1 = new thread();
//	thread t2 = new thread(r);
//
//	case 1
//
//	t1.start();
//	a new thread will be created which is responsible for the execution of thread class run method , which has empty implementation
//
//	case 2
//
//	t1.run();
//	no new thread will be created and thread class run method executed just like a normal method call
//
//	case 3
//	t2.start();
//
//	a new thread will be created which is responsible for the execution of myrunnable class run method
//
//	case 4
//
//	t2.run();
//
//	a new thread wont be created and myrunnable run method will be executed just like an normal method call
//
//	case 5
//
//	r.start();
//	we will get compile time error saying myrunnable class doesnt have start capibality compile time error : cannot find symbol symbol method start() location class myrunnable
//
//	case 6
//
//	r.run();
//
//	no new thread will be created and myrunnable run method will be executed like normal method call
//
//	which approach is best to define a thread
//
//	among a two ways define a thread implements runnable approach is recommeded
//	in a first approach over class always extend thread class , there no chance of extending any other class hence we are missing inheritance benifites
//	but in the second approch by implementing runnaable interface we cant extends any other class hence we cant miss any inhertance benifits beacaus above reason implementing runnable interface approch is recommanded than extending thread class
//
//	thread class constructors
//
//	1. thread t = new thread();
//	2. thread t = new thread(runnable r);
//	3. thread t = new thread(String name);
//	4. thread t = new thread(runnable r,string name);
//	5. thread t = new thread(threadgroup g,string name);
//	6. thread t = new thread(threadgroup g,runnable r);
//	7. thread t = new thread(threadgroup g,runnable r,string name);
//	8. thread t = new thread(threadgroup g,runnable r,string name,log stacksize);
//
//	durga's approach to define a thread (not recommanded to use)
//
//	class mythread extends thread{
//
//	public void run(){
//
//	System.out.println("child thread");
//
//	}
//
//	}
//
//	class threaddemo{
//
//	public static void main(string[] args){
//	mythread t = new mythread();
//	thread t1 = new thread(t);
//	t1.start();
//	System.out.println("main thread");
//	}
//
//	}
//
//	  // main thread
//	  // child thread
//
//	getting and setting name of a thread
//	every thread in java has some name it may be default name generated by JVM are custmized name provided by programmer
//	we can get and set name of thread byusing the following two method  thread class
//
//	public final string getName
//	public final void setName(String name)
//
//	example
//
//	System.out.println(Thread.currentThread().getName());
//
//	Note :
//
//	we can get current executing thread object by using thread.currentthread()
	
//	every thread in java has some prioritie it maybe default priority generated by JVM customized priority provided by programmer
//	the valid rang are thread priority is 1 to 10 where one is min priority 10 is mix prority
//	thread class define the following constant to represent some standard priority
//	Thread.MIN_PRIORITY    -----> 1
//	Thread.MAX_PRIORITY    -----> 5
//	Thread.NORM_PRIORITY   -----> 10
//
//	thread schedular will use priorities while allocating processor
//	thread which is having highest prority will get chance first
//
//	if two threads having same priority than we cant expect exact exection order it depends on thread schedular
//
//	thread class define the following method to get and set priority of a thread
//
//	public final int getpriority()
//
//	public final void setpriority(int p)
//
//	allowed values range 1 to 10 otherwise runtimeexception illegalargumentexception
//
//	example
//
//	t.setpriority(7);
//	t.setpriority(17);
//
//	default priority
//
//	the default priority only for main thread is 5 but for reaming thread default priority will be inherited from parent to child that is whatever priority parent thread has same priority will be there for the child thread
//
//	Note :
//
//	some platform wont provide proper support from thread priority
	
//	we can prevent a thread execution byusing the following methods
//
//	1. yield()
//	2. join()
//	3. sleep()
//
//	1. yield()
//
//	yield() causes to pass current executing thread to give the chance for waitng thread same priority
//	if there is no waiting thread are all waiting threading low prioritity than same thread can continue its execution
//
//	if multiple thread are waiting with same priority than which waithing thread get the chance we cant except it depends on thread schedular
//	the thread which is yield , when it chance one again it depandance on thread schedular and we cant expect exctly
//
//	 -------------------------------------
//	 | public static native void yield(); |
//	 --------------------------------------

//								thread.yield();
//							--------------------------------------------------------
//							|							|
//							|							|
//							|							|		
	//mythread t - new mythread();			|							|
	//------------------   		  ----------------------              		                    --------------------                        --------------------
	//|                | t.start();   |                     |  if thraed schedular allocates processor  |                    |        it run()     |                    |
	//|    new / born  |------------> |   read/runnable     |--------------------------------------->   |    running         | ----------------->  |     dead           |
	//|                |   		  |                     |              		                    |                    | method complete     |                    |
	//------------------   		   ----------------------               		            ----------------------                      --------------------
	//
	
//	in the above program if a commenting line a than both thread executed simeltinously and we 
//	cant expect which thread will complete first
//	if are not commenting line 1 than child thread always call yield method because 
//	of that main thread will get chance more number of time and chance completing main thread first is high
//
//	Note :
//
//	some plaform wont provide proper support for yield()
	
//	2. join()
//
//	if a thread wants to wait until complete some other thread than we should go for join method
//	for eaxmple if thread t1 want to wait until completing t2 than t1 
//	has to call t2.join if t1 execute t2.join than immeditly t1 will be inter waiting state unil t2 complete
//	once t2 complete than t1 can continue its execution
	
//	2. join()
//
//	if a thread wants to wait until complete some other thread than we should go for join method
//	for eaxmple if thread t1 want to wait until completing t2 than t1 has to call t2.join if t1 execute t2.join than immeditly t1 will be inter waiting state unil t2 complete
//	once t2 complete than t1 can continue its execution
//
//	venue fixing activity       weding cards printing     wedding cards distrubution
//	  (t1)                              (t2)                                (t3)
//	   |                                 |                                    |
//	   |                                 |                                    |
//	   |                                 |                                    |
//	   |                                 |                                    |
//	   |                              t1.join();                              |
//	   |                                 |                                    |
//	   |                                 |                                 t2.join();
//	   |                                 |                                    |
//	   |                                 |                                    |
	
//	synchronization :
//
//		synchronized is a modifier applicable only for method and block but not for classes and variable
//		if multiple threads are trying to operate symeltinosly and same java object than there may be chance of data inconsisty problem to overcom this problem we should go for synchronized keyword
//		if a method or block declare as synchronized than at a time only one thread is allowed execute that method or block and given object so that data inconsisty problem will be resolved
//		the main advantage of synchronized keyword is we can resolve data inconsisty problem but the main disadvantage synchronized keyword is it increases waiting time of thread and creates performs problem hence if there is no specific requirement than it is not recommended to use synchronized keyword
//
//		internally synchronization concept is implementated byusing lock every object in java has a unique lock
//		whenever  you are using synchronized keyword than only lock concept will come inti picture if you thread wants to execute synchronized method on the given object first it has to get lock of that object
//		once thread that lock it is allowed to execute any synchronized method on that object once method execution complete automatically threads release lock
//		acquiring and relesing lock internally take care by JVM and programmer not responsible for this activity
//
//		while a thread executing synchronized method on given object the remining not allocat not execuate any synchronized method simeltinosouly on same object
//		but reaming thread allowes ecxecute non synchronized method simeltinosouly
//
//		class x{
//
//		synch m1()
//		synch m2()
//		      m3()
//
//		}
//
//		lack concept is implemented based on object but not based on method
	
	public void start() {
		super.start();
		System.out.println("start method");
	}
	
	
	public void run() {
	
		for(int i = 0; i<20;i++) {
			System.out.println("child thread");
		}
	}
	
	public void run(int i) {
		System.out.println("overloaded method");
	}
	
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
