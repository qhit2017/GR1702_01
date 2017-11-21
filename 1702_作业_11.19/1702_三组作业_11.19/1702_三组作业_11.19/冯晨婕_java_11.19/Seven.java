/**
 * 
 */
package fcj;

import java.util.Scanner;

/**
 * @author 作者：冯晨婕  E-mail:2570804732@qq.com
 * @date 创建时间：19 Nov 2017 4:37:59 Ntambama
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
public class Seven {
	// 1 2 3 4 5 任意取两个数列出他们所有组合；并输出
	public static void main(String[] args) {
		for (int a = 1; a <= 5; a++) {
			for (int b = 1; b <= 5; b++) {
				if (a != b) {
					System.out.print(a);
					System.out.println(b);
				}
			}
		}

	}

}
