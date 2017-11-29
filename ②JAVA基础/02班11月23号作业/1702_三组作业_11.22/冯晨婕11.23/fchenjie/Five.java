/**
 * 
 */
package fchenjie;

import java.util.Scanner;

/**
 * @author 作者：冯晨婕  E-mail:2570804732@qq.com
 * @date 创建时间：23 Nov 2017 8:52:53 Ekuseni
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
		// 用for 和 while两种方法计算1~100之间奇数的和
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
