package xiaxiaoyu;

public class D8 {
	public static void main(String[] args) {
		// 个位数为6且能被3整除的数
		int a = 0;
		for (int b = 1; b <= 1000; b++) {

			if ((b % 10 == 6) && (b % 3 == 0)) {

				System.out.print(b + "\t");
				a += 1;

				if (a % 6 == 0) {

					System.out.println();
				}
			}
		}
	}
}