public class LeiJia {
	public static void main(String[] args) {
		// ������
		int p = 0;
		int sum = 0;

		while (p <= 10) {
			sum = sum + p;
			if (sum > 20) {

				System.out.println("����ۼ�ֵ����20�ĵ�ǰ������:" + p);
				break;
			}
			p++;
		}
	}
}
