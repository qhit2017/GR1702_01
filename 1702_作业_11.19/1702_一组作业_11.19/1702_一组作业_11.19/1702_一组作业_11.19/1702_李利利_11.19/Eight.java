public class Eight {
	public static void main(String[] args) {
		//�ڰ���
		int e = 0;
		int p = 100;
		while (p >= 100 && p < 1000) {
			if (p % 10 == 6 && p % 3 == 0) {
				System.out.println("��λ����6���ܱ�3������3λ������:" + p);
				e++;
			}
			p++;
		}
		System.out.println("�ܹ���" + e + "��");
	}
}
