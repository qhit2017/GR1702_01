package qhit02;

public class jishu {
	public static void main(String[] args) {
		System.out.println("��whileѭ����1~100֮�������ĺ�");
		int a = 1;
		int sum = 0;
		while (a <= 100) {
			sum = sum + a;
			a = a + 2;
		}
		System.out.println("1~100֮�������ĺ�Ϊ��" + sum);

		System.out.println("��forѭ����1~100֮�������ĺ�");
		int he = 0;
		for (int i = 1; i <= 100; i++) {
			if (i % 2 != 0) {
				he += i;
			}
		}
		System.out.println("1~100֮�������ĺ�Ϊ��" + he);

	}
}
