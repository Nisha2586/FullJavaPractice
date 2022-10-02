package thisAndSuper;

public class Superof extends Inheritingconstructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Superof obj = new Superof();//Usually constructors are invoked implicitly.
		Superof obj1 = new Superof("hello!!");
		Superof obj2 = new Superof("Third",10);

	}
	public Superof() {
		this("hi!");
		System.out.println("Child class non parameterised constructor.");
	}
	public Superof(String a) {
//		super(a);//explicit call.From child class,we are calling parent class
//		         //polymorphed parameterized constructor.without overridding it.
		System.out.println("Child class parameterised constructor : " +a);
	}
	public Superof(String a,int n) {
		super(a);//explicit call.From child class,we are calling parent class
        //polymorphed parameterized constructor.without overridding it.
		System.out.println(a+" Polymorphed constructor : "+n);
	}
	

}
