package interfacePack;

public interface Childinterface extends SetOfRules {
	int S = 15;//By inheritance you can manipulate final variables.
	String C = "final";
	public void C1();
	public int S2();
	
	default public void C2() {
		System.out.println("All are welcome");
	}
	Childinterface obj = new D();//dynamic binding
	public static void method1() {
		System.out.println(S);
		System.out.println(obj.S3());
	}
	

}
