package Guo;

import java.util.Scanner;

public class Three {

	public static void main(String[] args) {
		// 通过控制台输入一个整数N(N>10000),判断是改数是几位数,并输出结果.
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入：");
		int a = sc.nextInt();
		if (a < 10) {
			System.out.println("一位数");
		}
		if (a <= 10 && a > 100) {
			System.out.println("两位数");
		}
		if (a >= 100 && a < 1000) {
			System.out.println("三位数");
		}
		if (a >= 1000 && a < 10000) {
			System.out.println("四位");
		} else if (a > 10000) {
			System.out.println("对不起！哈！你输错了。");
		}
			}

}
