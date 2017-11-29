import java.util.Scanner;

public class Test03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("输入一个不大于10000的整数是:");
		int n = sc.nextInt();

		if (n < 10) {
			System.out.println("该数为一位数");
		} else if (n < 100) {
			System.out.println("该数为二位数");
		} else if (n < 1000) {
			System.out.println("该数为三位数");
		} else if (n < 10000) {
			System.out.println("该数为四位数");
		}
	}

}
