package com.zk.qhit.statistest;

import java.util.Scanner;

/**�����ߣ�������
 *����ʱ�䣺2017��11��20������7:24:22
 *���䣺2507147605@qq.com
 */
public class huiwenshu {
public static void main(String[] args) {
	//һ��5λ�����ж����ǲ��ǻ���������12321�ǻ���������λ����λ��ͬ��ʮλ��ǧλ��ͬ��
	Scanner sc=new Scanner(System.in);
	System.out.println("������һ����");
	
	int a =sc.nextInt();
	if(a%10== a/10000&&a%10000/1000==a %100/10){
		System.out.println(a+"��һ��������");
	}else{
		System.out.println(a+"����һ��������");	
	}
}
}
