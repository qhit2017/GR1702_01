package com.qhit.Work;

/**
 * @author ���� E-mail:1603559382@qq.com
 * @date ����ʱ�䣺2017��11��18�� ����3:08:37
 * @version 1.0
 * @parameter
 * @since
 * @return
 * @function
 */
public class Quzi8 {

	public static void main(String[] args) {
		int x = 0;
		for (int a = 100; a <= 1000; a++) {
			if (a % 10 == 6 && a % 3 == 0) {
				System.out.println("��λΪ6������3������:" + a);
				x++;
			}
		}
		System.out.println("����" + x + "��");
	}
}
