package encapsulation;

public class Encapsulation {
	private static int a1=10;
	private String a2 = "apple";

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Encapsulation E = new Encapsulation();
		Private P = new Private();
		Private P1 = new Private();
		System.out.println(a1);
		System.out.println(E.a2);
		System.out.println(Private.getvariable());
		System.out.println(P.getb2());
		Private.setvariable(222);
		P.setb2("zoo");
		System.out.println(Private.getvariable());
		System.out.println(P.getb2());
		System.out.println(P1.getb2());

	}

}
