class Account{  // creating an class, class name is called Account
    String owner = "guru";    
    long  accno = 223323l; 
    double bal = 1500;
    String ifsc = "SBIN9494";
    String  branch = "basavanagudi";
    static String bankname = "SBI";  

     public  void ShowAccountDetails() // creating an Non-static ShowAccountDetails() function.
     {
         System.out.println(owner); 
         System.out.println(accno);
         System.out.println(ifsc);
         System.out.println(branch);
         System.out.println(bal);
         // Non static members will be stored in object inside the heap area, and can create multiple objects for same class.
     }

     public static void showbankname()   // creating an static function or method is callled showbankname.
         {
            System.out.println(bankname); 
            // static  members locate stored with static pool with one copy of class automatically.


        }
     public void deposit(double amt) // creating an function or method is called deposit. and passing one parameter called amount.
     {
          if(amt > 0)                   // Using if-else condition.if condition id true ,if block will printed.
          {
             bal = bal+amt;
             System.out.println(bal);
          }
          else{                              /// if condition is false,else block will printed.
              System.out.println("invalid amt\n");
          }
     }

     public void withdraw(double amt){   // creating an function or method is called withdraw.and passed one parameter called amt.

        if(amt >= 0  && bal >= amt){  
             
               bal = bal - amt;
 
            System.out.println("withdraw amount\n "+amt+",  cuurent bal\n" +bal);

        }
        else{
            System.out.println("insufficient bal\n");
        }
     }
  
     public static void main(String[] args) {          /// main method or function 
        
        new Account().ShowAccountDetails();            //calling ShowAccountDetails() function.
        new Account().deposit(1500);              // calling deposit()  function with parameter.
        new Account().withdraw(400);              // calling withdraw()  function with parameter.
        new Account().ShowAccountDetails();           /// calling ShowAccountDetails() function.
        
        // same user multiple objects are creating
        //abvoid : ref variable
     }

}