package Sunday;

import java.util.Scanner;

/*�����ˣ�����
 *����ʱ�䣺2017��11��19������3:47:41
 *���䣺2408368509@qq.com
 */

public class er {
	public static void main(String[] args) {
		// ��������С�����ж�����С���Ĵ�С��������жϽ��
		Scanner sc = new Scanner(System.in);
		double i = sc.nextDouble();
		double j = sc.nextDouble();
		if (i > j) {
			System.out.println(i + "����" + j);
		} else if (i < j) {
			System.out.println(i + "С��" + j);
		} else {
			System.out.println(i + "=" + j);
		}

	}

}
