package xiaxiaoyu;

import java.util.Scanner;

public class D9 {
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		System.out.println("����һ������");
		int g = sc.nextInt();

		int sum = 0;
		int sam = 0;

		if (g > 0 && g <= 10000) {
			if (g % 2 != 0) {
				for (int h = 0; h < g; h++) {
					if (h % 2 != 0) {
						sum = sum + h;
					}
				}
				System.out.println("��������" + sum);
			}
			if (g % 2 == 0) {
				for (int i = 0; i < g; i++) {
					if (i % 2 == 0) {
						sam = sam + i;
					}
				}
				System.out.println("ż������" + sam);
			}

		} else {
			System.out.println("���ڷ�Χ��");
		}

	}
}
