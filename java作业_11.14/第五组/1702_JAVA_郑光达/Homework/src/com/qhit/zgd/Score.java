/** 
 * @author  ���� E-mail:
 * @date    ����ʱ�䣺2017��11��13�� ����8:51:17 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
package com.qhit.zgd;

import java.util.Scanner;

public class Score {

	public static void main(String[] args) {

		/*
		 * ������Ԫ�����������Ƕ�׻�ѡ��ṹ����ɴ��⣺ ѧϰ�ɼ�>=90�ֵ�ͬѧ��A��ʾ. 60-89��֮�����B��ʾ. 60�����µ���C��ʾ��
		 * ���������(a>b)?a:b��������������Ļ������ӡ�
		 */
		  Scanner sc = new Scanner(System.in);
		   
			System.out.println("������ѧ���ɼ�:");
			
			int a =sc.nextInt();
			
			if(a>=90){
				System.out.println("��ͬѧ�ȼ�ΪA");
			}
			if((a>=60) && (a<=89)){
				System.out.println("��ͬѧ�ȼ�ΪB");
			}
			if(a<60){
				System.out.println("��ͬѧ�ȼ�ΪC");
			}
			sc.close();
			
			
		}
		   
		

}
