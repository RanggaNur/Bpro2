import java.util.*;
public class DataBuku {
	public static void main (String[]args){
	int [][]databrg = {{12,10,10,5},
					{3,5,8,9},
					{15,10,6,2},
					{13,8,7,4},
					{19,5,5,11},
					{20,4,4,8},};
	
	String [] hari= {"Senin ","Selasa","Rabu  ","Kamis ","Jumat ","Sabtu "};
	String [] barang= {"Pensil","  Penggaris","      Buku","   Penghapus","Omset"};
	int omset=0;
	int omset1=0;
	int omset2=0;
	int omset3=0;
	int omset4=0;
    System.out.println("================================================================");
    System.out.println("-------------------------\"Harga perBarang\"------------------------");
    System.out.println("1. Pensil 	 										Rp.2500,-");
    System.out.println("2. Penggaris  										Rp.1500,-");
    System.out.println("3. Buku Tulis 	 									Rp.3500,-");
    System.out.println("4. Penghapus  										Rp.2000,-");
    System.out.println("================================================================");
    System.out.println("");
    System.out.println("===========================================================================================");
	
	System.out.print("Barang/Hari" + "\t");
	
		for (int b=0; b<barang.length; b++) {
			System.out.print(barang[b] + "\t");
		}
			System.out.println("");
			for (int i=0; i<hari.length; i++){
			System.out.print(hari[i] + "\t" + "\t");
				for (int j=0; j<databrg[i].length; j++){
				System.out.print(databrg[i][j] + "\t" + "\t");
				omset+=databrg[i][j];
				}
					System.out.print( "\t"+ "\t"+ "\t"+ "\t"+ "\t"+ "\t"+ "\t"+ "\t"+ "\t"+omset );
					omset=0;
					System.out.println();
			}
				for (int a=0; a<databrg.length; a++){
					omset1+=databrg[a][0];
					omset2+=databrg[a][1];
					omset3+=databrg[a][2];
					omset4+=databrg[a][3];
				}
	System.out.print("Total" + "\t\t"+ omset1 + "\t\t" + omset2 + "\t\t" + omset3 + "\t\t" + omset4 + "\t\t" );
    System.out.println("=================================================================================================");
	
	System.out.println(" ");
    
    String [] nbarang = {"Pensil" , "Penggaris" , "Buku Tulis" , "Penghapus"};
    int [] hargabarang = {2500 , 1500 , 3500 , 2000};
    Scanner sc = new Scanner (System.in);
    int omset5 [] = new int [nbarang.length];
    int blaris [] = new int [nbarang.length];
    int totHari [] = new int [nbarang.length];
    int totalmingguan [] = {0,0,0,0,0,0,0};
    int harian=0;
    int totalakhir=0;
    int laris=0;
    int sedikit=0;
    int rata=0;
    int ratatot=0;
    int total [] = {0,0,0,0,0,0,0};
  
  
    for(int a=0;a<hari.length;a++)
    {
      //Looping Hari Senin-Minggu
      System.out.println("Hari "+hari[a]);
       for(int b=0;b<nbarang.length;b++)
       {
         //Looping Nama Barang
         System.out.print("Masukkan jumlah " +nbarang[b]+ " yang terjual : " + " ");
          blaris [b] = sc.nextInt();
          //Mencari barang terlaris dan tidak laris
          if (blaris[laris]>blaris[b]);
          {
            laris=laris;
          }
          if (blaris[b]>blaris[laris]){
            laris=b;
          }
           if (blaris[sedikit]<blaris[b]);
          {
            sedikit=sedikit;
          }
          if (blaris[b]<blaris[sedikit]){
            sedikit=b;
          }
          totHari[b] = blaris[b]*hargabarang[b];
          harian+=totHari[b];
       }
          total[a]+=harian;
          totalmingguan[a]+=total[a];
          totalakhir+=totalmingguan[a];
          ratatot = totalakhir/7;
		  rata    = harian / 4;
		  System.out.println(" ");
		  System.out.println("============================================================================================");
          System.out.println("Produk paling laris terjual di hari " +hari[a]+ " : " +nbarang[laris] );
          System.out.println("Produk paling tidak laris terjual di hari " +hari[a]+ " : " +nbarang[sedikit]);
          System.out.println("Rata - rata penjualan produk di hari " +hari[a]+ " : " +"Rp."+rata);
          laris=0;
          sedikit=0;
          System.out.println("Omset Per hari " +hari[a]+ " : " +"Rp."+total[a]);
          harian=0;
		  System.out.println("============================================================================================");
          System.out.println("\n");
    }     
    
    System.out.println("   Total pendapatan selama seminggu "+"Rp." +totalakhir+                 "");
    System.out.println("   Rata - rata pendapatan selama seminggu "+"Rp." +ratatot+                 "");
    System.out.println("====================================================================");
	}
}