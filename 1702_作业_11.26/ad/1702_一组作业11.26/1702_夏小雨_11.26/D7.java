package xiaxiaoyu;

public class D7 {
	public static void main(String[] args) {

		int i = 0;
		while (i < 1000) {
			if (i % 5 == 0 && i % 10 != 0) {
				System.out.println(i);
			}
			i++;
		}

	}
}
