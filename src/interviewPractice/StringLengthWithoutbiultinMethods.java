package interviewPractice;

public class StringLengthWithoutbiultinMethods {
	
	public static void main(String[] args) {
		
		String  text ="This is my program";
		System.out.println(stringLengthWithoutBuiltMethods(text));
		int n =(Integer) null;
		
		try {
		for(int i=n;i<text.length();i++) {
			System.out.print(text.charAt(i));
		}
		}catch(Exception e) {e.printStackTrace();}
		
		
	}
	public static int stringLengthWithoutBuiltMethods(String str) {
		int i = 0;
		try {
	for(i=0;;i++) {
		str.charAt(i);
	}
		}catch(Exception e) {
		e.printStackTrace();	
		}
		return i;
	}

}
