package com.qhit.animal;

/**
 * @author ���� E-mail:1603559382@qq.com
 * @date ����ʱ�䣺2017��11��16�� ����8:52:43
 * @version 1.0
 * @parameter
 * @since
 * @return
 * @function
 */
public class Ball {

	public static void main(String[] args) {
		// һ���100�׸߶��������£�ÿ����غ�����ԭ�߶ȵ�һ�룻
		// �����£������� ��10�����ʱ�������������ף���10�η�����ߣ�
		double a = 100;
		double b = 0;
		for (int i = 1; i <= 10; i++) {
			b = b + a;
			a = a / 2;
		}
		System.out.println("����" + b + "��");
		System.out.println("����" + a);
	}
}
