package Test;

import java.util.Scanner;

/*�����ˣ�����
 *����ʱ�䣺2017��11��26������6:20:04
 *���䣺2408368509@qq.com
 */

public class Test5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("����������������");
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
