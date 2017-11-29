import java.util.Scanner;

public class Test09 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("输入一个整数");
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
				System.out.println("y是奇数时，奇数和是:" + jh);
			}
			if (y % 2 == 0) {
				for (int o = 1; o < y; o++) {
					if (o % 2 == 0) {
						oh = oh + o;
					}
				}
				System.out.println("y是偶数时，偶数和是:" + oh);
			}
		} else {
			System.out.println("错误了!!!!");
		}
	}

}
