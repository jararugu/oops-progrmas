package com.jsp.pkg2;
import com.jsp.pkg.*;

public class Demo1 {
	// different class different package
	public static void main(String[] args) {
		Sample s1 = new Sample();
		System.out.println(s1.i);
	//	System.out.println(s1.i1); protected can not be accessed.
    //  System.out.println(s1.i2); package level can not be accessed.
	//	System.out.println(s1.i3);  private can not be accessed.
		s1.test();
	// s1.test1(); protected can not be accessed
	// s1.test2(); package can not be accessed.
	// s1.test3(); private can not be accessed.
	}

}
/*
1
public
 */