package Liyongli;

import java.util.Scanner;

/** 
 * @author  ���� E-mail:������271406@163.com
 * @date    ����ʱ�䣺2017��11��19�� ����7:13:58 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */

public class Small_number {
	public static void main(String[] args) {
		//�ڶ���
		Scanner Sc =new Scanner(System.in);
		System.out.println("�������һ��С����");
		double a = Sc.nextDouble();
		System.out.println("������ڶ���С����");
		double b = Sc.nextDouble();
		if (a<b){
			System.out.println("��һ��С��С��ֵΪ��"+a);
			System.out.println("�ڶ���С����ֵΪ��"+b);
			 
		}
		if(a>b){
			System.out.println("��һ��С����ֵΪ��"+a);
			System.out.println("�ڶ���С��С��ֵΪ��"+b);
		}
	}

}
