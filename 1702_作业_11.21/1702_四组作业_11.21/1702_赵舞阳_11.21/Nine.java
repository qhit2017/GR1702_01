import java.util.Scanner;

public class Nine {
	public static void main(String[] args) {
		System.out.println("第九题:");
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入一个不大于10000的数");
		int a = sc.nextInt();
		if (a > 10000) {
			System.out.println("错误");
		} else {
			for (int b = 1; b < a; b++) {
				if (b % 7 == 0 || b % 10 == 7 || b / 10 % 10 == 7
						|| b / 100 == 7 || b / 1000 == 7) {
					System.out.println("7的倍数或包含7的数字:" + b);
				}
			}
		}
		sc.close();
	}
}
