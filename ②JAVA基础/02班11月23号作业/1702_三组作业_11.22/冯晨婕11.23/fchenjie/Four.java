/**
 * 
 */
package fchenjie;

import java.util.Scanner;

/**
 * @author ���ߣ��볿�  E-mail:2570804732@qq.com
 * @date ����ʱ�䣺23 Nov 2017 8:27:00 Ekuseni
 * @version 1.0
 * @parameter
 * @since
 * @return
 * @function
 */
/**
 * @author Administrator
 *
 */
public class Four {
	public static void main(String[] args) {
		/*
		 * 4 �Ӽ�������1~7�����֣����������1�����������һ�� ���������2����������ڶ�....
		 * ....���������7,�����������(��switch)
		 */

		 Scanner sc =new Scanner(System.in);
		 System.out.println("������1~7����");
		 int day =sc.nextInt();
		switch (day) {
		case 1:
			System.out.println("��������һ");
			break;
		case 2:
			System.out.println("�������ڶ�");
			break;
		case 3:
			System.out.println("����������");
			break;
		case 4:
			System.out.println("����������");
			break;
		case 5:
			System.out.println("����������");
			break;
		case 6:
			System.out.println("����������");
			break;
		case 7:
			System.out.println("����������");
			break;
		default:
			System.out.println("������� ");
			break;

		}
	}
}
