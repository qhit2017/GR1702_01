package Guo;

import java.util.Scanner;

public class Five {
	public static void main(String[] args) {
		// 输入三个整数，X Y Z 请把这三个数由大到小排列。
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入你的数字：");
		int x = sc.nextInt();
		int y = sc.nextInt();
		int z = sc.nextInt();
		int e;
		if (x<y) {
			e = x;
			x = y;
			y = e;

		}
		if (x< z) {
			e = x;
			x = z;
			z = e;

		}
		if (y < z) {
			e = y;
			y = z;
		}
		System.out.println(x + ">" + y + ">" + z);
		sc.close();
		
	}
}