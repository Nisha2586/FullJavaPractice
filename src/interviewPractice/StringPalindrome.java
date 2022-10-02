package interviewPractice;

import java.util.Arrays;

public class StringPalindrome {

	public static void main(String[] args) {
		String str = "malayalam";

		String str2 = "";
		for (int i = str.length() - 1; i >= 0; i--) {
			str2 = str2 + str.charAt(i);
		}
		System.out.println(str2);
		if (str.equals(str2)) {
			System.out.println(str2 + " : The gvn string is palindrome.");
		} else {
			System.out.println(str + " : The gvn string not is palindrome.");
		}

		char[] arr = str.toCharArray();
		char[] arr2 = new char[arr.length];
		int k = 0;
		for (int j = arr.length - 1; j>=0; j--) {
			arr2[j] = arr[k];
			k++;
		}
		for(char a : arr2) {
			System.out.print(a);
		}
		if(Arrays.compare(arr, arr2)==0) {
		System.out.println("palindrome");}
	}

}
