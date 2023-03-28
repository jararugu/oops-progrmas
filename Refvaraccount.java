/* Reference variable: It is a type of Variable,which is used to store address of an object.
A. with in a reference variables,we are can not store primitive values. 
B. with in a primitive variables,we can not store address of an object.
C. with in one reference variables,we can store only are object address.
D. multiple reference variables can point to same object.
E. If multiple reference variables points to same object 
then,changes done on the data of the object by one reference variable will import other reference variables,
F. if two reference variable points to be different objects.
then, changes done in the data of one object by one reference variables will not import other reference variables.
 */

class Refvaraccount{        //creating an class is called refvaraccount.
    String owner = "guru";
    long  accno = 223323l;
    double bal = 1500;    
    String ifsc = "SBIN9494";
    String  branch = "basavanagudi";
    static String bankname = "SBI";  // static member.


     public  void ShowAccountDetails() // creating an function or method is called ShowAccountDetails() function
     {
         System.out.println(owner);
         System.out.println(accno);
         System.out.println(ifsc);   // Non -static members.
         System.out.println(branch);
         System.out.println(bal);
        // Non static members will be stored in object inside the heap area, and can create multiple objects for same class.

     }

     public static void showbankname() // creating an static function or method is called showbankname() function.
         {
            System.out.println(bankname);
        // static  members locate stored with static pool with one copy of class automatically.

        }
     public void deposit(double amt) // creating an Non-static function is called deposit.
     {
          if(amt > 0)
          {
             bal = bal+amt;
             System.out.println(bal);
          }
          else{
              System.out.println("invalid amt\n");
          }
     }

     public void withdraw(double amt){ //creating an function is called withdraw() function.

        if(amt >= 0  && bal >= amt){
             
               bal = bal - amt;
 
            System.out.println("withdraw amount\n "+amt+",  cuurent bal\n" +bal);

        }
        else{
            System.out.println("insufficient bal\n");
        }
     }

     public static void main(String[] args) { // main() function or method
        
       // new Account().ShowAccountDetails();
       // new Account().deposit(1500);
        //new Account().withdraw(400);
        //new Account().ShowAccountDetails();
        // same user multiple objects are creating
        //abvoid : ref variable


        Account a1 = new Account(); // Account with reference variable
        a1.ShowAccountDetails();
        a1.deposit(1500);
        a1.withdraw(500);
        //Account a2 = new Account();
        //a2.ShowAccountDetails();
     }

}