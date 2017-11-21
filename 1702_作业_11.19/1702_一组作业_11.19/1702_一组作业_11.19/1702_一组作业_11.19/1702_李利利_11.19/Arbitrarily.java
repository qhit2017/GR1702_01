public class Arbitrarily {
	public static void main(String[] args) {
		// 第七题
		for (int t = 1; t <= 5; t++) {
			for (int x = 1; x <= 5; x++) {
				if (t != x) {
					System.out.println("列出所有组合是:" + t + "和" + x);
				}
			}
		}
	}
}
