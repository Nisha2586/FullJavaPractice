package accessModifier;


public class Access2 {
	public static void A() {
		System.out.println("Public static method");
	}
	public void A1() {
		System.out.println("Public nonstatic method");
	}
	private static void A2() {
		System.out.println("private static method");
	}
	private void A3() {
		System.out.println("Private nonstatic method");
	}
	protected static void A4() {
		System.out.println("Protected static method");
	}
	protected void A5() {
		System.out.println("Protected nonstatic method");
	}
	static void A6() {
		System.out.println("Default static method");
	}
	void A7() {
		System.out.println("Default Nonstatic method");
	}
	


}
