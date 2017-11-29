package shape01;

import java.util.Scanner;

public class Test03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入你的数字");
		int N = sc.nextInt();
		if (N > 0 && N < 10) {
			System.out.println("一位数");
		} else if (N > 10 && N < 100) {
			System.out.println("二位数");
		} else if (N > 100 && N < 1000) {
			System.out.println("三位数");
		} else if (N > 1000 && N < 10000) {
			System.out.println("四位数");
		}
		sc.close();
	}
}
