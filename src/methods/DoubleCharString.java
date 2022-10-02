package methods;

public class DoubleCharString {

	public static void main(String[] args) {
		String str = "the";
		char[] c = str.toCharArray();
		char[] d = new char[str.length() + str.length()];
		int j = 0;
		for (int i = 0; i < str.length(); i++) {
			d[j] = c[i];
			d[++j] = c[i];
			j++;
		}
		for (char n : d) {
			String ss = n+"";
			System.out.print(ss);
		}
		String ss = "";
		for (int i = 0; i < str.length(); i++) {
		 ss=ss+str.charAt(i)+str.charAt(i);
		 		}
		System.out.println(ss);
	}

}
