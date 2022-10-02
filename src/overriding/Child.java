package overriding;

public class Child extends Parent1 {
	final static int C =10;//final variable cannot be manipulated.
	String C1 ="Hello";
	
public static void C1() {
	System.out.println("This is static child method");
}
public  void C2() {
	System.out.println("This is non static child method");
}
final public  void C3() {// final method cannot be overriden.
	System.out.println("This is non static child method");
}
}
