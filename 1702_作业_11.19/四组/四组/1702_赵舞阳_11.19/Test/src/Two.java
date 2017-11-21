import java.util.Scanner;

public class Two {
	public static void main(String[] args) {
		System.out.println("第二题:");
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入第1个小数");
		double a = sc.nextDouble();
		System.out.println("请输入第2个小数");
		double b = sc.nextDouble();
		if (a > b) {
			System.out.println(a + ">" + b);
		} else {
			System.out.println(a + "<" + b);
		}
		sc.close();
	}
}
