public class Divisor {
	public static void main(String[] args) {
		// ����ҳ�1000���ڵ���������

		for (int p = 1; p <= 1000; p++) {
			int d = 0;
			for (int q = 1; q < p; q++) {
				if (p % q == 0) {
					d = d + q;
				}
			}
			if (p == d) {
				System.out.println("0~1000��������:" + d);
			}
		}
	}
}
