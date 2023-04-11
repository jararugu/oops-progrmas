/*         super() --> super statement
 
super():--> creates the object of super class wherever object of super class is created to inherit the properties.

Super():--> can be written explicitly by the programmer or implcity by the complier at the compiler.
--> if the parent class contains only parameterized constructor .then the programmer should write super(); 
explicitly and pass the required arguments.

super(); --> must be written only with in  the constructor body.
--> always be class object should be crated.first and then properties should inherited to subclass object 
and hence super();should be always written at the first line of constructor body.

multiple super(); --> written the same constructor body is not allowed,because writing multiple super();
may lead to creation of multiple super class objects which is not required.
 */
// Example 1: under program for example of super();
 package com.jsp.superstatement;

class Sample ////extends Object
{
	 public Sample(int a)
	//public Sample(int a)//4.sample(int a)--->parameterized constructor.
	{
		super(); //5.new object(); 
		//Object class constructor --->entity or object of Object class is created.
		
		System.out.println("sample()"); 
		//6.object of sample is created.
	}

}
class Demo extends Sample{
	public Demo() //2.Demo with zero
	{        

		super(8); //3.new sample(7);
		//call sample(int) with integer argument

		System.out.println("Demo()"); //7.object of Demo is created.
	}

}

public class Varun {

	public static void main(String[] args) {
		
		new Demo();  // 1.search for Demo() zero argument or default constructor. 
	}

}

/*
 output:
 sample()
Demo()
*/

/* example 2:
 class Account
 {
 
 String Owner;
 long accno;
 double bal;
 
 public Acccount(String Owner,long accno )
 {
   this.Owner = Owner;
   this.accno = accno;  
   }
  }
  
  class Savings extends Account 
  {
  
  public Savings(String Owner,long accno)
  {
  
  super(owner,accno); 
  }
  }
  
  class Current extends Account
  {
   public Current(String Owner,long accno)
   {
     super(Owner,accno)
   }
  }
  
  class Varun2
  {
    public static void main(string[] args)
    {
    
      Savings s1 = new Savings("guru",87879880);
      System.out.println(s1.Owner);
      
      Current c1 = new Current("varun",7438737738);
      System.out.println(s1.Owner);
      }
      }
      
   
  
  
 */
