public class Test6 {

	public static void main(String[] args) {
		int sum = 0;
		for (int m = 0; m <= 10; m++) {
			sum = sum + m;
			if (sum > 20) {
				System.out.println("�ۼ�ֵ����20�ĵ�ǰ������:" + m);
				break;
			}
		}
	}
}
