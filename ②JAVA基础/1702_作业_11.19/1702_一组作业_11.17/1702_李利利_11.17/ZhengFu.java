import java.util.Scanner;

public class ZhengFu {
	// 第一题
	// 判断一个数是正数还是负数
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入一个数是:");
		int shu = sc.nextInt();

		if (shu > 0) {
			System.out.println("该数是一个正数");
		} else if (shu < 0) {
			System.out.println("该数是一个负数");
		} else if (shu == 0) {
			System.out.println("该数既不是正数也不是负数");
		}
	}
}
