//How to access the static main method presentin  same class

class Demo2sameclass{
    public static void mobile() 
    {
        System.out.println("POCO 5G");
    }

    public static void version()
    {
         // called by main()
          mobile(); // mobile() is static method
           System.out.println("5.2");
    }

      
     public static void main(String[] args) 
     {
          // calling mobile()
          //static method present in same class only ---->[MemberName]
         version();
     }


   } 

   /*Output: 
    
              POCO 5G
               5.2     */
          
