package work;

public class Topic10 {

	public static void main(String[] args) {

		int a = 1;

		while (a <= 9) {
			int b = 1;

			while (b <= a) {
				System.out.print(b + "*" + a + "=" + a * b + "\t");

				b++;
			}

			a++;

			System.out.println();
		}

	}
}
