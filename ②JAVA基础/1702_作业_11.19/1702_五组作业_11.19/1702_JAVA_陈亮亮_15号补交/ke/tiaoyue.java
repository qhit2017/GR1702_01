package com.qi.ke;

import java.util.Scanner;

/**�����ߣ�������
 *����ʱ�䣺2017��11��17������8:01:31
 *���䣺2507147605@qq.com
 */
public class tiaoyue {
public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
	System.out.println("����������ף�");
	double a = sc.nextDouble();
	System.out.println("�����������");
	double b = sc.nextDouble()/2;
	int i = 0;
	for(i = 2;i<=10;i++){
	a= a+b*2;
	b=b/2;
	}
	System.out.println(i+"��"+"������"+a+"��");
	System.out.println(i+"�η���"+b+"��");
	
}
}
