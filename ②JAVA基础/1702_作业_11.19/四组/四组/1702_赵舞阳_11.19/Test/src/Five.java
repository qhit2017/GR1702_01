public class Five {
	public static void main(String[] args) {
		System.out.println("第五题:");
		int a = 1;
		do {
			if (a % 3 == 0 && a % 5 == 0) {
				System.out.println("1000以内能被3和能被5整除的数:" + a);
			}
			a++;
		} while (a <= 1000);
	}
}
