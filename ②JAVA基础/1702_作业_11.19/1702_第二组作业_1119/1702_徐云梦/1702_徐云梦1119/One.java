import java.util.Scanner;

public class One {
	// 输入一个数字，判断该数是正数还是负数
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("输入一个数字");
		int a = sc.nextInt();
		if (a > 0) {
			System.out.println("该数是一个正数");
		} else {
			if (a < 0) {
				System.out.println("该数是一个负数");
			}
			sc.close();
		}

	}

}
