package KaoShi;

import java.util.Scanner;

/*
����2017��11��26��ʱ������12:47:28
���䣺2408368509@qq.com
 */
public class D03 {
public static void main(String[] args) {
	
	Scanner x = new Scanner(System.in);
	System.out.println("������һ��������10000������");
	int a = x.nextInt();
	if(a==10000){
		System.out.println(a+"�Ǹ���λ��");
	}
	if(a>10000){
		System.out.println("�������ֵ��Ч");
	}
	
	if(a>=1000&&a<10000){
		System.out.println(a+"�Ǹ���λ��");
	}else if(a>100&&a<1000){
		System.out.println(a+"�Ǹ���λ��");
	}else if(a>10&&a<100){
		System.out.println(a+"�Ǹ���λ��");
	}else if(a>0&&a<10){
		System.out.println(a+"�Ǹ�һλ��");
	}
	
	
}
}
