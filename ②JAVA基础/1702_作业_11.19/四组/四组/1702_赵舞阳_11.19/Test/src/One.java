import java.util.Scanner;

public class One {
	public static void main(String[] args) {
		System.out.println("��һ��:\n������һ����");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		if (a > 0) {
			System.out.println("����������");
		} else {
			System.out.println("�����Ǹ���");
		}
		sc.close();
	}
}
