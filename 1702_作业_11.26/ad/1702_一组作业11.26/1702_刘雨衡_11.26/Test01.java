import java.util.Scanner;

public class Test01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("输入第一个小数是:");
		double a = sc.nextDouble();
		System.out.println("输入第二个小数是:");
		double b = sc.nextDouble();

		if (a == b) {
			System.out.println(a + "=" + b);
		} else if (a > b) {
			System.out.println(a + ">" + b);
		} else if (a < b) {
			System.out.println(a + "<" + b);
		}

	}

}
