import java.util.Scanner;

public class XiaoShu {
	// �ڶ���
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("�����һ��С��");
		double w = sc.nextDouble();

		System.out.println("����ڶ���С��");
		double y = sc.nextDouble();

		if (w > y) {
			System.out.println(w + ">" + y);
		} else if (w < y) {
			System.out.println(w + "<" + y);
		} else if (w == y) {
			System.out.println(w + "=" + y);
		}
	}
}
