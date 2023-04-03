// constructor are used initialize the data member of the class.

package com.jsp.constructor;

 class MainEmployee {

	String name;
	String email;
	int id;
	double sal;	


public MainEmployee(String name,String email,int id,double sal)
{
// both member and local have same name[this.name is pointing to member variable] and nameis from local.	

this.name = name;
this.email = email;
this.id = id;
this.sal = sal;
}
public void showempdetails() {
System.out.println("[empname: "+name+",emp-email: "+email+",empid: "+id+",empsal:"+sal+"] ");	
}
}

public class Employee
{
	public static void main(String[] args) {
		MainEmployee e1 = new  MainEmployee("yash","yash@gmail.com",101,50000.0);
		e1.showempdetails();
		
	}
	
	
}

/* output:
  [empname: yash,emp-email: yash@gmail.com,empid: 101,empsal:50000.0] 
*/
 
/* Note:
 This keyword;
 *this keyword is used to different between local variables and globle variables with in a method/constructor.
 whenever  they have same name.
 always points to same class object.
 */

