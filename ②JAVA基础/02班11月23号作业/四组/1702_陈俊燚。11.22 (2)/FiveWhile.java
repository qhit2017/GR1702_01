public class FiveWhile {
	// while��������1~100֮�������ĺ�
	public static void main(String[] args) {
		int sum = 0;
		int a = 1;
		while (a <= 100) {
			if (a % 2 != 0) {
				sum += a;
			}
			a++;
		}
		System.out.println(sum);
	}
}
