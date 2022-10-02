package methods;

public class FindingSubStringoccurance {
	public static void main(String[] args) {
		String str="hithe hi";
		int count=0;
		for(int i=0;i<str.length()-1;i++){
		    String ss=str.substring(i,i+2);
		 if( ss.contains("hi"))
		 count++;
		   }
		   System.out.println( count);
		   String catdog ="catcatdog";
		   int cat =0;
		   int dog=0;
		   
		   for(int i=0;i<catdog.length()-2;i++) {
		   if(catdog.substring(i,i+3).equalsIgnoreCase("cat"))
			   cat++;
		   if(catdog.substring(i,i+3).equalsIgnoreCase("dog"))
		   dog++;
		   }
		   if(cat==dog)
			   System.out.println(true);
		   else System.out.println(false);
	}
}
