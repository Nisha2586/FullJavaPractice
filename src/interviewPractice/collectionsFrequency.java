package interviewPractice;

import java.util.HashMap;
import java.util.Map;

public class collectionsFrequency {

	public static void main(String[] args) {
		String gvn = "abcabc";
		Map<Character,Integer> freq = new HashMap<Character,Integer>();
		
		char[] arr=gvn.toCharArray();
		for(char ch :arr) {
		if(freq.containsKey(ch)) {
			freq.put(ch, freq.get(ch)+1);
		}else
			freq.put(ch, 1);

	}
		System.out.println(freq);
		
	}
}
