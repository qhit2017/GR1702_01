package Sunday;

import java.util.Scanner;

/*制作人：王欣
 *制作时间：2017年11月19日下午3:34:33
 *邮箱：2408368509@qq.com
 */

public class yi {
	public static void main(String[] args) {
		// 通过控制台输入一个数字，判断该数字是正数还是负数，并输出结果
		Scanner sc = new Scanner(System.in);
		int i = sc.nextInt();
		if (i < 0) {

			System.out.println("该数为负数");

		} else if (i > 0) {
			System.out.println("该数为正数");
		} else {
			System.out.println("该数为0");
		}
	}

}
