/**
 * 
 */
package fchenjie;

import java.util.Scanner;

/**
 * @author ���ߣ��볿�  E-mail:2570804732@qq.com
 * @date ����ʱ�䣺23 Nov 2017 8:52:53 Ekuseni
 * @version 1.0
 * @parameter
 * @since
 * @return
 * @function
 */
/**
 * @author Administrator
 *
 */
public class Five {
	public static void main(String[] args) {
		// ��for �� while���ַ�������1~100֮�������ĺ�
		int sum = 0;
		for (int a = 1; a <= 100; a++) {
			if (a % 2 != 0) {
				sum += a;
			}
		}
		System.out.println(sum);
		//while
		int s = 0;
		int b = 1;
		while (b <= 100) {
			if (b % 2 != 0) {
				s += b;
			}
			b++;
		}System.out.println(s);
		

	}
}
