import java.util.Scanner;

public class Test5 {
	public static void main(String[] args) {
		System.out.println("第五题:");
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入第1个数");
		int x = sc.nextInt();
		System.out.println("请输入第2个数");
		int y = sc.nextInt();
		System.out.println("请输入第3个数");
		int z = sc.nextInt();
		int a;
		if (x < y) {
			a = x;
			x = y;
			y = a;
		}
		if (x < z) {
			a = x;
			x = z;
			z = a;
		}
		if (y < z) {
			a = y;
			y = z;
			z = a;
		}
		System.out.println("从小到大的顺序排列输出:" + z + "<" + y + "<" + x);
		sc.close();
	}
}
