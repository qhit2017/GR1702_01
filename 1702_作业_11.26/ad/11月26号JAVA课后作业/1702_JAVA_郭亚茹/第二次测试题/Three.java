package Guo;

import java.util.Scanner;

public class Three {

	public static void main(String[] args) {
		// ͨ������̨����һ������N(N>10000),�ж��Ǹ����Ǽ�λ��,��������.
		Scanner sc = new Scanner(System.in);
		System.out.println("�����룺");
		int a = sc.nextInt();
		if (a < 10) {
			System.out.println("һλ��");
		}
		if (a <= 10 && a > 100) {
			System.out.println("��λ��");
		}
		if (a >= 100 && a < 1000) {
			System.out.println("��λ��");
		}
		if (a >= 1000 && a < 10000) {
			System.out.println("��λ");
		} else if (a > 10000) {
			System.out.println("�Բ��𣡹���������ˡ�");
		}
			}

}
