import java.util.*;
class DPenjualan {
	public static void main (String[]args){
	Scanner sc=new Scanner (System.in);
		String[]hari={"senin","selasa","rabu","kamis","jumat","sabtu","total"};
		String[]barang={"Pensil 2B","Buku Tulis","Penggaris","Penghapus"};
						//{"Pensil 2B","Buku Tulis","Penggaris","Penghapus"}};
		int [][]jumlah={{10,10,4,13,2,10,49},
						{5,8,4,3,12,10,42},
						{9,3,4,13,12,10,51},
						{14,10,4,3,1,10,42}};
						
		System.out.println();
		System.out.println("\"Data Penjualan\"");
		System.out.println();
		
		System.out.print("\"Hari\"\t");
		for(int i=0; i<hari.length;i++){
			System.out.print(hari[i]+"\t");
		}
		System.out.println("Total");
		
		for(int a=0;a<jumlah.length;a++){
			System.out.print(barang[jumlah]+"\t");
			for(int b=0;b<jumlah[a].length;b++){
				System.out.print(jumlah[a][b]+"\t");
				
			}
		}
		
	}
}