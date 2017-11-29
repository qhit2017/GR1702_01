package Definition;

import java.util.Scanner;

/**
 * @author 作者 E-mail:1456014420@qq.com
 * @date 创建时间：2017年11月16日 下午8:36:12
 * @version 1.0
 * @parameter
 * @since
 * @return
 * @function
 */
public class Arrange {
	public static void main(String[] args) {
		// 从键盘输入4个整数，编写程序实现对这4 个整数从大到小的顺序排列输出。

		Scanner sc = new Scanner(System.in);
		System.out.println("请输入第一个数:");
		int a = sc.nextInt();
		System.out.println("请输入第二个数:");
		int b = sc.nextInt();
		System.out.println("请输入第三个数:");
		int c = sc.nextInt();
		System.out.println("请输入第四个数:");
		int d = sc.nextInt();

		int tmp;
		if (a < b) {
			tmp = a;
			a = b;
			b = tmp;
		}
		if (a < c) {
			tmp = a;
			a = c;
			c = tmp;
		}
		if (a < d) {
			tmp = a;
			a = d;
			d = tmp;
		}
		if (b < c) {
			tmp = b;
			b = c;
			c = tmp;
		}
		if (b < d) {
			tmp = b;
			b = d;
			d = tmp;
		}
		if (c < d) {
			tmp = c;
			c = d;
			d = tmp;
		}
		System.out.println(a + " " + b + " " + c + " " + d);
	}

}
