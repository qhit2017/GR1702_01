package f;

import java.util.Scanner;
/**
 * @author 作者：冯晨婕  E-mail:2570804732@qq.com
 * @date 创建时间：26 Nov 2017 5:32:21 Ntambama
 * @version 1.0
 * @parameter
 * @since
 * @return
 * @function
 */
public class First {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入两个小数");
		double a = sc.nextDouble();
		double b = sc.nextDouble();
		if (a == b) {
			System.out.println("a,b两个小数相等");
		} else {
			System.out.println("a,b两个小数不相等");
		}
		sc.close();
	}
}