//How to access the static main method presentin  different class

 class sample2{
    public static void mobile() {
        System.out.println("POCO 5G");
    }

    public static void version(){
         // called by main()
          mobile(); // mobile() is static method
        System.out.println("5.2");
    }
}
      
   class Demo2{
     public static void main(String[] args) {
       // calling mobile()
       //static method present in different class ---->[className.MemberName]
        sample2.version();
     }


   } 
