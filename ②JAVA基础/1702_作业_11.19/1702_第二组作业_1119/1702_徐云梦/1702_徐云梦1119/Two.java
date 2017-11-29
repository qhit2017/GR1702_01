import java.util.Scanner;

public class Two {
	// 输入两个小数，判断两个小数的大小
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("输入两个小数");
		float a = sc.nextFloat();
		float b = sc.nextFloat();
		if (a > b) {
			System.out.println(a + "大于" + b);
		} else {
			if (a < b) {
				System.out.println(a + "小于" + b);
			} else {
				if (a == b) {
					System.out.println(a + "等于" + b);
				}
			}

		}
	}
}
