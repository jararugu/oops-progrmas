package com.jsp.pkg;

public class Demo {
// same package different class
	
	public static void main(String[] args) {
		Sample s1 = new Sample();
		 System.out.println(s1.i);
		 System.out.println(s1.i1);
		 System.out.println(s1.i2);
		// System.out.println(s1.i3);  private can not accessed.
		 s1.test();
		 s1.test1();
		 s1.test2();
		// s1.test3(); private can not be accessed.
		 
	}
}

/* output:
1
2
3
public
protected
package level  */

