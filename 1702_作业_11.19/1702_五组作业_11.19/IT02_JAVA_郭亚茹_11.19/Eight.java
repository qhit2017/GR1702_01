package guo;

public class Eight {
	public static void main(String[] args) {
	//求个位数为6且能被3整除的三位整数共有多少。
     int sum=0;
     for(int a=100;a<1000;a++){
    	 if(a%10==6 && a%3==0){
    		 sum=sum+1;
    	 }
     }
     System.out.println("个位数为6且能被3整除的三位整数有"+sum+"个");
}
}