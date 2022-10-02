package interfacePack;

public class D implements SetOfRules,Childinterface{
	public static void main(String[] args) {
		System.out.println(SetOfRules.S);//variable values cannot be manipulated as
											//	it is final by default.
		System.out.println(C);//C  != manipulated to any other string.
		
		D obj = new D();
		obj.C2();
		Childinterface.method1();
		Childinterface child = new D();//Dynamic binding.
		System.out.println(child.S3());
		SetOfRules obj1 = new D();		
	}

	@Override
	public void C1() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void S1() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int S2() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String S3() {
		// TODO Auto-generated method stub
		return "End";
	}

}
