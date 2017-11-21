package zuoye;

import java.util.Scanner;

/**
 * @author 作者 E-mail:738348954@qq.com
 * @date 创建时间：2017年11月18日 下午12:51:24
 * @version 1.0
 * @parameter
 * @since
 * @return
 * @function
 */
public class zuoye2 {
	public static void main(String[] args) {
		System.out.println("（第二题）");
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入两个小数：");
		double a = sc.nextDouble();
		double b = sc.nextDouble();
		if (a < b) {
			boolean c = true;
			System.out.println("a<b的判断结果为：" + c);
		} else if (a > b) {
			boolean t = false;
			System.out.println("a<b的判断结果为：" + t);
		}
		sc.close();

	}
}
