package Sunday;

import java.util.Scanner;

/*制作人：王欣
 *制作时间：2017年11月19日下午3:47:41
 *邮箱：2408368509@qq.com
 */

public class er {
	public static void main(String[] args) {
		// 输入两个小数，判断两个小数的大小，并输出判断结果
		Scanner sc = new Scanner(System.in);
		double i = sc.nextDouble();
		double j = sc.nextDouble();
		if (i > j) {
			System.out.println(i + "大于" + j);
		} else if (i < j) {
			System.out.println(i + "小于" + j);
		} else {
			System.out.println(i + "=" + j);
		}

	}

}
