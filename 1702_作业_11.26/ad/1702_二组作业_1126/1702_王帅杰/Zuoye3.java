package Com.qhit;

import java.util.Scanner;

public class Zuoye3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入一个整数");
		int i = sc.nextInt();
		int a = 0;
		if (i < 0 || i > 10000) {
			System.out.println("输入错误");
		} else {
			while (i > 0) {
				i = i / 10;
				a++;
			}
			System.out.println("该数为" + a + "位数");
		}
		sc.close();

	}
}
