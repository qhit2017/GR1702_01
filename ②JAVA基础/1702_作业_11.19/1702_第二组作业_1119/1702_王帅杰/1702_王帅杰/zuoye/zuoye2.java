package zuoye;

import java.util.Scanner;

/**
 * @author ���� E-mail:738348954@qq.com
 * @date ����ʱ�䣺2017��11��18�� ����12:51:24
 * @version 1.0
 * @parameter
 * @since
 * @return
 * @function
 */
public class zuoye2 {
	public static void main(String[] args) {
		System.out.println("���ڶ��⣩");
		Scanner sc = new Scanner(System.in);
		System.out.println("����������С����");
		double a = sc.nextDouble();
		double b = sc.nextDouble();
		if (a < b) {
			boolean c = true;
			System.out.println("a<b���жϽ��Ϊ��" + c);
		} else if (a > b) {
			boolean t = false;
			System.out.println("a<b���жϽ��Ϊ��" + t);
		}
		sc.close();

	}
}
