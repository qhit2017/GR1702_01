public class Test5 {

	public static void main(String[] args) {
		// ����һ
		int sum = 0;
		for (int x = 1; x <= 100; x++) {

			if (x % 2 != 0) {
				sum = sum + x;

			}
		}
		System.out.println("��������:" + sum);

		// ������
		int s = 0;
		int f = 1;
		while (f <= 100) {
			if (f % 2 != 0) {
				s = s + f;
			}
			f++;
		}
		System.out.println("��������:" + sum);
	}

}
