package Test;

import java.util.Scanner;

/*制作人：王欣
 *制作时间：2017年11月26日下午6:20:04
 *邮箱：2408368509@qq.com
 */

public class Test5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入三个整数：");
		int x = sc.nextInt();
		int y = sc.nextInt();
		int z = sc.nextInt();
		int a = 0;
		if (x > y) {
			a = x;
			x = y;
			y = a;
		}  if (y > z) {
			a = y;
			y = z;
			z = a;
		}  if (x > z) {
			a = x;
			x = z;
			z = a;
		}
		System.out.println(x + "<" + y + "<" + z);
	}
}
