package work;

public class Topic7 {

	public static void main(String[] args) {

		for (int a = 1; a <= 5; a++) {
			for (int b = 1; b <= 5; b++) {
				if (a == b) {
					break;

				} else {
					System.out.print(a);

					System.out.print(b);

					System.out.println();

					System.out.print(b);

					System.out.print(a);

					System.out.println();
				}
			}

		}
	}
}