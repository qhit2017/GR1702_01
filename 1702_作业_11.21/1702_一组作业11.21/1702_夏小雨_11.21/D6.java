package xiaxiaoyu;

public class D6 {
	public static void main(String[] args) {
		int a = 0;
		for (int b = 1; b <= 10; b++) {
			a = a + b;
			if (a > 20) {
				System.out.println(a);
				break;
			}
		}
	}
}
