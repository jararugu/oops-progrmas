    /*  inheritance:
one class acuquering the properties of another class is called inheritance.
--> The class from where properties are inherited is called as base class or base class or super class.
--> The class which is inheriting properties is called as child class or sub class.
--> In java inheritance is achieved by using extends keyword.
--> Using base class object,we can access only properties of base class.
--> using sub class object,we can access properties of both sub class and base class.
--> final class can not be inherited.
--> final data member and function member of the class can be inherited.
--> Constructors of the class can not be inherited.
--> private data member and function member of the class can not be inherited. 

     */
package com.jsp.inheritance;

 class Manager1 { // if we can declared final keyword ,if can not access Manager properties.
		  int sal = 900; // static

	public void projectdetails() // static
	{
		System.out.println("projectdetails of company ");
	}
	/*public Manager1()
	{
		
		System.out.println("manager1");
	} */

}
 class Employee extends Manager1 // final
{
	    int bonus = 1000; // static ,final
	public void Employeedetails() {
		System.out.println("Employeeedetails of employee ");
	}
}

public class Manager {
	 
	public static void main(String[] args) {
	 Employee e1 = new Employee();
	

	 e1.Employeedetails();
	 e1.projectdetails();

	 System.out.println(e1.sal);
	 System.out.println(e1.bonus);
	}
}

//ouput:
//	900
//	1000
