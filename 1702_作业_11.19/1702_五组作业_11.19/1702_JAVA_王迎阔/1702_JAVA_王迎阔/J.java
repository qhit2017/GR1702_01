package A;

import java.util.Scanner;

/**
 * @author ���� E-mail:1456014420@qq.com
 * @date ����ʱ�䣺2017��11��18�� ����2:57:59
 * @version 1.0
 * @parameter
 * @since
 * @return
 * @function
 */
public class J {
	public static void main(String[] args) {
		System.out.println("�ھ���:");
		Scanner sc = new Scanner(System.in);
		System.out.println("������һ��������10000������:");
		long s = sc.nextLong();
		if (s > 10000) {
			System.out.println("���ֲ��ܴ���10000");
		} else {
			for (int a = 1; a < s; a++) {
				if (a % 7 == 0 || a % 10 == 7 || a / 10 % 10 == 7
						|| a / 100 == 7 || a / 1000 == 7) {
					System.out.println(a);
				}
			}

		}
		sc.close();

	}
}
