import java.util.Scanner;

public class Test09 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("����һ������");
		int y = sc.nextInt();

		int jh = 0;
		int oh = 0;
		if (y > 0 && y <= 1000) {
			if (y % 2 != 0) {
				for (int j = 1; j < y; j++) {
					if (j % 2 != 0) {
						jh = jh + j;

					}
				}
				System.out.println("y������ʱ����������:" + jh);
			}
			if (y % 2 == 0) {
				for (int o = 1; o < y; o++) {
					if (o % 2 == 0) {
						oh = oh + o;
					}
				}
				System.out.println("y��ż��ʱ��ż������:" + oh);
			}
		} else {
			System.out.println("������!!!!");
		}
	}

}
