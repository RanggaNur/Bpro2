public class WOMethod{
public static void cetakGaris( int pGaris){
	for(int i=0;i<pGaris;i++)
		System.out.print("*");
		System.out.println();
}
public static void cetakGaris(int pGaris, String bentuk){
	for(int i=0;i<pGaris;i++)
		System.out.print(bentuk);
		System.out.println();
}
public static void cetakBanner(String kata){
	cetakGaris(kata.length()+4,"*");
		System.out.print("* " + kata + " * ");
		System.out.println();
	cetakGaris(kata.length()+4,"*");
}

public static void main (String [] args){
	cetakGaris(20,"-");
	System.out.println(" View Data Customer ");
	cetakGaris(20,"#");
	System.out.println(" id\tNama\tAlamat ");
	cetakGaris(20);
	System.out.println();
	cetakBanner("java");
	}
}