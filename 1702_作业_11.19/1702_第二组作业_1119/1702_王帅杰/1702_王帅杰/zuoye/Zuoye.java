package zuoye;

import java.util.Scanner;

/**
 * @author ���� E-mail:738348954@qq.com
 * @date ����ʱ�䣺2017��11��18�� ����12:40:35
 * @version 1.0
 * @parameter
 * @since
 * @return
 * @function
 */
public class Zuoye {
	public static void main(String[] args) {
		System.out.println("����һ��)");
		Scanner sc = new Scanner(System.in);
		System.out.println("������һ����");
		int a = sc.nextInt();
		if (a < 0) {
			System.out.println("����Ϊ����");
		} else if (a > 0) {
			System.out.println("����Ϊ����");
		} else {
			System.out.println("�����Ȳ��Ǹ���Ҳ��������");

		}
		sc.close();
	}
}
