package condingBat;

import java.util.Scanner;

public class Practice1 {

	public static void main(String[] args) {

	//		Given 2 strings, a and b, return a string of the form short+long+short,
	//		with the shorter string on the outside and the longer string on the inside.
	//		The strings will not be the same length, but they may be empty (length 0).

		Scanner ui = new Scanner(System.in);
		System.out.println("Give a String: ");
		String a = ui.nextLine();
		System.out.println("Give another String: ");
		String b =ui.nextLine();
		Practice1 meth = new Practice1();
		System.out.println(meth.combostring(a,b));
		
		
	}
	public String combostring(String a,String b) {
		if(a.length()>b.length()) {
			return (b+a+b);
		}
		else return (a+b+a);
	}
}
