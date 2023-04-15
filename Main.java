/*  Abstract:
 *--> incomplete
 *--> A method, which has only method declaration and method definition is called as abstract method.
 *--> abstract method must be declared by using abstract keyword.
 *--> if  a class contains at least one abstract method, then the class must be declared as abstract class.
 *--> it is impossible to create object of an abstract class.
 *--> we can create reference variable of abstract class type.
 *
 //Rule of Abstract:
 *--> if the class in inherits from abstract  methods parent in super class abstract class. 
 * else subclass declared as abstract class.
   
  //concrete class:
 --> if class declared without using abstract keyword ,those are called concrete classes.
  --> if class only concrete methods then we can use concrete classes.
  --> a method which  as method declaration and definition id known as concrete method.
 *
 * 
 * 
 */
package com.jsp.abstractclass;
abstract class Sample1
{
	public abstract void test();
	// abstract method  [overriding is mandatory]
}

public class Main extends Sample1
{
	public void test()
	{
		System.out.println("overridden method of abstract class");
	}
	public static void main(String[] args)
	{
		Main m1 = new Main();
		m1.test();
	// new Sample1();
		Sample1 s1; // reference variable of abstract class.
	}
}

/* output:
 * Overridden method of abstract class
 */
