package inheritance;

public class Child extends Parent {
	        static int x = 777;
	            String y ="Manipulated";

	public static void main(String[] args) {
			P1();
			Child obj1 = new Child();
			System.out.println(obj1.y + ". This is the child method : " + x);
			obj1.C1();
	}
	public void C1() {
		System.out.println(super.y + ". " + Parent.x );		
	}

}
