import java.util.Scanner;

public class Contrast {
	public static void main(String[] args) {
		// ������
		Scanner sc = new Scanner(System.in);
		System.out.println("������������");
		System.out.println("����ĵ�һ��������:");
		int x = sc.nextInt();
		System.out.println("����ĵڶ���������:");
		int y = sc.nextInt();
		System.out.println("����ĵ�����������:");
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
		System.out.println("��С���������:" + x + "<" + y + "<" + z);
	}

}
