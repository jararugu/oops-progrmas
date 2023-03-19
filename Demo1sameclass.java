//how to acces the non static main method in same  class

class Demo1sameclass{
    /// called by main()
public  void test()
{
    System.out.println("java");
}
public  void check()
{
    test();  ///--> test() is Non-static
    // calling is Non-static and called in non-static present in same class only MemberName.
    System.out.println("Notes");
}


public static void main(String[] args) {
    /// call the test() method
    // Non-static member present in same class:---> [className.MemberName()]
     new Demo1sameclass().check(); // ---> we are using  Object creation concept
}
}


//Output:  java Notes