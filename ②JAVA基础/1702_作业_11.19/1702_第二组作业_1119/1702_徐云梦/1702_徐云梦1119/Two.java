import java.util.Scanner;

public class Two {
	// ��������С�����ж�����С���Ĵ�С
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("��������С��");
		float a = sc.nextFloat();
		float b = sc.nextFloat();
		if (a > b) {
			System.out.println(a + "����" + b);
		} else {
			if (a < b) {
				System.out.println(a + "С��" + b);
			} else {
				if (a == b) {
					System.out.println(a + "����" + b);
				}
			}

		}
	}
}
