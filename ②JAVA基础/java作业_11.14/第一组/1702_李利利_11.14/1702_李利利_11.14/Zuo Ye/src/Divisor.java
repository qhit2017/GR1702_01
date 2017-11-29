public class Divisor {
	public static void main(String[] args) {
		// 编程找出1000以内的所有完数

		for (int p = 1; p <= 1000; p++) {
			int d = 0;
			for (int q = 1; q < p; q++) {
				if (p % q == 0) {
					d = d + q;
				}
			}
			if (p == d) {
				System.out.println("0~1000的完数是:" + d);
			}
		}
	}
}
