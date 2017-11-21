public class ZhengChu {
	public static void main(String[] args) {
		// 第五题
		int q = 1;
		do {
			if (q % 3 == 0 && q % 5 == 0) {
				System.out.println("在1000内既能被3整除又能被5整除的数是:" + q);
			}
			q++;
		} while (q <= 1000);
	}
}
