package com.qk;

import java.util.Scanner;

/**�����ߣ�������
 *����ʱ�䣺2017��11��23������8:24:23
 *���䣺2507147605@qq.com
 */
public class Test07 {
public static void main(String[] args) {
	Scanner sc =new Scanner(System.in);
	System.out.println("������һ��������10000����");
	double n=sc.nextDouble();
	for(int a =1;a<=n;a++){
		if(a%7==0||a%10==7){
			System.out.println(a);
		}
	}
}
}
