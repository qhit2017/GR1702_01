public class Test8 {

	public static void main(String[] args) {
		System.out.println("�ڰ���:");
		for (int a = 1; a <= 10000; a++) {
			if (a % 10 == 6 && a % 3 == 0) {
				System.out.println("��λ��Ϊ6���ܱ�3��������:" + a);
			}
		}
	}
}
