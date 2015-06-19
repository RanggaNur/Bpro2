import java.util.*;
class CData{
	public static void main (String[]args){
		Scanner sc=new Scanner(System.in);
		int [] a={12,4,6,11,8,2,7,23,1,14,21,30,32,18,16};
			System.out.print( "Cari Data : ");
			int b=sc.nextInt();
		int idx=1;
			for (int i=0;i<a.length;i++){
				if (b==a[i]){
					idx=i;
				}
			}
			System.out.println( "Data pada baris : " +idx);

	}
}

