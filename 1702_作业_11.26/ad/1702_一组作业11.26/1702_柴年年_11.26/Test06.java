package com.qhit;

/**
 * @author ���� E-mail:1603559382@qq.com
 * @date ����ʱ�䣺2017��11��23�� ����7:41:05
 * @version 1.0
 * @parameter
 * @since
 * @return
 * @function
 */
public class Test06 {

	public static void main(String[] args) {
		int sum = 0;
		for (int a = 8; a <= 1000; a++) {
			if (a % 8 == 0) {
				sum++;
			}
		}
		System.out.println("�˵ı�����"+sum+"��");
	}
}
