package lijingjing;

import java.util.Scanner;

/**
 * @author 作者 E-mail:996939518@qq.com
 * @date 创建时间：2017年11月19日 下午5:21:54
 * @version 1.0
 * @parameter
 * @since
 * @return
 * @function
 */
public class Integer {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("请输入一个小于10000的数：");
		int n = sc.nextInt();
		int a;
		if (n <= 10000) {
			for (a = 7; a <= n; a++) {
				if (a % 7 == 0 || a % 1000 / 100 == 7 || a % 100 / 10 == 7
						|| a % 10 == 7 || a / 10 == 7) {
					System.out.println(a);
				}
			}
		}
	}

}
