package interviewPractice;

public class UpperLowerCaseFromString {
	public static void main(String[] args) {
		String str ="wewASDsfsdfSDF";
		int lower =0;
		int upper =0;
		
		for(int i =0;i<str.length();i++) {
		char ch =str.charAt(i);
		if(ch>65 && ch<90) {
			upper++;
		}
		else {lower++;}
		}
		System.out.println("Upper: " +upper);
		System.out.println("Lower: " +lower);
	}

}
