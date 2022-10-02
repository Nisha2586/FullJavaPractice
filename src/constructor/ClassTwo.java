package constructor;

public class ClassTwo {
	int b =10;
	static String c ="Hello";
	
	public ClassTwo() {
		this(6);
		System.out.println("This is a constructor"+b);
		b=30;
		System.out.println("This is a constructor"+b);
		}
	
	public ClassTwo(int a) {
		b=20;
		System.out.println(b);		
		System.out.println("This is the integer: " + a);
		System.out.println(c);
		System.out.println(c="wait");
		System.out.println(c);
		}
	protected void protected_method() {
		
		
	}

}

