import java.util.Scanner;

public class Nine {
	public static void main(String[] args) {
		System.out.println("�ھ���:");
		Scanner sc = new Scanner(System.in);
		System.out.println("������һ��������10000����");
		int a = sc.nextInt();
		if (a > 10000) {
			System.out.println("����");
		} else {
			for (int b = 1; b < a; b++) {
				if (b % 7 == 0 || b % 10 == 7 || b / 10 % 10 == 7
						|| b / 100 == 7 || b / 1000 == 7) {
					System.out.println("7�ı��������7������:" + b);
				}
			}
		}
		sc.close();
	}
}
