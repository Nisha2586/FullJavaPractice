package condingBat;

import java.util.Scanner;

public class Practice3 {

	public static void main(String[] args) {
		// return the larger value between 2 ints that is in range 10,20 inclusive or
		//return 0 if neither is in that range.
		Scanner ui = new Scanner(System.in);
		System.out.println("give me a number");
		int a = ui.nextInt();
		System.out.println("give me a number");
		int b = ui.nextInt();
		Practice3 obj =new Practice3();
		System.out.println(obj.max1020(a, b));
	}
	public int max1020 (int a,int b) {
			int max = Math.max(a, b);	
		if((max >=10) && (max<=20)){
			return max ;
		}
		else if (max >20) {
			if((a>=10) && (a<=20)){
				return a;
			}
			else if ((b>=10) && (b<=20)) {
				return b;
			}
			return 0;
		}
		else return 0;
	}

}
