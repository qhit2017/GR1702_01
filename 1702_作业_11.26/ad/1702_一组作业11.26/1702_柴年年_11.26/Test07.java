package com.qhit;

/**
 * @author ���� E-mail:1603559382@qq.com
 * @date ����ʱ�䣺2017��11��23�� ����7:46:22
 * @version 1.0
 * @parameter
 * @since
 * @return
 * @function
 */
public class Test07 {

	public static void main(String[] args) {
		int a = 1;
		while (a <= 1000) {
			if (a % 5 == 0 && a % 10 != 0) {
				System.out.println(a);				
			}
			a++;
		}
	}
}
