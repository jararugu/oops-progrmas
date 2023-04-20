/* class caste exception:
 * instance of operator compare given object reference with given class return true,it contains
 * the given class properties else it returns false.
 * -->if you to access parent class properties,which is common to all subclass,
 *  then there is no need of performing any down casting.
 */
package com.jsp.typecasting;
//class A
//{
//	
//}
//class B extends A
//{
//	
//}
//class C extends A
//{
//	
//}

public class Instance {

	public static void main(String[] args)
	{
		A a = new A();
		B b = new B();
		C c = new C();
		System.out.println("super reference");
		System.out.println(a instanceof A);
		System.out.println(a instanceof B);
		System.out.println(a instanceof A);
		System.out.println(a instanceof C);
		System.out.println(" sub class B refrence");
		System.out.println(b instanceof  B);
		System.out.println(b instanceof  A);
		// System.out.println(b instanceof  C); not possible because b and C is not relation.
		System.out.println(" sub class refrence C");
		System.out.println(c instanceof  C);
		System.out.println(c instanceof  A);
		// System.out.println(c instanceof  B); not possible because  b and c is not relation


	}
}
/* output:
 * super reference
true
false
true
false
 sub class B reference
true
true
 sub class  C reference 
true
true
*/
