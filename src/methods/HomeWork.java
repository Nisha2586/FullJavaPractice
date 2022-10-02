package methods;

import java.util.Scanner;

public class HomeWork {

	public static void main(String[] args) {
		//		1.Ask the USER for a string (it should print “Please enter a String:”)
		//		assume the user enters “hello”
		//		2.Convert that string to all uppercase and print it (it should print “HELLO”)
		//		3.Print the length of that string (it should print 5)
		//		4.Replace ‘O’ with ‘Z’ (it should print “HELLZ”)
		//		5.Give the last char of the string (it should print “Z”)
		//		6.Concatenate the string from step 1 with string "Test" (it should print “hello Test”)
		//		 
		Scanner ui =new Scanner (System.in);
		System.out.println("Please enter a string");
		String user = ui.nextLine();
		
		String upperCase = user.toUpperCase();
		System.out.println("UpperCase : " + upperCase);
		
		int len = user.length();
		System.out.println("Length of the string : "+ len);
		//System.out.println(user.toUpperCase().length());
		
		String replaced = upperCase.replace("O","Z");
		System.out.println("Replaced charecter : " + replaced);
		
		char lastletter = replaced.charAt(len-1);
		System.out.println("Last charecter of the string : " + lastletter);	
		
		String concat = user.concat(" Test");
		System.out.println("Concatinated string :" + concat);
		System.out.println("Concatinated string :" + user +" Test");
		
		
		

	}

}
