import java.util.Scanner;

public class Nine {
	public static void main(String[] args) {
		// �ھ���
		Scanner sc = new Scanner(System.in);
		System.out.println("����һ��������:");
		int u = sc.nextInt();

		for (u = 1; u < 10000; u++) {
			if (u % 7 == 0 || u / 1000 == 7 || u / 100 == 7 || u / 10 % 10 == 7
					|| u % 10 == 7) {
				System.out.println("�������7�ı����Ͱ���7�����ֵ�����:" + u);
				u++;
			}
		}

	}

}
