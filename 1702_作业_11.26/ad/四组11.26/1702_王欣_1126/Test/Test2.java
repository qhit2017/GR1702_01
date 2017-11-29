package Test;

import java.util.Scanner;

/*制作人：王欣
 *制作时间：2017年11月26日下午5:59:01
 *邮箱：2408368509@qq.com
 */

public class Test2 {
	public static void main(String[] args) {
		// 输入一个三位数，输出该数的十位是多少
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入一个三位数：");
		int i = sc.nextInt();
		int tens = i / 10 % 10;

		System.out.println("该数的十位是：" + tens);
	}

}
