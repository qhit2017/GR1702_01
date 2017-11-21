package zuoye;

import java.util.Scanner;

/**
 * @author 作者 E-mail:738348954@qq.com
 * @date 创建时间：2017年11月18日 下午12:40:35
 * @version 1.0
 * @parameter
 * @since
 * @return
 * @function
 */
public class Zuoye {
	public static void main(String[] args) {
		System.out.println("（第一题)");
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入一个数");
		int a = sc.nextInt();
		if (a < 0) {
			System.out.println("该数为负数");
		} else if (a > 0) {
			System.out.println("该数为正数");
		} else {
			System.out.println("该数既不是负数也不是正数");

		}
		sc.close();
	}
}
