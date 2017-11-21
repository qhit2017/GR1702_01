package xiaxiaoyu;

public class D5 {

	public static void main(String[] args) {
		System.out.println("1000以内所有能被5和3整除的数如下表示：");

		int i = 1;
		int j = 0;

		do {
			if (i % 5 == 0 && i % 3 == 0) {
				System.out.println(i);
				j += 1;

				if (j % 6 == 0) {
					System.out.println();
				}
			}

			i++;
		} while (i <= 1000);
	}
}