package guo;

public class Five {
	public static void main(String[] args) {
	//求1000以内既能被5整除又能被3整除的所有整数并打印出来（do  while）  
	int a=1;
	System.out.println("1000以内既能被5整除又能被3整除的所有整数:");
	do{
		if(a%5==0 && a%3==0){
		System.out.println(a);
	}
	  a++;
		}while (a<=1000);
	
	}
	
}


 

