package yangxueting;

public class Multiple {
	public static void main(String[] args) {
		// ��1000��������8�ı���֮��
		int sum = 0;
		for (int j = 1; j <= 1000; j++) {
			if (j % 8 == 0) {
				sum = sum + j;
			}
		}

		System.out.println("1000��������8�ı���֮���ǣ�" + sum);
	}
}
