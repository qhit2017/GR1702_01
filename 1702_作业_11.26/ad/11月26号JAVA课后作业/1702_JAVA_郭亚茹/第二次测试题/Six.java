package Guo;

public class Six {
	public static void main(String[] args) {
		// ��1000����8�ı��������ֹ��ж��ٸ��������
		int sum = 0;
		for (int i = 8; i < 1000; i++) {
			if (i % 8 == 0) {
				sum++;

			}
		}
		System.out.println(sum);
	}

}
