package zuoye;

import java.util.Scanner;

/**
 * @author 作者 E-mail:738348954@qq.com
 * @date 创建时间：2017年11月18日 下午2:08:02
 * @version 1.0
 * @parameter
 * @since
 * @return
 * @function
 */
public class zuoye9 {
	public static void main(String[] args) {
		System.out.println("第九题：");
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入一个不大于10000的数字");
		int i = sc.nextInt();
		if (i > 10000) {
			System.out.println("数字不能大于10000");
		} else {
			for (int l = 1; l < i; l++) {
				if (l % 7 == 0 || l % 10 == 7 || l / 10 % 10 == 7
						|| l / 100 == 7 || l / 1000 == 7) {
					System.out.println(l);
				}

			}

		}
		sc.close();
	}
}
