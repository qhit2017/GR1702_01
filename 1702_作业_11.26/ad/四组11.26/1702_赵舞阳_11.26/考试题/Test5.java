import java.util.Scanner;

public class Test5 {
	public static void main(String[] args) {
		System.out.println("������:");
		Scanner sc = new Scanner(System.in);
		System.out.println("�������1����");
		int x = sc.nextInt();
		System.out.println("�������2����");
		int y = sc.nextInt();
		System.out.println("�������3����");
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
		System.out.println("��С�����˳���������:" + z + "<" + y + "<" + x);
		sc.close();
	}
}
