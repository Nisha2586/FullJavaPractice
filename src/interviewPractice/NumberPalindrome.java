package interviewPractice;

public class NumberPalindrome {

	public static void main(String[] args) {
	int num =4545;
	int i =num;
	
	int t =0;
	while(num>0){
		t=(t*10)+num%10;
		num=num/10;
		System.out.println(t);
	}
	if (i==t) {
		System.out.println(i + " : The given number is palindrome .");
	}else {	System.out.println(i + " : The given number is not palindrome .");}

	}

}
