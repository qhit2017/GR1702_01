public class ZhengChu {
	public static void main(String[] args) {
		// ������
		int q = 1;
		do {
			if (q % 3 == 0 && q % 5 == 0) {
				System.out.println("��1000�ڼ��ܱ�3�������ܱ�5����������:" + q);
			}
			q++;
		} while (q <= 1000);
	}
}
