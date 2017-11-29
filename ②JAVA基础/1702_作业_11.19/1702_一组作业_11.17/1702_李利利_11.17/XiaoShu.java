import java.util.Scanner;

public class XiaoShu {
	// 第二题
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("输入第一个小数");
		double w = sc.nextDouble();

		System.out.println("输入第二个小数");
		double y = sc.nextDouble();

		if (w > y) {
			System.out.println(w + ">" + y);
		} else if (w < y) {
			System.out.println(w + "<" + y);
		} else if (w == y) {
			System.out.println(w + "=" + y);
		}
	}
}
