import java.io.*;
import java.util.*;
public class dMhs{
  
  public static String [][]dataList = {
  {"08410100375","Purwanto",},
    {"10410100146","Noer Hidayat"},
    {"10410100162","Sandy Perdana"},
    {"11410100142","Himawan Pradipta Utama"},
    {"12410100049","Sujatmiko Hadinugroho"},
    {"12410100070","Denny Kusuma"},
    {"12410100088","Mochammad Afri Fitriansyah"},
    {"12410100131","Pradita Satria Prima"},
    {"12410100159","Fajriyan Nurli"},
    {"12410100160","Hazvi Fahlevi"},
    {"13410100006","Nico Stephanus Kuncoro"},
    {"13410100007","Ramdhani Kurniawan"},
    {"13410100048","Alanvianto Mukti Tamtomo"},
    {"13410100049","Satryo Widodo"},
    {"13410100058","Khamim Ahsanu Amala"},
    {"13410100060","Arfiansyah Agma"},
    {"13410100061","Candra Dwi Prasetya"},
    {"13410100069","Mohammad Rangga Nurcahyo"},
    {"13410100083","Raymond Andreas Soebijantoro"},
    {"13410100153","Dwiki Rizwan Nizar"},
    {"13410100155","Anggy Pranindya Sudarmadji"},
    {"13410100157","Wahyu Alfiyanda"},
    {"13410100180","Rayana Suryatama"},
    {"13410100190","Bryan Asril Zani"},
    {"13410100192","Eko Amiyantho"},
    {"13410100200","Kristin Lebdaningrum"},
    {"13410100206","RB. Nuriana Alim Putra"},
    {"13410100216","Sabdo Wicaksono Putra"},
    {"14410100170","Rizky Akbar"},
    {"14410100172","Abdul Haris"},
    {"14410100173","Ach Nofal Kurniawan"},
    {"14410100174","Andri Anggara"},
    {"14410100175","Auda Rizqi Aulany"},
    {"14410100176","Noppy Wahyono Suwoto"},
    {"14410100177","Arya Teja"},
    {"14410100178","Nuari Imas Masita"},
    {"14410100179","Afif Lutfian Fahmi Chudlori"},
    {"14410100181","Novita Perdani"},
    {"14410100182",  "Dheta Amelya Kurniawendy"}
  };
 

	  public static String carinim(String nim){
		  //int bil2=0;
			for(int k =0;k<dataList.length;k++){
			if(dataList[k][0].equals(nim))
			  return dataList[k][0] + "  " + dataList[k][1]+ "Pada data ke "+k;
				//System.out.println();
			  //System.out.println(dataList[k][0]+"  "+ dataList[k][1] );
			  //System.out.println();
			  //bil2=1;
			}
			return " ";
		}
		
		public static  void filterNama(String nama){
		  for(int k =0;k<dataList.length;k++){
			if(dataList[k][1].toLowerCase().contains(nama.toLowerCase()))
			System.out.println(dataList[k][0] + "  " + dataList[k][1] + "Pada data ke "+k);
			}
			//return " ";
		}
		
		public static void filterAng(String ang){
		  for(int k =0;k<dataList.length;k++){
			if(dataList[k][0].substring(0,2).contains(ang))
			System.out.println(dataList[k][0] + "  " + dataList[k][1] + "Pada data ke "+k);
			}
			//return " ";
		}
		
		public static String DeleteData(String nim) {
			for(int i=0;i<dataList.length;i++) {
				if(dataList[i][0].equals(nim)) {
					dataList[i][0] = dataList[i+1][0];
					dataList[i][1] = dataList[i+1][1];
				}
			}
			return "";
		  }
  
  public static String UpdateData(String nim, String nama) {
	for(int i=0;i<dataList.length;i++) {
		if(dataList[i][0].equals(nim)) {
			dataList[i][1] = nama;
		}
    }
    return"";
  }
  
  public static void view(){
	for(int i=0;i<dataList.length;i++){
		System.out.println(dataList[i]);
		}
	}
		
		
public static void main(String []strd) throws IOException{
 BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
 Scanner sc = new Scanner (System.in);
  boolean Selesai = false;
  //int bil1=0;
  //int bil2=0;
  //int bil3=0;
  //int bil4=0;
    
 }

 
}