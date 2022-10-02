package javaStatements;

import java.util.Scanner;

public class HomeWork4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//		1.Given N --- Print this pattern up to N: 1, 4, 8, 12, 16, 20…
		//		2.Given N --- Print backward to 0.
		//		(Ask user for a number and let's assume N is 5 so if the user input 5
		//		– then the program should print: 5 4 3 2 1 0)
		//
		//		3.Ask the user for a word and then print each character out one by one.
		//		Example: user enters: hello; your program will print out: h e l l o
		
		
		Scanner ui = new Scanner (System.in); // Primitive Type
		Scanner ui1 = new Scanner (System.in);// Non-Primitive 
		System.out.println("Please give a Number");
		int num =ui.nextInt();
		
		System.out.print(1);
		
		for(int i=4;i<=num;i=i+4) {
			System.out.print(", " + i);
				
		}
				
		System.out.println();
		System.out.println();
		
		System.out.println("Please give a Number");
		int num1 =ui.nextInt();
		
		for(int i=num1;i>=0;i--) {
			System.out.print(i + " ");
		}
		
		System.out.println();
		System.out.println();
		
		System.out.println("Give me a word");
		String word = ui1.next();
		char[] wordarray = word.toCharArray();
		int len = word.length();
		
		
		for (int i=0;i<=len-1; i++){
		System.out.print(wordarray[i] + " ");
		//System.out.print(word.charAt(i) + " ");			
		}
	}

}
