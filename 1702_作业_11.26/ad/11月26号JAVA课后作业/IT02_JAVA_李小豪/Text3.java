package 李小豪;

import java.util.Scanner;

public class Text3 {
public static void main(String[] args) {
	
	Scanner sc=new Scanner(System.in);
	System.out.println("请输入一个整数N");
	int a=sc.nextInt();
	if(a<10){
	System.out.println("这个数是个位数:"+a);
}
    if((a<100)&&(a>=10)){
    System.out.println("这个数是十位数:"+a);
}
    if((a<1000)&&(a>100)){
    	System.out.println("这个百位数:"+a);
    }

}
}