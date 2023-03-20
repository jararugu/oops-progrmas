class Account{
    String owner = "guru";
    long  accno = 223323l;
    double bal = 0.0;
    String ifsc = "SBIN9494";
    String  branch = "basavanagudi";
    static String bankname = "SBI";


     public  void ShowAccountDetails()
     {
         System.out.println(owner);
         System.out.println(accno);
         System.out.println(ifsc);
         System.out.println(branch);
         System.out.println(bal);
     }

     public static void showbankname()
         {
            System.out.println(bankname);

        }
     public void deposit(double amt){
          if(amt > 0)
          {
             bal = bal+amt;
          }
          else{
              System.out.println("invalid amt");
          }


     }

     public void withdraw(double amt){

        if(amt >= 0  && bal >= amt){
             
               bal = bal - amt;
 
            System.out.println("withdraw amount "+amt+",  cuurent bal" +bal);

        }
        else{
            System.out.println("insufficient bal");
        }
     }

     public static void main(String[] args) {
        
       // new Account().ShowAccountDetails();
        new Account().deposit(1500);
       // new Account().withdraw(400);
       // new Account().ShowAccountDetails();
        // same user multiple objects are creating
        //abvoid : ref variable
     }

}