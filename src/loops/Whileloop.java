package loops;

public class Whileloop {

	public static void main(String[] args) {
			int total = 0;
			int N =1;
			while(N<=5) {
				total=total+N;
				N++;
			}
			System.out.println(total);
			
			int sum=0;
			N=1;
			while(N<=20) {
				if(N%3==0 && N%5==0) {
					sum=sum+N;
				}
			N++;
	}
			System.out.println(sum);
	//---------------------------------------------------------			
	//                     2 6 12 20 30 
			N=1;
			while(N<=5) {
				System.out.print(N*(N+1)+" ");
				N++;				
			}
			
			System.out.println();
			
			int j=0;//1*10,2*9,3*8,4*7,5*6
			int k=10;
			while(j<=5) {//j<=k
				System.out.print(j*k +" ");
				j++;
				k--;
			}
			System.out.println();
			//OR
			
			int B=10;
			for(int i=1;i<=5;i++) {//10 18 24 28 30
			System.out.print(i*B+ " ");
			B--;
			}
			
			int x=0;//1,2,4,7,11,16
			total=1;
			while(x<=5) {
				total=total+x;
				System.out.print(total);
				x++;
			}

	}

}
