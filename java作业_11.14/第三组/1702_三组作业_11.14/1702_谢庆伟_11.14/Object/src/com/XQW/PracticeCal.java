package com.XQW;

import java.util.Scanner;

/** 
 * @author  ���� E-mail:757086146@qq.com
 * @date    ����ʱ�䣺2017��11��13�� ����9:31:03 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public class PracticeCal {

	public static void main(String[] args) {
		System.out.println("�ġ��ҡ���������\n");
		Scanner sc = new Scanner(System.in);
		System.out.println("��������С��Χ��");
		int a = sc.nextInt();
		System.out.println("���������Χ��");
		int b = sc.nextInt();
		System.out.println(a + "~" + b + "֮��������У�\n");
		int n = 0;
		for (int i = a; i <= b; i++) {
			int sum=0;
			for (int j=1 ; j < i; j++) {
				if (i % j == 0) {
					sum=sum+j;
				}
			}
			if(sum==i){
				System.out.print(i+"    ");
				n = n + 1;
			}
			if (n >= 15) {
				n = 0;
				System.out.println("\n");
			}
		}
		sc.close();

	}

}
