public class Test7 {

	public static void main(String[] args) {
		System.out.println("������:");
		for (int a = 1; a <= 1000; a++) {
			if (a % 5 == 0 && a % 10 != 0) {
				System.out.println("�ܱ�5����ͬʱ���ܱ�10��������:" + a);
			}
		}
	}
}
