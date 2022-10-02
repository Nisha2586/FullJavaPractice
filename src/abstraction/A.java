package abstraction;

public abstract class A {
	
	A(String constructor) {
		System.out.println(constructor);
	}
	abstract public void abstractMethod();//abstract method cannot be static
	

}
