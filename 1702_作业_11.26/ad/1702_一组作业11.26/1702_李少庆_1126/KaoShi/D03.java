package KaoShi;

import java.util.Scanner;

/*
日期2017年11月26日时间下午12:47:28
邮箱：2408368509@qq.com
 */
public class D03 {
public static void main(String[] args) {
	
	Scanner x = new Scanner(System.in);
	System.out.println("请输入一个不大于10000的整数");
	int a = x.nextInt();
	if(a==10000){
		System.out.println(a+"是个五位数");
	}
	if(a>10000){
		System.out.println("你输入的值无效");
	}
	
	if(a>=1000&&a<10000){
		System.out.println(a+"是个四位数");
	}else if(a>100&&a<1000){
		System.out.println(a+"是个三位数");
	}else if(a>10&&a<100){
		System.out.println(a+"是个两位数");
	}else if(a>0&&a<10){
		System.out.println(a+"是个一位数");
	}
	
	
}
}
