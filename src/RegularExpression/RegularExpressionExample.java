package RegularExpression;

import java.util.StringTokenizer;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpressionExample {

//	if want you represent group of string according to a perticular pattern than we should go for regularexpression
//	
//	example
//	
//	we can write regularexpression to represent valid mobile numbers
//	
//	example
//	
//	we can write regularexpression to represent all mail id
	
//	the main important application area of regularexpression are
//	
//		1. to develop validation framework
//		
//		2. to develop pattern matching [ctrl-f in windows & grep in UNIX]
//				
//		3. to develop translators like assumbles , compilers , interpritters etc
//		
//		4. to develop digital curcit
//		
//		5. to develop communication protocol Tcp/IP UDP etc
	
//		a pattern object is a compiled version of regularexpression that is it is a java equivalent object of a pattern
	
//		we can create pattern object byusing compil method of pattern class
	
//		public static Pattern compile(String re)
	
//		we can use matcher object to check the give pattern in the target string
		
//		we can create mather object byusing patcher object matcher class
		
//		public Matcher matcher(String target)
	
//		important methods of matcher class :
			
//			boolean find()
//				if attemts to find next match and returns true if it is available
//			int start()
//				returns start index of match
//			int end()
//				returns end + 1 index of the match
//			String group()
//				it returns the match pattern
	
//		Note : pattern and matcher class present in java.util.regex package and introduced in 1.4 version
	
//		StringTokenizer :
	
//			it is a special designed class for tokenization activity
			
//			StringTokenizer in present in java.util package
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int count = 0;
		Pattern p = Pattern.compile("(0|91)?[7-9][0-9]{9}");
		
		// [ak] either 'a' and 'k'
		// [^ak] expect 'a' and 'k' and 'i'
		// [a-z] any lower case alphabet symbol from a to z
		// [A-Z] any upper case alphabet symbol from A to Z
		// [a-zA-Z] any alphebet symbol
		// [0-9] any digit from 0 to 9
		// [0-9a-zA-Z] any alphanumeric symbol
		// [^0-9a-zA-Z] expect of symbol
		// \s space character
		// \S expect space character
		// \d any digit from 0 to 9 [0-9]
		// \D expect digit , any character
		// \w any word character [0-9a-9A-Z]
		// \W expect world character [special character]
		// . any character
	// Quantifiers :
	//   we can use Quentifiers to specify number of occurences to match
		// a exectly one 'a'
		// a+ atleast one 'a'
		// a* any number of 'a' including zero number
		// a? atmost one 'a'
		//[789][0-9][0-9][0-9][0-9][0-9][0-9][0-9][0-9][0-9]
		//[7-9][0-9]{9} mobile number start with 7 , 8 , 9 total 10 digit
		//0?[7-9][0-9]{9} mobile number 10 digit or 11 digit
		//(0|91)?[7-9][0-9]{9} mobile number 10 digit or 11 digit or 12 digit
		//[a-zA-Z0-9][a-zA-Z0-9_.]*@[a-zA-Z0-9]+([.][a-zA-Z]+)+ email id
		//[a-zA-Z0-9][a-zA-Z0-9_.]*@gmail[.]com email id with gmail
		Matcher m = p.matcher("918545854585");
		while(m.find()) {
			
			count++;
			System.out.println(m.start() + "" + m.end() + "" + m.group() + m.matches());
		}
		
		System.out.println(count);
		
		Pattern p1 = Pattern.compile("\\s");
		String[] s1 = p1.split("ak ak ak");
		for(String ss2 : s1) {
			System.out.println(ss2);
		}
		
		StringTokenizer st = new StringTokenizer("ak ak ak");
		while(st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}
		
		StringTokenizer st1 = new StringTokenizer("11-07-2021", "-");
		while(st1.hasMoreTokens()) {
			System.out.println(st1.nextToken());
		}
		
	}

}
