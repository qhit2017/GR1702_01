public class Sum {
	public static void main(String[] args) {
		// ������
		int l = 1;
		int sum = 0;

		while (l <= 1000) {
			if (l % 8 == 0) {
				sum = sum + l;
			}
			l++;
		}
		System.out.println("1000����������8�ı����ĺ���:" + sum);
	}
}
