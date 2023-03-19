//how to acces the static main method in different class

class sample{

    public static void test()
    {
        System.out.println("java");
    }
}

class  demo{
    public static void main(String[] args) {
        /// call the test() method
        // static member present in different class:---> [className.MemberName()]
        sample.test();
    }
}


//Output:  java