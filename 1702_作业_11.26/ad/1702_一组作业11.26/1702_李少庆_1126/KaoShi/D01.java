package KaoShi;

import java.util.Scanner;

/*
����2017��11��26��ʱ������12:37:10
���䣺2408368509@qq.com
 */
public class D01 {
public static void main(String[] args) {
	Scanner x = new Scanner(System.in);
	System.out.println("����������С��");
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
