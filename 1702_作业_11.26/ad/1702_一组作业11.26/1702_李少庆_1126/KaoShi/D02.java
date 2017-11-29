package KaoShi;

import java.util.Scanner;

/*
日期2017年11月26日时间下午12:41:26
邮箱：2408368509@qq.com
 */
public class D02 {
public static void main(String[] args) {
	Scanner x = new Scanner(System.in);
	System.out.println("输入一个三位数");
	int a = x.nextInt();

	if (a>=100&&a<1000) {
		System.out.println(a/10%10);
	}else{
		System.out.println("对不起，你输入的数无效，请重新输入");
	}

	
}
}
