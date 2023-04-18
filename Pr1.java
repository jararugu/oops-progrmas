/* Type casting :
 * converting one type to another type is called type casting.
 * --> two types of type casting
 * 1. primitive casting
 * 2. derived casting
 * 
 * primitive casting :
 * converting one primitive data type value to another primitive data type value is called primitive data type.
 * 
 * In primitive data type there are two types
 *1. widening
 *2. narrowing
 *
 *wideningL:converting lower data type to higher data type isa called widening.
 *--> widening is done implicitly by the compiler.
 *
 *narrowing: converting higher data type to lower data type is called narrowing.
 *narrowing should be done explicitly by the programmer.
 *
 *example:
 *
 
 */
package com.jsp.typecasting;

public class Pr1 {
	public static void main(String[] args) {
		
		
	 int a = 10;     // convert integer to double
	 double b= a;   //  double b=10;
	 System.out.println(a);
	 System.out.println(b);
	 
	
	 //convert double to integer
	 double a1 = 1.79;
	 int a2 = (int)a1;  // narrowing
	 System.out.println(a1);
	 System.out.println(a2);
	
	
	// float into integer
	float f1 = 9.80f;
	int i1= (int)f1; //narrowing
	System.out.println(f1);
	System.out.println(i1);

	// convert char into integer
	int a3 = 'A'; ///widening
	System.out.println(a3);
	
	}

}


/* output:
	10
	10.0
	1.79
	1
	9.8
	9
	65
	*/

