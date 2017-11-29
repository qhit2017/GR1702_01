public class Test8 {

	public static void main(String[] args) {
		System.out.println("第八题:");
		for (int a = 1; a <= 10000; a++) {
			if (a % 10 == 6 && a % 3 == 0) {
				System.out.println("个位数为6且能被3整除的数:" + a);
			}
		}
	}
}
