package xiaxiaoyu;

public class D3 {
	public static void main(String[] args) {

		int a = 0;
		for (int b = 1; b <= 1000; b++) {
			if (b % 2 != 0) {
				System.out.println(b);
				a = a + 1;
				if (a % 5 == 0) {
					System.out.println();
				}
			}
		}
	}
}
