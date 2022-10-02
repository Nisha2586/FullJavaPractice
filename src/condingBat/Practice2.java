package condingBat;

import java.util.Scanner;

public class Practice2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Given a string, return a new string made of 3 copies of the last 2 chars of the original string. 
		//The string length will be at least 2.without using print/println inside that method.
		Scanner ui = new Scanner (System.in);
		System.out.println("Give a String: ");
		String str = ui.next();
		Practice2 obj = new Practice2();
		System.out.print(obj.extraEnd(str));
		}
	public String extraEnd(String str) {
		if (str.length() >=2) {
		  String finalValue = "";
		  int count = 0;
		    while (count<=2){
		    int len = str.length();
		    char[] strarr = str.toCharArray();
		    for (int i=len-2;i<=len-1;i++){
		      finalValue = finalValue +strarr[i];
		    }
		    count = count + 1;
   		  }
		  return finalValue ;
		}
		  else return "String length should be atleast 2";
		}
		//public String extraEnd(String str) {
		//	  String end = str.substring(str.length()-2);
		//	  return end + end + end;
}
