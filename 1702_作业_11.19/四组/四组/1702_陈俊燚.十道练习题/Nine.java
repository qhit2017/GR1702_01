import java.util.Scanner;

public class Nine {
	public static void main(String[] args) {
		System.out.println("第九题");
		// 通过控制台输入一个整数N(N小于等于10000)，输出所有
		// 7的倍数
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入一个整数");
		int N = sc.nextInt();
		if (N <= 10000) {
			for (int f = 1; f < N; f++) {
				if (f % 7 == 0 || f % 100 == 7 || f / 10 % 10 == 7
						|| f % 10 == 70 || f % 1000 == 7) {
					System.out.println(f);
				}
			}
		}
		sc.close();
	}
}