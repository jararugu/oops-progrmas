/*  Example2 of super();
 * */
package com.jsp.superstatement;

class Account
{

String Owner;
long accno;
double bal;

public Account(String Owner,long accno )
{
  this.Owner = Owner;
  this.accno = accno;  
  }
 }
 
 class Savings extends Account 
 {
 
 public Savings(String Owner,long accno)
 {
 
 super(Owner,accno); 
 }
 }
 
 class Current extends Account
 {
  public Current(String Owner,long accno)
  {
    super(Owner,accno);
  }
 }
 
 class Varun2 
 {
   public static void main(String[] args)
   {
   
     Savings s1 = new Savings("guru",87879880l);
     System.out.println(s1.Owner);
     
     Current c1 = new Current("varun",7438737738l);
     System.out.println(c1.Owner);
     }
     }
 
// output:
//	 
//	 guru
//	 varun
     


