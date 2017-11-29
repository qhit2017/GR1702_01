package KaoShi;

import java.util.Scanner;

/*
日期2017年11月26日时间下午12:58:56
邮箱：2408368509@qq.com
 */
public class D04 {
public static void main(String[] args) {
	Scanner x = new Scanner(System.in);
	System.out.println("请输入一个分数");
	int a = x.nextInt();
	
	if (a>=90) {
		System.out.println("A");
	}else if (a>=60){
		System.out.println("B");
	}else{
		System.out.println("C");
	}
}
}
