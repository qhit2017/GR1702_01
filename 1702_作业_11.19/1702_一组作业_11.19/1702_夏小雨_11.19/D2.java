package xiaxiaoyu;

import java.util.Scanner;

public class D2 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("�����������ȴ�С");
		double a = sc.nextFloat();
		double b = sc.nextFloat();
		if (a > b) {
			System.out.println(a + "��" + b + "С");
		}
		if (a < b) {
			System.out.println(a + "С" + b + "��");
		}
		if (a == b) {
			System.out.println("����һ����");
		}
	}
}