import java.util.Scanner;

public class One {
	// ����һ�����֣��жϸ������������Ǹ���
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("����һ������");
		int a = sc.nextInt();
		if (a > 0) {
			System.out.println("������һ������");
		} else {
			if (a < 0) {
				System.out.println("������һ������");
			}
			sc.close();
		}

	}

}
