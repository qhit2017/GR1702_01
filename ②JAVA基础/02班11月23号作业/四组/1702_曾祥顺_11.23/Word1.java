package zengxiangshun;

import java.util.Scanner;

/**
 * @author ���� ����˳\��ͮͮ
 * @date ����ʱ�䣺2017��11��23�� ����8:14:05
 * @version 1.0
 * @parameter
 * @since
 * @return
 * @function
 */
public class Word1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("������1~7������");
		int a = sc.nextInt();
		switch (a) {
		case 1:
			System.out.println("��������1");
			break;
		case 2:
			System.out.println("��������2");
			break;
		case 3:
			System.out.println("��������3");
			break;
		case 4:
			System.out.println("��������4");
			break;
		case 5:
			System.out.println("��������5");
			break;
		case 6:
			System.out.println("��������6");
			break;
		case 7:
			System.out.println("����������");
			break;

		default:
			System.out.println("�������������");
			break;
		}
		sc.close();
	}

}
