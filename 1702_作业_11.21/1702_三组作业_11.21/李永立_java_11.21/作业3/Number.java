package com.zk.qhit.statictest;

import java.util.Scanner;

/** 
 * @author  ���� E-mail:������271406@163.com
 * @date    ����ʱ�䣺2017��11��20�� ����7:06:04 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */

public class Number {
	//������������x,y,z���������������С�������
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("����������������");
		int x =sc.nextInt();
		int y =sc.nextInt();
		int z =sc.nextInt();
		int w = 0;
		if(x<y){
			w = x;
			x = y;
			y = w;
		}
		if (x<z){
			w = z;
			z = x; 
			x = w;
		}
		if (y<z){
			w = y;
			y = z;
			z = w;
			
		}
		System.out.println("���˳��Ϊ��");
		System.out.print(z+"\t");
		System.out.print(y+"\t");
		System.out.print(x+"\t");
		
		
	}

}
