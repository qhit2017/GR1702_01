public class Four {
	public static void main(String[] args) {
		// ��1000��������8�ı���֮��
		int a = 0;
		int sum = 0;
		while (a < 1000) {
			if (a % 8 == 0) {
				sum = sum + a;
			}
			a++;
		}
		System.out.println(sum);
	}
}
