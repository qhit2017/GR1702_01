package Guo;

import java.util.Scanner;

public class Four {

	public static void main(String[] args) {
		// �ɼ�>=90����A��ʾ��60-89��B��ʾ��60������c��ʾ��
		Scanner sc = new Scanner(System.in);
		System.out.println("��������ķ�����");
		int score = sc.nextInt();
		System.out.println("������ķ����ǣ�" + score);
		if (score >= 90) {
			System.out.println("A");
		}
		if (score >= 60 && score < 89) {
			System.out.println("B");
		}
		if (score < 60) {
			System.out.println("c");
		}
	}
}