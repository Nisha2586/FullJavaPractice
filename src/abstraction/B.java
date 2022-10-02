package abstraction;

public class B extends A {// Abstract method can be used only by inheritance.
	// since we cannot create object for that abstract method.
	// If the extending child class is not abstract it has to implement that
	// abstract method.
	B() {
		super("B child Constructor");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B obj = new B();
		C obj1 = new C();
		obj.abstractMethod();
		obj1.abstractMethod();
	}

	public void abstractMethod() {
		System.out.println("This is a B child class");
	}

}
