public class Five {
	public static void main(String[] args) {
		System.out.println("������:");
		int a = 1;
		do {
			if (a % 3 == 0 && a % 5 == 0) {
				System.out.println("1000�����ܱ�3���ܱ�5��������:" + a);
			}
			a++;
		} while (a <= 1000);
	}
}
