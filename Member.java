// member variable:
//any memeber ,which is declared with the body of the class is callled member variable.
//local variable:
//any varibale,which is declare with the method declation and with in the method definition is called as local variable.

class Member{
// member variable declaration
static int a;
String s1 = "java";

public static void check(){
    // local variable
    int i1 = 15;
    String s2 = "SQL";
    // acces member variable
    System.err.print(a);
    System.out.print(new Member().s1);
    // access local
    System.out.print(i1);
    System.out.print(s2);

}
public static void main(String[] args) {
    //acess member varible
    System.out.print(a);
    System.out.println(new Member().s1);
    check();
    // local can be accessed only by the method in which is declared.

   // Note: local variable are always defauly because of memory location.
   // local variables are alwys declared based on modifier of the method.
}
}