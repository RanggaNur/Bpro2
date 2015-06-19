import java.util.*;
class cariD{
	public static int cari(int []data,int jawab){
		int x;//cari
			for(x=0;x<data.length;x++)
			if (data[x]==jawab)
			return x;
			return -1;
	}
	public static void main (String[]args){
			Scanner sc=new Scanner(System.in);
		int [] a={1,2,3,4};
				System.out.println("Data Array");
				System.out.println();
			for(int c=0;c<a.length;c++){
				System.out.print(" ( " + a[c] + " ) ");
			}
			
			System.out.println();
			System.out.println();
			System.out.print( "Cari Data : ");
			int b=sc.nextInt();
			System.out.println( "Data pada baris : " + cari(a,b));
	}
}