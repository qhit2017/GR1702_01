package Test;

import java.util.Scanner;

/*�����ˣ�����
 *����ʱ�䣺2017��11��26������5:59:01
 *���䣺2408368509@qq.com
 */

public class Test2 {
	public static void main(String[] args) {
		// ����һ����λ�������������ʮλ�Ƕ���
		Scanner sc = new Scanner(System.in);
		System.out.println("������һ����λ����");
		int i = sc.nextInt();
		int tens = i / 10 % 10;

		System.out.println("������ʮλ�ǣ�" + tens);
	}

}
