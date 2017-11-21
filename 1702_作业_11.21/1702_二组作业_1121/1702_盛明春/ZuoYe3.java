package zuoye;

import java.util.Scanner;

//输入三个整数x,y,z，请把这三个数由小到大输出。
public class ZuoYe3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入第一个数字");
		int x = sc.nextInt();
		System.out.println("请输入第二个数字");
		int y = sc.nextInt();
		System.out.println("请输入第三个数字");
		int z = sc.nextInt();
		int a = 0;
		if (x > y) {
			a = x;
			x = y;
			y = a;
		}
		if (x > z) {
			a = x;
			x = z;
			z = a;
		}
		if (y > z) {
			a = y;
			y = z;
			z = a;
		}
		System.out.println("从小到大的排序是：" + x + "\t" + y + "\t" + z);
		sc.close();
	}
	

}
