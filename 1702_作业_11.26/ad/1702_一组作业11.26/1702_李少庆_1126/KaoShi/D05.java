package KaoShi;

import java.util.Scanner;

/*
����2017��11��26��ʱ������1:02:15
���䣺2408368509@qq.com
 */
public class D05 {
public static void main(String[] args) {
	Scanner x = new Scanner(System.in);
	System.out.println("��������������");
	int a = x.nextInt();
	int b = x.nextInt();
	int c = x.nextInt();
	int d = 0;
	
	if(a>b){
		d=a;
		a=b;
		b=d;
	}
	if(a>c){
		d=a;
		a=c;
		c=d;
	}
	if(b>c){
		d=b;
		b=c;
		c=d;
	}
	System.out.println(a+"<"+b+"<"+c);
}
}
