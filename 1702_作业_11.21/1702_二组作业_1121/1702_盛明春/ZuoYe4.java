package zuoye;

import java.util.Scanner;

//һ��5λ�����ж����ǲ��ǻ���������12321�ǻ�������
// ��λ����λ��ͬ��ʮλ��ǧλ��ͬ�� 
public class ZuoYe4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("������һ������");
		int a = sc.nextInt();
		if (a % 10 == a / 10000 && a / 1000 % 10 == a / 10 % 10) {
			System.out.println(a + "�ǻ�����");
		} else {
			System.out.println(a + "���ǻ�����");
		}
		sc.close();
	}
}
