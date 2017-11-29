package Test;

import java.util.Scanner;

/*制作人：王欣
 *制作时间：2017年11月26日下午5:46:35
 *邮箱：2408368509@qq.com
 */

public class Test1 {
	public static void main(String[] args) {
		// 通过控制台输入两个小数，判断两个小数是否相等，并输出判断结果
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入两个小数");
		double i = sc.nextDouble();
		double j = sc.nextDouble();
		if (i != j) {
			System.out.println("这两个数不相等");
		} else {
			System.out.println("这两个数相等");
		}
	}

}
