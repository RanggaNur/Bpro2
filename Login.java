import java.io.*;
class Login{
	public static void main (String[]args) throws IOException{
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		
		String user = "Rangga";
		String password = "raa";
		
		System.out.println("===================");
		System.out.println("        LOGIN      ");
		System.out.println("===================");
		
		System.out.print("Masukkan Username : ");
		user=br.readLine();
		System.out.print("Masukkan Password : ");
		password=br.readLine();
		if (user.equals("Rangga") && password.equals("raa")){
			System.out.println("===================");
			System.out.println("Login Berhasil");
		}else{
			System.out.println("===================");
			System.out.println("Login Gagal");
		}
	}
}