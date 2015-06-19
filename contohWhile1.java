import java.util.*;
class contohWhile1{
	public static void main (String[]argv){
		Scanner sc=new Scanner (System.in);
		System.out.println("Masukkan k : ");
		int k=sc.nextInt();
		System.out.println("Masukkan b : ");
		int b=sc.nextInt();
		
		int a=0;
		while(a<k){
			int x=0;
			while(x<b){
				if ((a==0)||(a==(k-1)||(x==0)||(x==(b-1))));
				System.out.print("*");
				x++;
			}
			System.out.print("*");
			a++;
		}
	}
}