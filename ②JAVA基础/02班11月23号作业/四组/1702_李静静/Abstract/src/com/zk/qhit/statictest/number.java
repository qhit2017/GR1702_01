package com.zk.qhit.statictest;

import java.util.Scanner;


 /**
 *@author  ���� E-mail:996939518@qq.com
 * @date    ����ʱ�䣺2017��11��21�� ����11:22:50 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public class number {
//������������x,y,z���������������С���������
public static void main(String[] args) {
	Scanner sc =new Scanner(System.in);
	System.out.println("������������");
	int x =sc.nextInt();
	int y =sc.nextInt();
	int z =sc.nextInt();
	int q ;
	if (x<y) {
		q=x;
		x=y;
		y=q;
	}
	if (x<z) {
		q=x;
		x=z;
		z=q;
	}
	if (y<z) {
		q=y;
		y=z;
		z=q;
	}
	System.out.println("��С�������"+z+"<"+y+"<"+x);
	
	
	
}
}
