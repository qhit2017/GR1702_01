package liuyuheng;

public class Test06 {
	public static void main(String[] args) {

		int sum = 0;

		for (int a = 1; a <= 10; a++) {
			sum += a;

			if (sum > 20) {

				System.out.println(a);
				break;

			}
		}
	}

}
