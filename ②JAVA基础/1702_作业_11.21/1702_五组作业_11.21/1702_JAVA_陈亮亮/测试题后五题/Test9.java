package com.qk;

import java.util.Scanner;

/**�����ߣ�������
 *����ʱ�䣺2017��11��21������8:03:26
 *���䣺2507147605@qq.com
 */
public class Test9 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("������һ������:");
	double N=sc.nextDouble();
	for(int n=1;n<=1000;n++){
		if(n%7==0||n%10==7){
			System.out.println(n);
		}
	}
}
}
