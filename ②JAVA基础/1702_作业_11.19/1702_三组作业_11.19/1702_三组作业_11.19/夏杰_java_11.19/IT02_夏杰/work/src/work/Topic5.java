package work;

public class Topic5 {

	public static void main(String[] args) {

		int a = 0;

		do {
			if (a % 3 == 0 && a % 5 == 0) {
				System.out.println(a);
			}

			a++;
		} while (a < 1000);
	}

}
