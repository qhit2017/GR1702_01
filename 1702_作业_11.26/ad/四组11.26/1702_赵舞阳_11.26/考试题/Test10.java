public class Test10 {
	public static void main(String[] args) {
		System.out.println("第十题:");
		for (int a = 1900; a <= 2017; a++) {
			if ((a % 4 == 0 && a % 100 != 0) || a % 400 == 0) {
				System.out.println("1900到2017间的闰年:" + a);
			}
		}
	}
}
