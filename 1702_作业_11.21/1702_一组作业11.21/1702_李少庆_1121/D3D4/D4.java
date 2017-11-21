package D3D4;

import java.util.Scanner;

public class D4 {
public static void main(String[] args) {
	Scanner q=new Scanner(System.in);
	System.out.println("请输入一个五位数");
	int a=q.nextInt();
	
	if (a/10000==a%10&&a/1000%10==a/10%10) {
		System.out.println(a+"为回文数");
	}else{
		System.out.println(a+"不是回文数");
	}
	
}
}
