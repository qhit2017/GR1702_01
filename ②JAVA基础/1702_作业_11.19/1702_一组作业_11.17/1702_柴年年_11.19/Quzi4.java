package com.qhit.Work;

/**
 * @author ���� E-mail:1603559382@qq.com
 * @date ����ʱ�䣺2017��11��18�� ����1:26:51
 * @version 1.0
 * @parameter
 * @since
 * @return
 * @function
 */
public class Quzi4 {

	public static void main(String[] args) {
		int b = 0;
		for (int a = 1; a <= 1000; a++) {
			if (a % 8 == 0) {
				b = b + a;
			}
		}
		System.out.println("�˵ı���֮��Ϊ:" + b);
	}
}
