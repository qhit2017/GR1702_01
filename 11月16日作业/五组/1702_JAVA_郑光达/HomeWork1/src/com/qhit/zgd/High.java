/** 
 * @author  ���� E-mail:
 * @date    ����ʱ�䣺2017��11��16�� ����8:30:36 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
package com.qhit.zgd;

import java.util.Scanner;

public class High {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("���������������");
		double sn = sc.nextInt();
		System.out.println("���������");
		double hn = sc.nextInt() / 2;
		int i = 0;
		for (i = 2; i <= 10; i++) {
			sn = sn + hn * 2;
			hn = hn / 2;
		}
		System.out.println("��" + i + "�����" + "������" + sn + "��");
		System.out.println("��" + i + "�η���" + hn);

	}
}
