package Guo;

import java.util.Scanner;

public class Nine {
	public static void main(String[] args) {
		// ����һ������N(0<N<=1000),��NΪ����ʱ�����1��N֮��������ͣ�
		// ��NΪż��ʱ�����1��N֮���ż���͡�
		Scanner sc = new Scanner(System.in);
		System.out.println("����һ��������1000��������");
		int N = sc.nextInt();
		int sum = 0;
		if (N % 2 == 0) {
			for (int i = 1; i <= N; i++) {
				if (i % 2 == 0) {
					sum = sum + i;
				}

			}

		} else {
			for (int i = 1; i <= N; i++) {
				if (i % 2 != 0) {
					sum = sum + i;
				}
			}
		}
		System.out.println(sum);
		
	}
}
