package com.zk;

import java.util.Scanner;

/** 
 * @author  ���� �ں��
 * @date    ����ʱ�䣺2017��11��26�� ����3:30:02 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public class Test05 {
	
	//��дJAVA����������������x,y,z,�������������С���������
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("����������x:");
		int x = sc.nextInt();
		System.out.println("����������y:");
		int y = sc.nextInt();
		System.out.println("����������z��");
		int z = sc.nextInt();
		
		int a = 0;
		
		if(x<y){
			a=x;
            x=y;
            y=a;
		}
		if(x<z){
			a=x;
			x=z;
			z=a;
		}
		if(y<z){
			a=y;
			y=z;
			z=a;
		}
		System.out.println("x,y,z��С��������Ϊ��"+z+" "+y+" "+x);
	}

}
