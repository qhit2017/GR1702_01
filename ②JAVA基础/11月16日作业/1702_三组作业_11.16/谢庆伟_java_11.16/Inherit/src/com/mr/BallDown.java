package com.mr;

import java.util.Scanner;

/** 
 * @author  ���� E-mail:757086146@qq.com
 * @date    ����ʱ�䣺2017��11��15�� ����9:34:49 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public class BallDown {

	public static void main(String[] args) {
		System.out.println("�塢һ���h�׸߶��������£�ÿ����غ�����ԭ�߶ȵ�һ�룻\n"
				+ "�����£������� ��n�����ʱ�������������ף���n�η�����ߣ�\n");
		Scanner sc=new Scanner(System.in);
		System.out.println("������h��ֵ����������Χ��");
		int h=sc.nextInt();
		System.out.println("������n��ֵ����������Χ��");
		int n=sc.nextInt();
		double len=h;
		double hei=h/2;
		int i=2;
		while(i<=n&&n>1){
			len=len+hei*2;
			hei=hei/2;
			i++;
		}
		System.out.println("�����"+h+"�����£�\n"
				+ "��"+n+"�����ʱ��������"+len+"�ף�\n"
				+ "��"+n+"�η����߶�Ϊ"+hei+"�ס�");
		sc.close();

	}

}
