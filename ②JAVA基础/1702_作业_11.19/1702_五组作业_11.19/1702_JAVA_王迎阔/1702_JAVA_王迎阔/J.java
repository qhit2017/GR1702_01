package A;

import java.util.Scanner;

/**
 * @author 作者 E-mail:1456014420@qq.com
 * @date 创建时间：2017年11月18日 下午2:57:59
 * @version 1.0
 * @parameter
 * @since
 * @return
 * @function
 */
public class J {
	public static void main(String[] args) {
		System.out.println("第九题:");
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入一个不大于10000的数字:");
		long s = sc.nextLong();
		if (s > 10000) {
			System.out.println("数字不能大于10000");
		} else {
			for (int a = 1; a < s; a++) {
				if (a % 7 == 0 || a % 10 == 7 || a / 10 % 10 == 7
						|| a / 100 == 7 || a / 1000 == 7) {
					System.out.println(a);
				}
			}

		}
		sc.close();

	}
}
