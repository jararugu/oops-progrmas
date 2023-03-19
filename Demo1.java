//how to acces the non static main method in different class

class sample{
        /// called by main()
    public  void test()
    {
        System.out.println("java");
    }
}

class  Demo1{
    public static void main(String[] args) {
        /// call the test() method
        // Non-static member present in different class:---> [new className.MemberName()]
        new sample().test(); // ---> we are using  Object creation concept
    }
}


//Output:  java