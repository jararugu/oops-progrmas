/*  Abstract :
 *--> abstract methods can not be declared as 1.final 2.static 3.private
 *--> within a abstract class,we can write
     1. only abstract methods or
     2. only concrete methods or
     3. both abstract and concrete methods.
  --> non static ,non private  members of abstract class can be accessed  by creating the object of its sub class only.
  --> static non -private members of abstract class can be accessed by using the class name.
 * 
 * 
 * difference between abstract class and concrete class.
 * 
 * Abstract class:
 * --> By default concrete methods are allowed.
 * --> we can write abstract methods with abstract keyword.
 * --> object creation is not possible
 * --> reference variable is possible.
 * --> we can write methods.
 *   1. only abstract methods. or
 *   2. only concrete methods or
 *   3. both concrete and abstract methods
 * --> we can create constructor
 *   
 *   concrete class:
 * --> By default concrete methods are allowed.
 * --> we can create object creation.
 * --> we can create of reference variable.
 * --> abstract methods not possible.
 * --> we can create constructor
 * 
 */
package com.jsp.abstractclass;
abstract class Sample
{
	public abstract void test(); // abstract method [overriding is mandatory]
	// concrete static method 
    public static void test1()
	{
		System.out.println("static concrete of abstract class");
	}
   
    public void test2() // concrete non static 
	{
		System.out.println("non static concrete of abstract class");
	}
}

	public class Demo extends Sample {
		@Override
		public  void test()
		{
			System.out.println("overridden method of abstract class");
		}

		public static void main(String[] args)

		{
			Demo m1 = new  Demo();    // object of subclass
			m1.test2();              // non static concrete of abstract class
			Sample.test1();         // static concrete of abstract class.
			m1.test();             //Overridden abstract method of abstract class
		}

	}
	
 /* output:
non static concrete of abstract class
static concrete of abstract class
Overridden method of abstract class

  */
