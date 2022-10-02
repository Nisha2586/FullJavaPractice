package interviewPractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArraysSortObjects {
	public String toString() {
		return null;

	}

	public static void main(String[] args) {
		String[] arr = { "Krish", "Adhvik", "Sri", "Pooja", "Vicky", "Saravan" };
		String[] arr2 = { "krish", "adhvik" };
		System.out.println(Arrays.equals(arr, arr2));

		System.out.println(Arrays.compare(arr, arr2));// --this will return negative
		// int if false,positive if true,or 0 if equals.

		Arrays.sort(arr, 2, 5);
		for (String s : arr) {
			System.out.println(s);
		}

		Arrays.sort(arr);
		for (String s : arr) {
			System.out.println(s);
		}
		// customizable sorting or comparing
		ComparatorDemo cd = new ComparatorDemo();
		Arrays.sort(arr, cd);
		System.out.println("Using comparator interface :");
		for (String s : arr) {
			System.out.println(s);
		}
		

//		Object[] arr =li.toArray();
//		Arrays.sort(arr);
//		for(Object o :arr) {
//		System.out.print(o +",");
//		}

	}

}
