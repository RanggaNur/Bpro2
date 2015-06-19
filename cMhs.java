import java.io.*;
import java.util.*;
public class cMhs{

	public static void cariByNim(){
		Scanner sc = new Scanner(System.in);
		System.out.println();
		System.out.println("Pencarian Data Mahasiswa");
		System.out.println();
		System.out.print("Masukkan Nim yang dicari : ");
		String nim = sc.next();
		String str=dMhs.carinim(nim);
		if (str.equals("")){
			System.out.println();
			System.out.println("Nim" + nim + "Tidak Ditemukan Dalam Array");
		}else{
		System.out.println(str);
		}
	}
	
	public static void filByNama(){
		Scanner sc = new Scanner(System.in);
		System.out.println();
		System.out.println("Pencarian Data Mahasiswa");
		System.out.println();
		System.out.print("Masukkan Nama yang dicari : ");
		String nama = sc.next();
		dMhs.filterNama(nama);
	
	
	}
	
	public static void filByAngkatan(){
		Scanner sc = new Scanner(System.in);
		System.out.println();
		System.out.println("Pencarian Data Mahasiswa");
		System.out.println();
		System.out.print("Masukkan Angkatan yang dicari : ");
		String akt = sc.next();
		dMhs.filterAng(akt);
		}
		
		public static void deleteMhs(){
		Scanner sc = new Scanner(System.in);
		System.out.println();
		System.out.println("Hapus Data Mahasiswa");
		System.out.println();
		System.out.print("Masukkan Nim yang dihapus : ");
		String nim = sc.next();
		String str=dMhs.DeleteData(nim);
		if (str.equals("")){
			System.out.println();
			System.out.println("Nim" + nim + "Tidak Ditemukan Dalam Array");
		}else{
		System.out.println(str);
		}
		}
		
		public static void viewData(){
			dMhs.view();
		}

public static void main(String []strd) throws IOException
{
 BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
  int bil1=0;
  int bil2=0;
  int bil3=0;
  int bil4=0;
 
 Scanner sc = new Scanner (System.in);
  boolean Selesai = false;
   int piluser;
  do{
   System.out.println ("");
   System.out.println ("==========================");
   System.out.println (" PENCARIAN DATA MAHASISWA ");
   System.out.println ("==========================");
   System.out.println ("");
   System.out.println ("1. CARI BERDASARKAN NIM");
   System.out.println ("2. FILTER BERDASARKAN NAMA");
   System.out.println ("3. FILTER BERDASARKAN ANGKATAN");
   System.out.println ("4. DELETE DATA MAHASISWA BY NIM");
   System.out.println ("5. UPDATE DATA MAHASISWA");
   System.out.println ("6. ADD DATA MAHASISWA");
   System.out.println ("7. VIEW DATA MAHASISWA");
   System.out.println ("8. EXIT");
   System.out.print ("Pilih pilihan [1-8] : ");
   piluser = sc.nextInt();
   
   switch(piluser){
	case 1:
		cariByNim();
	break;
    
	case 2:
		filByNama();
	break;
	
	case 3:
		filByAngkatan();
	break;
	
	case 4:
		deleteMhs();
	break;
	
	case 5:
	break;
	
	case 6:
	break;
	
	case 7:
		viewData();
	break;
	}
   
    } while (piluser<8);
    
 }

 
}
