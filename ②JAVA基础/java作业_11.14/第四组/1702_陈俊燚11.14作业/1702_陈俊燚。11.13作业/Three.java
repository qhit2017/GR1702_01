package chenjuniy;

import java.util.Scanner;

public class Three {
	public static void main(String[] args) {
		System.out.println("�����жϿ��Գɼ��ȼ���\n");
		Scanner sc = new Scanner(System.in);
		System.out.println("������һ������ʾ�ɼ�:");
		int a = sc.nextInt();
		if (a >= 90) {
			System.out.println("���ĳɼ���" + a + ",�ж�Ϊ A");
		} else if (a >= 60 & a < 90) {
			System.out.println("���ĳɼ���" + a + ",�ж�Ϊ B");
		} else if (a < 60) {
			System.out.println("���ĳɼ���" + a + ",�ж�Ϊ C");
		}
		sc.close();

	}
}
