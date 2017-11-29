package kk;

public class Test08 {
	public static void main(String[] args) {
		int a = 0;

		for (int s = 100; s < 1000; s++) {

			if (s % 10 == 6 && s % 3 == 0) {
				System.out.println(s);

				a++;
			}

		}
		System.out.println("¹²ÓÐ" + a + "¸ö");
	}

}
