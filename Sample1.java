/* constructor overloading:
Developing multiple constructors within the same class with the same,which different in 
1. number of arguments
2. datatype of arguments
3. order of datatype arguments
is called constructor overloading 
is called constructor overloading.

note:
Two overloaded constructions can have different access specifiers.
constructors can not be overloaded in different class*/

package com.jsp.constructor;

public class Sample1 {

	public Sample1() {
		System.out.println("sample com");
	}
	public Sample1(int x) {
		System.out.println("sample(int) com");
	}public Sample1(double y) {
		System.out.println("sample(double) com");
	}public Sample1(int x, double y) {
		System.out.println("sample(int), sample(double) com)");
	}public Sample1(double x,int y) {
		System.out.println("sample(double),sample(int) com");
	}
	public static void main(String[] args) {
		new Sample1();
		new Sample1(1);
		new Sample1(7.8);
		new Sample1(1,7.8);
		new Sample1(7.8,1);
	}
	
}
/* output:
 *sample com
sample(int) com
sample(double) com
sample(int), sample(double) com)
sample(double),sample(int) com
*/
