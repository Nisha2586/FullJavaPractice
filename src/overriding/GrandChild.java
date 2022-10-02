package overriding;

public class GrandChild extends Child {
	static int C =1;
	String C1 ="Hi";

	public static void main(String[] args) {
	//Child.C1();
	C1();//since it inherits.all parent's methods all  child's too.
	p1();//since it inherits.all parent's methods all grand child's too.
	g1();
	Child.C1();
	GrandChild obj = new GrandChild();
	Child obj1 = new Child();
	obj.C2();//inside static method we have to call with object.
	obj.p2();//inside static method we have to call with object.//obj1.C2();
	obj.g1(100);
	System.out.println(C=13);
	System.out.println(obj.C1);
	System.out.println(Child.C);
	System.out.println(obj1.C1);
	
	
	}
	public static void g1() {
		
		System.out.println("This is static grandchild method");
	}
	public void g1(int a) {//Method overloading i.e. Polymorphism.
		super.C2();//inside non static method,we can call the super class method by super keyword.
		super.p2();
		System.out.println(super.C1);//super keyword is used to create an object for the super class nonstatic variable&methods
		                               //from child class nonstatic method.
		System.out.println("This is non static  grandchild method" + a);
	}
	public static void C1(){//Method Overriding can be possible in inheritance.
		
		System.out.println("This is static grandchild C1 method");
	}
	public  void C2() {//Method Overriding done in Inheritance
		System.out.println("This is non static grandchild C2 method");
	}

}
