package Definition;

import java.util.Scanner;

/**
 * @author ���� E-mail:1456014420@qq.com
 * @date ����ʱ�䣺2017��11��16�� ����8:36:12
 * @version 1.0
 * @parameter
 * @since
 * @return
 * @function
 */
public class Arrange {
	public static void main(String[] args) {
		// �Ӽ�������4����������д����ʵ�ֶ���4 �������Ӵ�С��˳�����������

		Scanner sc = new Scanner(System.in);
		System.out.println("�������һ����:");
		int a = sc.nextInt();
		System.out.println("������ڶ�����:");
		int b = sc.nextInt();
		System.out.println("�������������:");
		int c = sc.nextInt();
		System.out.println("��������ĸ���:");
		int d = sc.nextInt();

		int tmp;
		if (a < b) {
			tmp = a;
			a = b;
			b = tmp;
		}
		if (a < c) {
			tmp = a;
			a = c;
			c = tmp;
		}
		if (a < d) {
			tmp = a;
			a = d;
			d = tmp;
		}
		if (b < c) {
			tmp = b;
			b = c;
			c = tmp;
		}
		if (b < d) {
			tmp = b;
			b = d;
			d = tmp;
		}
		if (c < d) {
			tmp = c;
			c = d;
			d = tmp;
		}
		System.out.println(a + " " + b + " " + c + " " + d);
	}

}
