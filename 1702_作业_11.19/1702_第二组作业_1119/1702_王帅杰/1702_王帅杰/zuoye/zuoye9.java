package zuoye;

import java.util.Scanner;

/**
 * @author ���� E-mail:738348954@qq.com
 * @date ����ʱ�䣺2017��11��18�� ����2:08:02
 * @version 1.0
 * @parameter
 * @since
 * @return
 * @function
 */
public class zuoye9 {
	public static void main(String[] args) {
		System.out.println("�ھ��⣺");
		Scanner sc = new Scanner(System.in);
		System.out.println("������һ��������10000������");
		int i = sc.nextInt();
		if (i > 10000) {
			System.out.println("���ֲ��ܴ���10000");
		} else {
			for (int l = 1; l < i; l++) {
				if (l % 7 == 0 || l % 10 == 7 || l / 10 % 10 == 7
						|| l / 100 == 7 || l / 1000 == 7) {
					System.out.println(l);
				}

			}

		}
		sc.close();
	}
}
