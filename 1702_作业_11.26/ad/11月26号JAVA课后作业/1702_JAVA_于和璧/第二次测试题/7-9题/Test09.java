package com.zk;

import java.util.Scanner;

/**
 * @author ���� �ں��
 * @date ����ʱ�䣺2017��11��26�� ����6:59:39
 * @version 1.0
 * @parameter
 * @since
 * @return
 * @function
 */
public class Test09 {

	// ��дJAVA��������һ������N(0<N<=1000)����NΪ����ʱ�����1��N֮��������ͣ�
	// ��NΪż��ʱ�����1��N֮���ż���͡�

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("������һ������N(0<N<=1000)��");
		int N = sc.nextInt();
		int sum = 0;

		int a = 1;
		int b = 1;

		if (N % 2 != 0) {

			while (a <= N) {
				if (a % 2 != 0) {

					sum = sum + a;

				}
				a++;
			}

			System.out.println("1��N֮���������Ϊ:" + sum);
		}

		if (N % 2 == 0) {
			while (b <= N) {
				if (b % 2 == 0) {
					sum = sum + b;

				}
				b++;
			}

			System.out.println("1��N֮���ż����Ϊ��" + sum);

		}

		sc.close();
	}

}
