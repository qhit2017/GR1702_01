package Guo;

import java.util.Scanner;

public class Five {
	public static void main(String[] args) {
		// ��������������X Y Z ������������ɴ�С���С�
		Scanner sc = new Scanner(System.in);
		System.out.println("������������֣�");
		int x = sc.nextInt();
		int y = sc.nextInt();
		int z = sc.nextInt();
		int e;
		if (x<y) {
			e = x;
			x = y;
			y = e;

		}
		if (x< z) {
			e = x;
			x = z;
			z = e;

		}
		if (y < z) {
			e = y;
			y = z;
		}
		System.out.println(x + ">" + y + ">" + z);
		sc.close();
		
	}
}