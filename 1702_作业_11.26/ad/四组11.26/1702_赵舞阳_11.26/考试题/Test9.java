import java.util.Scanner;

public class Test9 {
	public static void main(String[] args) {
		System.out.println("�ھ���:");
		Scanner sc = new Scanner(System.in);
		System.out.println("������һ��������1000������");
		int N = sc.nextInt();
		int sum = 0;
		for (int a = 1; a <= N; a++) {
			if (N > 1000) {
				break;
			}
			if (N % 2 != 0) {
				if (a % 2 != 0) {
					sum += a;
				}
			} else if (N % 2 == 0) {
				if (a % 2 == 0)
					sum += a;
			}
		}
		if (N <= 1000) {
			System.out.println(sum);
		} else {
			System.out.println("��Ϲѽ��");
		}
		sc.close();
	}
}
