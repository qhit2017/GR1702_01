package zuoye;

import java.util.Scanner;

//������������x,y,z���������������С���������
public class ZuoYe3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("�������һ������");
		int x = sc.nextInt();
		System.out.println("������ڶ�������");
		int y = sc.nextInt();
		System.out.println("���������������");
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
		System.out.println("��С����������ǣ�" + x + "\t" + y + "\t" + z);
		sc.close();
	}
	

}
