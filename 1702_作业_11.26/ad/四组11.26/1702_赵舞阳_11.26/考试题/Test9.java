import java.util.Scanner;

public class Test9 {
	public static void main(String[] args) {
		System.out.println("第九题:");
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入一个不大于1000的整数");
		int N = sc.nextInt();
		int sum = 0;
		for (int a = 1; a <= N; a++) {
			if (N > 1000) {
				break;
			}
			if (N % 2 != 0) {
				if (a % 2 != 0) {
					sum += a;
				}
			} else if (N % 2 == 0) {
				if (a % 2 == 0)
					sum += a;
			}
		}
		if (N <= 1000) {
			System.out.println(sum);
		} else {
			System.out.println("你瞎呀！");
		}
		sc.close();
	}
}
