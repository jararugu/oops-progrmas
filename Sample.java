/*  constructor:
 constructor are special type of method,which how same name as the class name.
 constructor are executed,whenever the object of the corresponding class is created. 
 
 every class must and should have constructor 
if the programmer do not write any constructor then compiler will write default constructor implicit.
constructor contains two types
1. zero argument constructor
2. Parameterized constructor

note:
constructor can not be declared as static and final keyword. 
if you specify return type for the constructor them it will be considered as a normal method.
if the programmer write constructor explicit then compiler will not write any constructor implicit*/
package com.jsp.constructor;

public class Sample {
//zero argument constructor(by programmer)
	public Sample()
	{
		System.out.println("sample class zero argument constructor");
	}
	public static void main(String[] args) {
		new Sample(); //constructor call default constructor.
	}
}
/* output:
 sample class zero argument constructor
 */
