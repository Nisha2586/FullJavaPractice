package basiccalc;

import java.util.Scanner;

public class Add {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//		Build a basic calculator (Plus, Minus, Multiplication, Division)
		//		(Ask user for a number and then ask for the second number
		//		– then ask for the operation: ADD, SUB, MULTI, DIV)
		//
		//		Two of the math operation needs to be a static Methods and two of them to be non-static methods.
		//		All 4 operations should be in a separate class.
		//		Use “IF and ELSE” or “SWITCH”
		
		Scanner ui = new Scanner(System.in);
		Scanner ui1 = new Scanner(System.in);
		
		
		System.out.println("Give me the First Number: ");
		int fn = ui.nextInt();
		System.out.println("Give me the Second Number: ");
		int sn = ui.nextInt();
		System.out.print("What Type of mathematical operation you want to perform?");
		System.out.println("Choose from these - Add,Sub,Multi or Divi: " );
		String operations = ui1.next();
		
		if(operations.equalsIgnoreCase("Add")) {
		   plus(fn, sn);
		}
		else if(operations.equalsIgnoreCase("Sub")) {
			int y=Sub.sub(fn, sn);
			System.out.println("Your Result is: " + y);
		}
		
		else if(operations.equalsIgnoreCase("Multi")) {
			Multiply multi = new Multiply();
			int z = multi.multiply(fn,sn);
			
			System.out.println("Your Result is: " + z);
		}
		else if(operations.equalsIgnoreCase("Divi")) {
			Divide divi = new Divide();
			divi.divide(fn, sn);						
		}
		
		else System.out.println("Invalid input");
	}
	public static void plus(int a,int b) {
		int x =a+b;
		System.out.println("Your Result is: "+ x);
		
	}

}
