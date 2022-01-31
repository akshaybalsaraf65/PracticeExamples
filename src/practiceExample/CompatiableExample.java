package practiceExample;

import java.util.Arrays;

public class CompatiableExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int x=0;
		if(x == 0) {
			System.out.println("Hello");
		}else {
			System.out.println("Hi");
		}
		
		/*
		 * while (x == 0) { System.out.println("Hello");
		 * 
		 * }
		 */

		String str = "akshay";
		char[] ch = str.toCharArray();
		
		System.out.println("String :"+str);
		System.out.println("char :"+Arrays.toString(ch));
		
		
		int xx = 10;
		int xc = 010;
		int xg = 0X10;
		int fd = 0776;
		int xy  = 0777;
		int cr = 0XFace;
		int cc = 0XBeef;
		
		System.out.println(xx);
		System.out.println(xc);
		System.out.println(xg);
		System.out.println(fd);
		System.out.println(xy);
		System.out.println(cr);
		System.out.println(cc);
		
		byte b = 126;
		System.out.println(b);
		
		short s = 32767;
		System.out.println(s);
		
		float f = 123.456F;
		float fr = (float) 1.2e3;
		System.out.println(f);
		System.out.println(fr);
		
		double d = 123.456D;
		double ds = 0123.456;
		Double df = 010D;
		double dr = 0XFace;
		double dt = 0786.0;
		double dy = 0777;
		double dj = 1.2e3;
		System.out.println(d);
		System.out.println(ds);
		System.out.println(df);
		System.out.println(dr);
		System.out.println(dt);
		System.out.println(dy);
		System.out.println(dj);
		
		boolean br = true;
		System.out.println(br);
		
		char chh = 'a';
		char cj = 97;
		char cy = 0XFace;
		char cd = 0777;
		char ci = 65535;
		char cx = '\u0061';
		char cf = '\n';
		System.out.println(chh);
		System.out.println(cj);
		System.out.println(cy);
		System.out.println(cd);
		System.out.println(ci);
		System.out.println(cx);
		System.out.println(cf);
		
		double dw = 1_23_456.789;
		double dh = 123_456.7_8_9;
		double dff = 1__23_4_5__56__7__89;
		double dss = 1___23___4___56___7___89;
		System.out.println(dw);
		System.out.println(dh);
		System.out.println(dff);
		System.out.println(dss);
	}

}
