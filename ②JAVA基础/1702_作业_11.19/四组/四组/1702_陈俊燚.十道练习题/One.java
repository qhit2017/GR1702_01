package chenjunyi;

import java.util.Scanner;

public class One {
	// ͨ����������һ�����֣��жϸ��������������Ǹ���������������
	public static void main(String[] args) {
		Scanner Sc = new Scanner(System.in);
		System.out.println("������һ�����֣�");
		int a = Sc.nextInt();
		if (a > 0) {
			System.out.println(a + "������");
		} else if (a < 0) {
			System.out.println(a + "�Ǹ���");
		}

	}
}
