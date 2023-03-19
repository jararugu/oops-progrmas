//How to access the NOn-static main method present in  different class

class sample2{
    public  void mobile() {
        System.out.println("POCO 5G");
    }

    public  void version(){
         // called by main()
          mobile(); // mobile() is static method
        System.out.println("5.2");
    }
}
      
   class Demo3{
     public static void main(String[] args) {
       // calling mobile()
       //static method present in different class ---->[new className.MemberName]
         new sample2().version(); // we are creating an object  
     }


   } 
