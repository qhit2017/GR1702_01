package com.XQW;

import java.util.Scanner;

/** 
 * @author  ���� E-mail:757086146@qq.com
 * @date    ����ʱ�䣺2017��11��13�� ����9:20:53 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public class PracticeIf {

	public static void main(String[] args) {
		System.out.println("�����жϿ��Գɼ��ȼ���\n");
		Scanner sc=new Scanner(System.in);
		System.out.println("������һ������ʾ�ɼ�:");
		int a=sc.nextInt();
		if(a>150){
			System.out.println("�����ǲ��Ե�Ӵ~");
		}else if(a>=90){
			System.out.println("���ĳɼ���"+a+",�ж�Ϊ A");
		}else if(a>=60&a<90){
			System.out.println("���ĳɼ���"+a+",�ж�Ϊ B");
		}else if(a<60){
			System.out.println("���ĳɼ���"+a+",�ж�Ϊ C");
		}
		sc.close();
		

	}

}
