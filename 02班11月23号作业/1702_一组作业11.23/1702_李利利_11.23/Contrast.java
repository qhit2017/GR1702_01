import java.util.Scanner;

public class Contrast {
	public static void main(String[] args) {
		// 第三题
		Scanner sc = new Scanner(System.in);
		System.out.println("输入三个整数");
		System.out.println("输入的第一个整数是:");
		int x = sc.nextInt();
		System.out.println("输入的第二个整数是:");
		int y = sc.nextInt();
		System.out.println("输入的第三个整数是:");
		int z = sc.nextInt();

		int o = 0;
		if (x < y) {
			o = x;
			x = y;
			y = o;
		}
		if (x < z) {
			o = x;
			x = z;
			z = o;
		}
		if (y < z) {
			o = y;
			y = z;
			z = o;
		}
		if (z < x) {
			o = z;
			z = x;
			x = o;
		}
		System.out.println("由小到大输出是:" + x + "<" + y + "<" + z);
	}

}
