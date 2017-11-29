public class Test7 {

	public static void main(String[] args) {
		System.out.println("第七题:");
		for (int a = 1; a <= 1000; a++) {
			if (a % 5 == 0 && a % 10 != 0) {
				System.out.println("能被5整除同时不能被10整除的数:" + a);
			}
		}
	}
}
