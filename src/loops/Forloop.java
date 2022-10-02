package loops;

public class Forloop {

	public static void main(String[] args) {
		for(int i=1;i<=121;i=i*11) {//1 11 121
			System.out.print(i+" ");
		}
		System.out.println();
		
		for(int i=1;i<=4;i++) {//1 4 9 16 
			System.out.print(i*i+" ");
			
		}
		System.out.println();
		
		for(int i=1;i<=4;i++) {//1 8 27 64 
			System.out.print(i*i*i+" ");
			
		}
		System.out.println();
		
		for(int i=1;i<=5;i++) {//1 2 3 4 5
			System.out.print(i+" ");
			
		}
		System.out.println();
		
		for(int i=1;i<=5;i++) {//1 1 1 1 1
			System.out.print(1+" ");
			
		}
		System.out.println();
		
		for(int i=1;i<=9;i=i+2) {//1 3 5 7 9
			System.out.print(i+" ");
			
		}
		System.out.println();
		//OR
		for(int i=1;i<=10;i++) {//1 3 5 7 9
			if (i%2!= 0) {
			System.out.print(i+" ");
			}
		}
		
		System.out.println();
		
		for(int i=0;i<=10;i=i+2) {//0 2 4 6 8 10
			System.out.print(i+" ");
			
		}
		System.out.println();
		//OR
		for(int i=0;i<=10;i++) {//0 2 4 6 8 10
			if (i%2== 0) {
			System.out.print(i+" ");
			}
		}
		

	}

}
