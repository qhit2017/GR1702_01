package lijingjing;

import java.util.Scanner;

/**
 * @author ���� E-mail:996939518@qq.com
 * @date ����ʱ�䣺2017��11��19�� ����5:21:54
 * @version 1.0
 * @parameter
 * @since
 * @return
 * @function
 */
public class Integer {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("������һ��С��10000������");
		int n = sc.nextInt();
		int a;
		if (n <= 10000) {
			for (a = 7; a <= n; a++) {
				if (a % 7 == 0 || a % 1000 / 100 == 7 || a % 100 / 10 == 7
						|| a % 10 == 7 || a / 10 == 7) {
					System.out.println(a);
				}
			}
		}
	}

}
