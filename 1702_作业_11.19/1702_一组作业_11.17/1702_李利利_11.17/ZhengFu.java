import java.util.Scanner;

public class ZhengFu {
	// ��һ��
	// �ж�һ�������������Ǹ���
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("������һ������:");
		int shu = sc.nextInt();

		if (shu > 0) {
			System.out.println("������һ������");
		} else if (shu < 0) {
			System.out.println("������һ������");
		} else if (shu == 0) {
			System.out.println("�����Ȳ�������Ҳ���Ǹ���");
		}
	}
}
