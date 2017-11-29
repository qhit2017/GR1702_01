package KaoShi;

import java.util.Scanner;

/*
日期2017年11月26日时间下午12:37:10
邮箱：2408368509@qq.com
 */
public class D01 {
public static void main(String[] args) {
	Scanner x = new Scanner(System.in);
	System.out.println("请输入两个小数");
	double a = x.nextDouble();
	double b = x.nextDouble();
	
	if(a>b){
		System.out.println(a+">"+b);
	}else if(a<b){
		System.out.println(a+"<"+b);
	}else{
		System.out.println(a+"="+b);
	}
}
}
