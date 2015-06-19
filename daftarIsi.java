import java.io.*;
public class daftarIsi
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Masukkan Jumlah Inputan : ");
		int jml = Integer.parseInt(br.readLine());
		String [] bab= new String [jml];
		String [] halaman= new String [jml];
		
		for(int i = 0; i < jml; i++)
		{
			System.out.print("BAB " + (i+1) + ":");
			bab[i] = br.readLine();
			System.out.print("Halaman : ");
			halaman[i] = br.readLine();
			System.out.println();
		}
			tampil(bab, halaman);
	}
	
	public static void tampil(String a[], String b[])
	{
	System.out.print("DAFTAR ISI\n");
	for(int i = 0; i < a.length; i++){
		System.out.print(a[i]);
		if (i == 0){
			for(int j= 0; j < 25;j++){
			System.out.print(".");
			}
		}else{
		if (a[i].length()>a[i-1].length()){
				for(int j= 0; j < 25-a[i].length()+2;j++){
				System.out.print(".");
				}
		}else if (a[i].length()<a[i-1].length()){
				for(int j= 0; j < 25-a[i].length()-2;j++){
				System.out.print(".");
				}
		}else if (a[i].length()==a[i-1].length()){
				for(int j= 0; j < 25;j++){
				System.out.print(".");
				}
		}
		}
		System.out.print(b[i]);
		System.out.println();
	}
	}
}