package xiaxiaoyu;

public class D4 {
	public static void main(String[] args) {

		int a = 0;
		for (int b = 0; b <= 1000; b++) {
			if (b % 8 == 0) {
				a = a + b;
			}
		}
		System.out.println(a);
	}

}