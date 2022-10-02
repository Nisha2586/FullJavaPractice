package encapsulation;

public class Private {
	private static int b1=10;
	private String b2 ="boy";
	
	
	public static int getvariable() {//we can get a static private variable by using
		                             //static getter method inside that class.
		return b1;
	}
	public static void setvariable(int b1) {//we can set/manipulate a static private variable by using
											//static setter method inside that class.
		Private.b1=b1;
	}
	public String getb2() {//we can get a non-static private variable by using
								//non-static getter method inside that class.
	return b2;//while calling non-static variable from a non-static method,Inside the same Class
	          //we don,t need an object.
	}
	public void setb2(String b2) {//we can set a non-static private variable by using
								//non-static setter method inside that class.
		this.b2 = b2;
		
	}

}
