package JavaLangPackage;

public class StringBufferClassExample {

	
//	StringBuffer
//
//	in the content is fixed and want change frequiently than it is recommended to go for string
//
//	if content is not fixed and keep on changing than it is not recommended to use string because for every change a new object will be created which affect performance of system
//
//	to handel this requirement we should go for stringbuffer
//
//	the main advantage of stringbuffer over string is all reuired changes will be performed in the existing object only
//
//	constructors
//
//	StringBuffer sb = new StringBuffer();
//
//	creates an empty string buffer object with default initial capacity 16
//
//	once stringbuffer reches max capicity a new stringbuffer object will be created with a
//
//	------------------------------------------
//	| newcapicity = (currentcapicity + 1) *2;|
//	------------------------------------------
//
//
//
//	Stringbuffer sb = new stringbuffer();
//	sb.capacity();
//	sb.append("abababbabababa");
//	sb.capacity();
//
//	stringbuffer sb = new stringbuffer(int initialcapicity);
//
//	creates an empty stringbuffer object with the specified initial capicity
//
//	stringbuffer sb = new stringbuffer(string s);
//
//	creates an equalivant string buffer for the given string with a
//
//	------------------------------
//	| capicity = s.length() + 16 |
//	------------------------------
//
//	example
//
//	stringbuffer sb = new stringbuffer("akaki");
//
//
//	important methods of stringbuffer
//
//	public int length();
//
//	public int capicity();
//
//	public char charat(int index);
//
//	example
//
//	stringbuffer sb = new stringbuffer("akaki);
//	sb.charat(3);
//	sb.charat(30);
//
//	public void setcharat(int index,char ch);
//
//	to replcace the character located at specified index with provided character
//
//	public stringbuffer append(string s);
//				  (int i);
//				  (long l);
//				  (char ch);
//				  (boolean b);
//
//	overloaded methods
//
//	stringbuffer sb = new stringsuffer();
//	sb.append("akaki");
//	sb.append(1234);
//	sb.append("akkkki");
//	sb.append(true);
//	System.out.println(sb);
//
//	public stringbuffer insert(int index,string s);
//				  (int index,int i);
//				  (int index,double d);
//				  (int index,char c);
//				  (int index,boolean b);
//
//	overloaded methods
//
//	stringbuffer sb = new stringbuffer("akaki");
//	sb.insert(2,"akaki");
//	System.out.println(sb);
//
//	public stringbuffer delete(int begin,int end);
//
//	to delete character located from begin index to end -1 index
//
//	public stringbuffer deletecharat(int index)
//
//	to delete the character located at specified index
//
//	public stringbuffer reverse();
//
//	example
//
//	stringbuffer sb = new stringbuffer("akaki");
//	System.out.println(sb.reverese());
//
//	public void setlength(int length);
//
//	example
//
//	stringbuffer sb = new stringbuffer("akakiakaki");
//	sb.setlength(8);
//	System.out.println(sb);
//
//	public void ensurecapicity(int capicity);
//
//	to increase capacity on fly based on our requirement
//
//	example
//
//	stringbuffer sb = new stringbuffer();
//	System.out.println(sb.capacity());
//	sb.ensurecapacity(1000);
//	System.out.println(sb.capacity());
//
//	public void trimtosize();
//
//	to deallocate extra allocated free memory
//
//	example
//
//	stringbuffer sb = new stringbuffer(1000);
//	sb.append("akaki");
//	sb.trimtosize();
//	System.out.println(sb.capacity());
//
//	Note :
//
//	stringbuilder
//
//	every method stringbuffer is synchronized and hence only one thread is allowed to operate on stringbuffer object at a time which make create performance perblom to handel this requirement sun peopel introduce stringbuilder concept in 1.5 version
//
//	stringbuilder exectly same as stringbuffer except the following defferences
//
//	stringbuffer                              stringbuilder
//
//	1. synchronized                         1. non synchronized
//	2. one-thread thread-safe               2. multiple-thread   not thread-safe
//	3. perfromance low                      3. performance high
//	4. 1.0 version                          4. 1.5 version
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
