import java.util.Scanner;

public class Nine {
	public static void main(String[] args) {
		System.out.println("�ھ���");
		// ͨ������̨����һ������N(NС�ڵ���10000)���������
		// 7�ı���
		Scanner sc = new Scanner(System.in);
		System.out.println("������һ������");
		int N = sc.nextInt();
		if (N <= 10000) {
			for (int f = 1; f < N; f++) {
				if (f % 7 == 0 || f % 100 == 7 || f / 10 % 10 == 7
						|| f % 10 == 70 || f % 1000 == 7) {
					System.out.println(f);
				}
			}
		}
		sc.close();
	}
}