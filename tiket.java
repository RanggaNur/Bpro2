import java.util.*;
class tiket {
	public static void main (String[]args){
		Scanner sc = new Scanner (System.in);
		
		String kolom="";
		int[][]bangku=	{{0,0,0,1,0,0},
							{0,1,0,0,0,0},
							{0,0,0,0,0,0},
							{0,0,0,0,0,0},
							{0,0,0,0,0,0},
							{0,0,0,0,0,0},
							{0,0,0,1,0,0},
							{0,1,0,0,0,0},
							{0,0,0,0,0,0},
							{0,0,0,0,0,0},
							{0,0,0,0,0,0},
							{0,0,0,0,1,0},
							{0,0,0,0,0,0}};
		
		System.out.println("Kolom\t A\t B\t C\t D\t E\t F");
		System.out.println("==============================================");
		for(int i=0;i<bangku.length;i++)
		{	
			System.out.print(i+1+"\t");
			for(int j=0;j<bangku[i].length;j++)
			{
				System.out.print(bangku[i][j]+"\t");
			}
			System.out.println();
		}
		
		
		for(int i=0;i<bangku.length;i++)
		{
			for(int j=0;j<bangku[i].length;j++)
			{
				if(bangku[i][j]==1)
				{
					if (j==0){
						kolom="A";
					}else if (j==1){
						kolom="B";
					}else if (j==2){
						kolom="C";
					}else if (j==3){
						kolom="D";
					}else if (j==4){
						kolom="E";
					}else if (j==5){
						kolom="F";
					}
					System.out.print((i+1)+kolom+"\n");
				}
			}
		}
		
		
		
		}
	}