package OOPs;

public class HasARelationship {
//
//	has-a relationship
//
//	has-a relationship is also know as composition or aggregation 
//	there is no specific keywords to has a relation most of time depending new keyword
//	the main advantage of has-a relationship is reuauability of code
//
//	example :
//
//	class car {
//
//	engine e = new engine();
//
//	}
//
//	class engine{
//	// engine specific
//
//	functionality
//
//	}
//
//	------------------------------
//	| car has-a engine reference |
//	------------------------------
//
//	composition and aggrigation difference bet
//
//	without existing container object if there are no chance of exiting contains object than contain or contained 
//    object are strongly associated and this strong association is nothing but composition
//
//	example
//
//	university consist of several department without existing unversity there is no chance of existing department 
//    hence unversity and department are strongly associated and this strong association is nothing but compositions
//
//
//	compositions :
//
//	------------------------------
//	| CSE DEPT         ECE DEPT  |
//	|                            |
//	|                            |  
//	|  EEE DEPT       MECH DEPT--|---->contained object
//	|                            |------>container object
//	------------------------------
//	    university
//
//	aggrigations :
//
//
//	without existing container object if ther is chance existing contained object than container ore contained object 
//    are weekly associated and this week associaction is nothing but aggrigation
//
//	example 
//
//	depart =ment consist of several propesor without exsisting department they may be chance of existing profesor object 
//    hence department and profesor object are weekly associated and week associated is nothing but aggrigation
//
//
//	-----------------------------
//	|            x ------------- |----------> profesor - 1
//	|                            |
//	|            x ------------- |----------> profesor - 2
//	|                            |         contained object
//	|             x -------------|----------> Profesor - 3
//	------------------------------
//
//	department x
//
//	container object
//
//	Note :
//
//	in composition object are strongly associated whereas in aggrigation object are weekly associated
//
//	in compositions container object holds directly contained object whereas in aggrigation container object holds 
//    just reference of contained object
	
//	if want a total functionality of a class automatically than we should go for is arelationship
//
//	---------------
//	| personal class |
//	---------------
//	is-a relationship
//
//	---------------
//	student class
//
//	if you part of functionality than you should go for has a relationship
//
//	example
//
//	----------------
//	test class{
//	  // 100 methods
//	}
//	----------------
//	has-a relationship
//	----------------
//	demo class{
//	test t = new test();
//	t.m1();
//	t.m2();
//	}
//	------------------
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}
 }
