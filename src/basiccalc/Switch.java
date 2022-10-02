package basiccalc;

import java.util.Scanner;

public class Switch {

	public static void main(String[] args) {
		//		Build a basic calculator (Plus, Minus, Multiplication, Division)
		//		(Ask user for a number and then ask for the second number
		//		– then ask for the operation: ADD, SUB, MULTI, DIV)
		//
		//		Two of the math operation needs to be a static Methods and two of them to be non-static methods.
		//		All 4 operations should be in a separate class.
		//		Use “IF and ELSE” or “SWITCH”
		Scanner ui = new Scanner (System.in);
		Scanner ui1 = new Scanner (System.in);
		System.out.println("Give the first Number: ");
		int fn = ui.nextInt();
		System.out.println("Give the Second Number: ");
		int sn = ui.nextInt();
		Operations oper = new Operations();
		int y=oper.multiply(fn,sn);
		Operations divi = new Operations();
		
		
		
		System.out.print("What Type of mathematical operation you want to perform?");
		System.out.println("Choose from these - Add,Sub,Multi or Div: " );
		String math = ui1.next();
		String mathtype = math.toUpperCase();
		
		
		switch (mathtype) {
		case ("ADD"):Operations.plus(fn, sn);break;
		case ("SUB"):System.out.println("Your Result is: " + Operations.sub(fn, sn));break;
		case ("MULTI"):System.out.println("Your Result is: " + y);break;
		case ("DIV"):divi.divide(fn, sn);break;
		default:System.out.println("Invalid Input");
		}
	}

}
