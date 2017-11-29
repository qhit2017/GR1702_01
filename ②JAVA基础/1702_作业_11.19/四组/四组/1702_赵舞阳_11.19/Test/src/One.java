import java.util.Scanner;

public class One {
	public static void main(String[] args) {
		System.out.println("第一题:\n请输入一个数");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		if (a > 0) {
			System.out.println("该数是正数");
		} else {
			System.out.println("该数是负数");
		}
		sc.close();
	}
}
