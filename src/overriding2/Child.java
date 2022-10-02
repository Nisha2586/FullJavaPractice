package overriding2;

public class Child extends Parent1 {
	final static int X =10;//final variable cannot be manipulated inside the class.
	final String Y ="Hello";
	
	
public static void C1() {
	System.out.println("This is static child method");
}
public  void C2() {
	System.out.println("This is non static child method");
}
final public static  void C3() {// final method cannot be overriden.
	System.out.println("This is final child method");
}
}
