package shape01;

import java.util.Scanner;

public class Test03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("�������������");
		int N = sc.nextInt();
		if (N > 0 && N < 10) {
			System.out.println("һλ��");
		} else if (N > 10 && N < 100) {
			System.out.println("��λ��");
		} else if (N > 100 && N < 1000) {
			System.out.println("��λ��");
		} else if (N > 1000 && N < 10000) {
			System.out.println("��λ��");
		}
		sc.close();
	}
}
