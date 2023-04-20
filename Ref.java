/* class cast exception:
-->if a method is having super class reference argument then for the same method, we can pass all of its subclass reference compared 
to given method argument.
--> if there are 2 overloaded methods one with super class reference argument and other with subclass reference argument,if you pass 
subclass the method,compiler will always choose method with subclass reference argument.
 
 */
package com.jsp.typecasting;
class A
{
	
}
class B extends A
{
	
}
class C extends A
{
	
}
public class Ref {
public static void test(A a)
{
	System.out.println("super class A =" +a); // A is super class a is super class reference. 
}
public static void test(B a)
{
	System.out.println("subclass B= "+a);// B is super class b is super class reference.
}

public static void main(String[] args)
{

	
	A a = new A();
	B b = new B();
	C c = new C();  // search for c class reference,if its not there search for A
	// method call
	test(a);
	test(b);
	test(c);
}
}
