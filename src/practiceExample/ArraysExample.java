package practiceExample;

import java.util.Arrays;

import TestExample.Test;

public class ArraysExample extends TestExample.Test {

	public static void sum(int[] x) {
		int total = 0;
		for(int x1:x) {
			total = total + x1;
		}
		System.out.println("The Sum : "+ total);
	}
	public static boolean findxinkindowSize(int n,int[] arr, int x, int k) {
		int i;
		boolean b = false;
		for(i=0;i<n;i=i+k) {
			for(int j=0;j<k;j++) {
				if (i + j < n && arr[i + j] == x)
                    break;
 
                if (j == k)
                    return false;
                if (i + j >= n)
                    return false;
			}
		}
		if (i >= n)
            return true;
        else
            return b;
	}
	
	public static int getSecondLargest(int[] a, int total) {
	int temp;
	
	for(int i = 0;i< total;i++) {
		for(int j = i + 1;j< total;j++) {
			if (a[i] > a[j])   
            {  
                temp = a[i];  
                a[i] = a[j];  
                a[j] = temp;  
            }  
		}
	}
	return a[total-2];
	}
	
	public static int getSecondLargest1(int[] a,int total) {
	Arrays.sort(a);
	
	return a[total-2];
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		// Arrays
		
		/*1. Introduction
		2. Array Declaration
		3. Array Creation
		4. Array Initalization
		5. Arrays Declaration ,  Creation And Initalization in a single line
		6. length vs length()
		7. Anonymous Arrays
		8. Arrays Element Assigment
		9. Arrays Variable Assigment*/
		//Arrays is Indexed collection & Fix Number size & Homogenous Data type
		
		//Disadvantage is  Arrays is Fix SIze
		
		// One Dimensional Array
		// Delcaration
		int[] x;  //Mostly used / recommed
		int []x1;
		int x2[];
		
		//conclusion
		//int[6] xa;  Compiler Error
		int [] xa; // declaration We cant species the Size Otherwise We Will Compile Time Error
		
		// Two Dimensional Array
		// Declaration
		int[][] xa1; //valid
		int  [][]xxa; //valid
		int xas[][]; //valid
		int[] [] xdf; //valid
		int [] sd[]; //valid
		int []dfs[]; //valid
		
		int[] a,b;
		int[] a1[],b1;
		int[] a2[],b2[];
		int [] []a3,b3;
		int[] []a4,b4[];
		//int[] []a5,[]b5; Compile Time Error
		//int[] []a6,[]b6,[]c6; Compile Time Error
// Explanation 1st valid 	2nd,3rd Invalid
		//functionality availability for 1st varabale,2nd,3rd or more variable not aplicable
		
		// Three Dimensional Array
		// Declaration
		
		int[][][] xcc;
		int [][][]xcx;
		int cvc[][][];
		int[] [][]scx;
		int[] dg[][];
		int[] []gf[];
		int[][] []sa;
		int[][] ad[];
		int[][] fd[];
		int []gfj[][];
		// all valid
		
		// Arrays Creation
		int[][][] fg= new int[3][2][1];
		//Every array in java is object only hence create array byusing new operatator
		System.out.println("Arrays Class Name" + fg.getClass().getName());  // O/P Arrays Class Name[[[I
		//Every Array type corresponding class are available this class are part of java language not available to programer level
		
		// array type and corresponding class name
		// 1 int [] ==>     [I
		// 2 int [][] ==>   [[I
		// 3 int [][][] ==> [[[I
		// 4 double [] ==>> [D
		// 5 short[] ==>>   [S
		// 6 byte[] ==>>    [B
		// 7 boolean[] ==>> [Z or [L
		
		Boolean[] bb = new Boolean[3];
		System.out.println("Boolean Arrays Class Name" +bb.getClass().getName());
		//int[] gfh = new int[]; //Compile Time Error
		int[] hgf = new int[6];
		// Array Creation Compilsory Specicfy the size Otherwise We Will Compile Time Error
		int[] nb= new int[0]; // size 0 legel to java
		System.out.println("array size" +nb.length);
		System.out.println("Main Method args Size" + args.length);
		//int[] hgg = new int[-3]; // No Compile Time Error But Run Time Error java.lang.NegativeArraySizeException
		//System.out.println(hgg);
		int[] fgj = new int['a'];
		System.out.println("'a' Value" + fgj);
		byte bbss = 20;
		int[] hjg = new int[bbss];
		System.out.println("Byte Value" + hjg);
		short ss = 30;
		int[] sdf = new  int[ss];
		//int[] sdfd =new int[10L]; // Compile Time Error
		System.out.println("Short Value" + sdf);
		// To specify array size to allowed data type are Byte , Short , Char , Int If We Arr trying to specify any other type then we will get Compile Time Error
		//int[] jh = new int[2147483647]; // Valid range but java.lang.OutOfMemoryError Exception
		//int[] jhh = new int[2147483648]; // Out Of rangs
		// Maximum array size allowed in java is 2147483647 which is the maximum value Int data Type
		int [][][]p = new int[3][4][5];
		
		// Array Initialization
		int[] cc = new int[3];
		System.out.println(cc +"     temp     "+ cc[0]);
		cc[0] = 10;
		System.out.println(cc[0] + "  temp   " +cc[1]);
		//Whenever trying to print any reference variable initernally tostring method will be called which is implemented bydefalut to retun string in following form classname@hashcode_in_hexadecimalform
		int[][] ii = new int[3][2];
		System.out.println(ii);
		System.out.println("trying to print" +ii[0]);
		System.out.println(ii[0][0]);
		// Once we creted in array erery array element by default initalized with the default value if we are not satisfied with default value than we can overried this valus whith over custmized value
		int[] ff= new int[6];
		ff[0] =10;
		ff[1] =20;
		ff[2] =30;
		ff[3] =40;
		ff[4] =50;
		ff[5] =60;
		//ff[6] = 70; // java.lang.ArrayIndexOutOfBoundsException
		//ff[-6] = 80; // java.lang.ArrayIndexOutOfBoundsException
		//ff[2.5] = 90; // Compile Time Error
		System.out.println("Initalized Values : " + ff[0] +" : "+ ff[1]+ " : "+ ff[2]+ " : " +ff[3]+" : "+ ff[4] +" : "+ ff[5]);
		// System.out.println(ff[6]);
		// System.out.println(ff[-6]);
		
		// Arrays Declaration Creation and Initalization in a single line
		int[] gg;
		gg = new int[3];
		gg[0] = 10;
		gg[1] = 20;
		gg[2] = 30;
		
		int[] gg1 = {10,20,30};
		char[] ch = {'a','e','i','o','u'};
		String[] s = {"a","aa","aaa"};
		System.out.println(gg1[0] + " : "+ gg1[1] + " : " + gg1[2]);
		System.out.println(ch[0] + ch[1] + ch[2]+ ch[3]+ ch[4]);
		System.out.println(s[0]+s[1]+s[2]);
		
		int[][] kk = {{10,20},{30,40,50}};
		int[][][] yy = {{{10,20,30},{40,50,60}},{{70,80},{90,100,110}}};
		System.out.println(yy[0][1][2]);
		System.out.println(yy[1][1][1]);
		int[] yi;
		//yi = {10,20,30}; // Compile Time Error
		
		//length vs length()
		int[] jk = new int[6];
		//System.out.println(jk.lenght()); // Compile Time Error We cant find method length() class int[]
		System.out.println(jk.length);
		String sy = "akshay";
		//System.out.println(sy.length); // Compile Time Error We Cant Find Symbol variable java.lang.string
		System.out.println(sy.length()); // length method is a final method applicable for string object length method return number of cheracter in present in string
		//length variable applicable for arrays but not for string object whereas length() method applicable for string object but not for arrays
		String[] sss = {"a","aa","aaa"};
		System.out.println("String arrays length : " +sss.length);
		System.out.println(sss[0].length());
		int[][] yt = new int[6][3];
		System.out.println(yt.length);
		System.out.println(yt[0].length);
		// In multi Dimensional arrays length variable represent only base size but not total size
		// there is no direct way to find of total length of multi dimensional array but indirectly we cant find as follows
		System.out.println("multi dimensional length count " +yt[0].length+yt[1].length+yt[2].length+yt[3].length+yt[4].length);
		
		// Anmous Arrays
		
		// Instance Used or One Time Used
		// Sometimes we can declare an array without name such type of name less arrays are called anmous arrays
		// the main purpose of anmous arrays is just of instance use (one time use)
		sum(new int[] {10,20,30,40});
		// We can create anmous arrays as follows new int[]{10,20,30,40}
		// while creating anous arrays we cant specify the size otherwise we will get compile time error
		//new int[3]{10,20,30}; // unvalid
		//new int[]{10,20,30}; // valid
		//new int[][] {{10,20},{30,40,50}} //valid two dimensional arrays
		// based on ower requirement we cant give the name anmous arrays than it is no longer anmous
		int[] nn = new int[] {10,20,30};
		
		// Arrays Element Asiment
		
		//case 1:
		int[] lk = new int[5];
		lk[0] = 10;
		lk[1] = 'a';
		byte bjkl = 20;
		lk[2] = bjkl;
		short ssds = 30;
		lk[3] = ssds;
		//lk[4] = 10L; //Compile Time Error
		System.out.println(lk[0] + lk[1] +lk[2] +lk[3]);
		System.out.println(lk[0] + " : "+ lk[1] + " : " + lk[2] +" : "+ lk[3]);
		Object[] oi = new Object[10];
		oi[0] = new Object();
		oi[1] = new String("akshay");
		oi[2] = new Integer(10);
		System.out.println(oi[0] + " : "+ oi[1] + " : "+ oi[2]);
		Number[] nnjj = new Number[10];
		nnjj[0] = new Integer(10);
		nnjj[1] = new Double(10.5);
		//nnjj[2] = new String("akshay"); // Compile Time Error
		System.out.println(nnjj[0] + " : "+ nnjj[1]);
		Runnable[] rr = new Runnable[10];
		rr[0] = new Thread();
		//rr[1] = new String("akshay"); // Compile Time Error
		System.out.println(rr[0]);
		
		// Arrays variable Assigments
		int[] fgd = {10,20,30,40};
		int[] hfg = fgd;
		System.out.println(hfg.length);
		System.out.println(hfg[0]);
		// but in case of object type arrays child type class array can be promoted to parent type array
		String[] dfff= {"A","B","C"};
		Object[] jffj = dfff;
		
		// case 2:
		int[] ll = {10,20,30,40,50,60};
		int[] lkk = ll;
		int[] le = {70,80};
		int[] lu = le;
		
		ll = le;
		le = ll;
		String[] argh = {"X","Y","Z"};
		args = argh;
		for(String sdfr : args) {
			System.out.println(sdfr);
		}
		
		// Example
		
		int array[] = new int[] {1,5,8,1,9,5,1,6,1,8,6};
		int q=1,w=1;
		int nnfd = array.length;
		if (findxinkindowSize(nnfd, array, q, w))
            System.out.println("Yes");
        else
            System.out.println("No");
		
		/*
		 * System.out.println("trying to call"); String ts = Test.s;
		 * System.out.println(ts); int sdddd = ts.length(); System.out.println(sdddd);
		 * System.out.println("text");
		 */
		ArraysExample aa = new ArraysExample();
		
		aa.m1();
		System.out.println(aa.t.toString());
		
		Test tt = new ArraysExample();
		
		Test te = new Test();
		
		int aaaa[]={1,2,5,6,3,2};  
		int bbbbb[]={44,66,99,77,33,22,55};
		
		System.out.println("Second Largest: "+getSecondLargest(aaaa,6));  
		System.out.println("Second Largest: "+getSecondLargest(bbbbb,7));
		
		System.out.println("Second Largest: "+getSecondLargest1(aaaa,6));  
		System.out.println("Second Largest: "+getSecondLargest1(bbbbb,7));
 	}

}
