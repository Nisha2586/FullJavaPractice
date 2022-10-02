package overriding;

public class Parent1 {

	public static void p1() {
		System.out.println("This is static Parent method");
	}
	public  void p2() {
		System.out.println("This is non static Parent method");
	}
	private  void p3() {// Private method can be accessed only within the class.
		System.out.println("This is non static Private Parent method");
	}
}

