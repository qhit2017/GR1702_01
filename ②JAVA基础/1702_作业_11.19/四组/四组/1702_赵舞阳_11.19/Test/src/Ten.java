public class Ten {
	public static void main(String[] args) {
		System.out.println("第十题:\n九九乘法表");
		int a = 1;
		while (a <= 9) {
			int b = 1;
			while (b <= a) {
				System.out.print(b + "*" + a + "=" + a * b + "\t");
				b++;
			}
			System.out.println();
			a++;
		}
	}
}
