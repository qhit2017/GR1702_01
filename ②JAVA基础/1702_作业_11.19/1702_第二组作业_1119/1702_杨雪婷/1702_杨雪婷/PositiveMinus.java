package yangxueting;

import java.util.Scanner;

public class PositiveMinus {
	public static void main(String[] args) {
		//��һ��
		Scanner sc = new Scanner(System.in);
		System.out.println("��������ֵ��");
		int h = sc.nextInt();
		System.out.println("��������ǣ�" + h);
		if (h > 0) {
			System.out.println("�������������");
		}
		if (h < 0) {
			System.out.println("��������Ǹ���");
		}
		if (h == 0) {
			System.out.println("�����Ǹ�����");
		}
		sc.close();
	}
}
