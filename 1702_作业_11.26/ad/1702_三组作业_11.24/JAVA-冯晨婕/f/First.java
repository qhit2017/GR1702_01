package f;

import java.util.Scanner;
/**
 * @author ���ߣ��볿�  E-mail:2570804732@qq.com
 * @date ����ʱ�䣺26 Nov 2017 5:32:21 Ntambama
 * @version 1.0
 * @parameter
 * @since
 * @return
 * @function
 */
public class First {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("����������С��");
		double a = sc.nextDouble();
		double b = sc.nextDouble();
		if (a == b) {
			System.out.println("a,b����С�����");
		} else {
			System.out.println("a,b����С�������");
		}
		sc.close();
	}
}