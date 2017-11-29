import java.util.Scanner;

public class Nine {
	public static void main(String[] args) {
		// 第九题
		Scanner sc = new Scanner(System.in);
		System.out.println("输入一个整数是:");
		int u = sc.nextInt();

		for (u = 1; u < 10000; u++) {
			if (u % 7 == 0 || u / 1000 == 7 || u / 100 == 7 || u / 10 % 10 == 7
					|| u % 10 == 7) {
				System.out.println("输出所有7的倍数和包含7的数字的数是:" + u);
				u++;
			}
		}

	}

}
