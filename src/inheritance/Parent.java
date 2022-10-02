package inheritance;

public class Parent {
	final static int x=10;
	final String y ="Hi!!!";
	
	public static void P1() {
		Parent obj = new Parent();
		System.out.println(obj.y + " This is the parent method : " + x);
	}

}
