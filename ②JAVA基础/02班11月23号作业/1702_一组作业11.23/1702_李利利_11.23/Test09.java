import java.util.Scanner;

public class Test09 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("����һ������������10000");
		int n = sc.nextInt();
		for (int a = 1; a < n; a++) {
			if ((a % 7 == 0) || (a / 1000 == 7) || (a / 100 == 7)
					|| (a / 10 % 10 == 7) || (a % 10 == 7)) {
				System.out.println("��7�ı����Ͱ���7�����ֵ�����:" + a);

			}

		}
	}
}
