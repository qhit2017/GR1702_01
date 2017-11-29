package homework;

import java.util.Scanner;

public class xiaoshu {
public static void main(String[] args) {
	Scanner sc =new Scanner(System.in);
	System.out.println("请输入一个小数");
	double s =sc.nextDouble();
	System.out.println("请输入第二个小数");
	double a =sc.nextDouble();
	if(a>s){
		System.out.println("第二个数大与第一个数");
	}else{
		System.out.println("第一个数大与第二个数");	
	}
}
}
