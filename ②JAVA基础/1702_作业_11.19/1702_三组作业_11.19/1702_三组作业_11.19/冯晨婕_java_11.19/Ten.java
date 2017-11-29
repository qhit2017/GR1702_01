/**
 * 
 */
package fcj;

import java.util.Scanner;

/**
 * @author 作者：冯晨婕  E-mail:2570804732@qq.com
 * @date 创建时间：19 Nov 2017 5:25:07 Ntambama
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
public class Ten {
	public static void main(String[] args) {
		int i = 1;
		while (i <= 9) {
			int j = 1;
			while (j <= i) {
				System.out.print(j + "*" + i + "=" + j * i + "\t");
				j++;
			}
			System.out.println();
			i++;
		}
	}
}
