package lishaoqing345;

public class D4 {
	public static void main(String[] args) {
		// 一个数如果恰好等于它的因子之和，这个数就称为 "完数 "。例如6=1＋2＋3.编程找出1000以内的所有完数。

		for (int a = 1; a <= 1000; a++) {
			int c = 0;
			for (int b = 1; b < a; b++) {
				if (a % b == 0) {
					c =c + b;
				}
			}
			if (c == a) {
				System.out.println(a);
			}
		}
	}
}
