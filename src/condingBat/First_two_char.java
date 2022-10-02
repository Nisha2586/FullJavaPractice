package condingBat;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class First_two_char {

	public static void main(String[] args) {
		String str = "xhi";
		String str3;
		if (str.length() >= 2) {
			String str1 = str.substring(0, 2);
			String str2 = str1.replace("X", "");
			str3 = str2.concat(str.substring(2));
			System.out.println(str3);
		} else if (str.length() < 2) {
			if (str.equals("x")) {
				str3 = str.replace("x", "");
				System.out.println(str3);
			} else {
				System.out.println(str);
			}
		}

		System.out.println(str);

		int[] arr = {1,2,3,0,4,8,0,3,6};
		int t=0;
		for(int i=0;i<arr.length-1;i++) {
			if(arr[i]==0) {
			t=arr[i];
			arr[i]=arr[i+1];
			arr[i+1]=t;
			
			}
		}
		for(int a :arr) {
			System.out.print(a);
		}
		
		
	
	}
	
	
	
	
}
