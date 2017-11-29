package xiaxiaoyu;

public class D10 {
	public static void main(String[] args) {

		int a = 0;
		for (int i = 1900; i < 2017; i++) {
			if ((i % 4 == 0 && i % 100 != 0) || (i % 400 == 0)) {
				a++;
				if (a % 2 == 0) {
					System.out.println(i);
				} else {
					System.out.println(i + " ");
				}
			}
		}

	}
}
