package oddEven;

import java.util.Scanner;

public class OddEven {
	public static void main(String[] args) {
		//Ask user for a number and print out ODD if the number is odd; otherwise print EVEN
		
		Scanner ui = new Scanner (System.in);
		System.out.println("Please Give a Number: ");
		int num = ui.nextInt();
		
		if (num%2==0) {
			System.out.println("The Given Number is EVEN.");
		}
		else System.out.println("The Given Number is ODD.");
	}

}
