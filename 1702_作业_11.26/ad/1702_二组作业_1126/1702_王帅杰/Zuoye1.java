package Com.qhit;

import java.util.Scanner;

public class Zuoye1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("����������С��");
		double a = sc.nextDouble();
		double b = sc.nextDouble();
		if (a == b) {
			System.out.println("��С�����");
		} else if (a != b) {
			System.out.println("��С�������");
		}

		sc.close();

	}
}
