package methods;

public class StringBufferBuilder {
	
	public static void main(String[] args){
	String text = "How are you?";
	String[] arr = {"ajay","viyon"};
	
	StringBuffer sb = new StringBuffer(text);
	System.out.println(sb.reverse());
	System.out.println(sb);	
	for(String a:arr) {
	System.out.println(sb.append(a));
	}
	sb.replace(0, 3, "where ");
	System.out.println(sb);
	
	StringBuilder sbui = new StringBuilder(text);
	System.out.println(sbui.append('?'));
	sbui.reverse();
	System.out.println(sbui);
	System.out.println(sbui.replace(0, 3, "Where"));
	System.out.println(sbui);
	
	String str="gnirtsesrever";
	String[] arr1 = {"hi","hello"};
	StringBuilder sb2 = new StringBuilder(str);
	System.out.println(sb2.reverse());
	
	for(String s :arr1) {
		System.out.println(sb2.append(s));
	}
	System.out.println(sb2.capacity());
	
}
}
