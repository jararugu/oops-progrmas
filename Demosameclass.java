//how to acces the static main method in same class

class Demosameclass{

    public static void test()
    {
        System.out.println("java");
    }


    public static void main(String[] args) {
        /// call the test() method
        // static member present in same class:---> [MemberName()]
        // Demosameclass.test(); ------> we can also  write [className.MemberName],Not get an Error.
         test();
    }
}


//Output:  java