package com.zk.qhit.statictest;

import java.util.Scanner;

/** 
 * @author  ���� E-mail:2379675496@qq.com
 * @date    ����ʱ�䣺2017��11��8�� ����6:44:32 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public class Rank {
	public static void main(String[] args) {
		//��������������x,y,z���������������С�������.
		System.out.println("������");
		Scanner sc=new Scanner(System.in);
		System.out.println("���������������������Ƿֱ��ǣ�");
		int x=sc.nextInt();
		int y=sc.nextInt();
		int z=sc.nextInt();
		int a;
		if(x>y){
			a=x;
			x=y;
			y=a;
	}
		if(x>z){
			a=x;
			x=z;
			z=a;
		}
		if(y>z){
			a=y;
			y=z;
			z=a;
		}
		System.out.println(x+"\t"+y+"\t"+z);
	}
	
				
		
	}

