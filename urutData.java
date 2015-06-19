import java.util.*;
class urutData{
	int data[]={2,4,5,1,3,7,6};
	System.out.println("Data Sebelum Diurutkan  ");
	
	for (int i=0;i<data.length;i++){
		System.out.println("Data ke " + i + " = "+data[i]);
	}
	for (int i=0;i<data.length;i++){
		for (int j=0;j<data.length;j++){
			if(data[i]<data[j]){
				int hasil =data[i];
				data[i]=data[j];
				data[j]=hasil;
			}
	System.out.println();
	System.out.println("Data Setelah Diurutkan : ");
	System.out.println();
	
	for (j=0;j<data.length;j++)
	{
		System.out.print(data[j]+",");
			}
		}
	}
}