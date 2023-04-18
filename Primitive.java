/*  Type casting points:
 * --> If  a method is having primitive data type argument,then for the same method ,we can pass values.
 * which are lower data type compared  to given arguments.
 * --> if there are 2 overloaded methods one with lower data type argument and other with higher data type  argument.
 * --> if you pass a lower data type value and call the method,compiler will always choose method with lower data type argument.
 *--> Even through integer and float have same capacity the data is represented in different data type.
 *
 --> compared to float and integer,float is higher data type and integer is lower data type.
 --> compare to double and long ,double is higher data type and long is lower data type.
 --> if you store a character value with an integer variable,then its unicode value will be stored in the given integer variable.
 *
 */

package com.jsp.typecasting;

public class Primitive {
	
	public static void check(int a)
	{
		System.out.println("int a:"+a);
	}
	public static void check(double a)
	{
		System.out.println("double a:"+a);
	}

public static void main(String[] args) {
	check(10);
	check('A');
	check(7.98);
	check(70091);
	
	
	
}
}

/* output:
 * int a:10
int a:65
double a:7.98
int a:70091

 */
