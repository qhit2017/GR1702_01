package shape01;

import java.util.Scanner;

public class Test05 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("�������������");
		int x = sc.nextInt();
		int y = sc.nextInt();
		int z = sc.nextInt();
		int a = 0;
		if (x > y) {
			a = x;
			x = y;
			y = a;
		}
		if (x > z) {
			a = x;
			x = z;
			z = a;
		}
		if (y > z) {
			a = y;
			y = z;
			z = a;
		}
		System.out.println("��С����������" + x + " " + y + " " + z);
		sc.close();
	}
}
