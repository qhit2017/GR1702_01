import java.util.Scanner;

/*
 * 4 �Ӽ�������1~7�����֣����������1��
 * ���������һ�����������2���������
 * �ڶ�........���������7,���������7
 * (��switch)
 */
public class Test {
	public static void main(String[] args) {
		System.out.println("������:");
		Scanner sc = new Scanner(System.in);
		System.out.println("������һ������");
		int a = sc.nextInt();
		switch (a) {
		case 1:
			System.out.println("����1");
			break;
		case 2:
			System.out.println("����2");
			break;
		case 3:
			System.out.println("����3");
			break;
		case 4:
			System.out.println("����4");
			break;
		case 5:
			System.out.println("����5");
			break;
		case 6:
			System.out.println("����6");
			break;
		case 7:
			System.out.println("����7");
			break;
		}
		System.out.println();
		sc.close();
	}
}
