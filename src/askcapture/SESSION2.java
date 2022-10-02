package askcapture;

import java.util.Scanner;

public class SESSION2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner user_input = new Scanner (System.in);//Non-Primitive
		Scanner user_input2 = new Scanner (System.in);//Primitive
		
		System.out.println("What is your name?");
		String name = user_input.nextLine();
		
		System.out.println("How old are you?");
		int age = user_input2.nextInt();
		
		System.out.println("What is your gender?");
		String gender = user_input.next();
		
		System.out.println("Where are you from?");
		String from_location = user_input.nextLine();
		
		System.out.println("Where do you live now?");
		String current_location = user_input.nextLine();
		
		System.out.println("Where do you work?");
		String work = user_input.nextLine();
		
		System.out.println("What is your jobRole?");
		String jobRole = user_input.nextLine();
		
			
		System.out.println("What is your salary?");
		double salary = user_input2.nextDouble();
		
		System.out.println("How much rise are you getting next year?");
		double annual_rise = user_input2.nextDouble();
		
		double total_salary = salary + annual_rise;
		
	

		System.out.print("My name is " + name + ".I am " + age + " years old," + gender + ". I work at " + work + " as " + jobRole + ".I currently live in " + current_location + ". I am originally from " + from_location + ". I make " + salary + " dollar.I will get " + annual_rise + " as annual rise so my total salary would be " + total_salary + " dollar next year.");
		
		//System.out.print(".I am " + age + " years old,");
		//System.out.print(gender);
		//System.out.print(". I work at " + work + " as " + jobRole );
		//System.out.print(".I currently live in " + current_location);
		//System.out.print(". I am originally from " + from_location);
		//System.out.print(". I make " + salary + " dollar.I will get " + annual_rise + " as annual rise so my total salary would be " + total_salary + " dollar next year.");
	}

}
