package KaoShi;

import java.util.Scanner;

/*
����2017��11��26��ʱ������12:41:26
���䣺2408368509@qq.com
 */
public class D02 {
public static void main(String[] args) {
	Scanner x = new Scanner(System.in);
	System.out.println("����һ����λ��");
	int a = x.nextInt();

	if (a>=100&&a<1000) {
		System.out.println(a/10%10);
	}else{
		System.out.println("�Բ��������������Ч������������");
	}

	
}
}
