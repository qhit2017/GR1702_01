package xiaxiaoyu;

import java.util.Scanner;

public class Test4 {
	public static void main(String[] args) {

		// �ж�һ����λ���Ƿ��ǻ�����
		Scanner sc = new Scanner(System.in);
		System.out.println("������һ����λ����");
		int a = sc.nextInt();

		if (a % 10000 == a % 10 || a / 1000 % 10 == a / 10 % 10) {
			System.out.println("�ǻ�����");
		} else {
			System.out.println("���ǻ�����");
		}
	}
}
