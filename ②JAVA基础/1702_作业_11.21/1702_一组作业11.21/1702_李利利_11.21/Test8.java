public class Test8 {

	public static void main(String[] args) {
		int sum = 0;
		for (int d = 100; d < 1000; d++) {
			if ((d % 10 == 6) && (d % 3 == 0)) {
				System.out.println("��λ����6���ܱ�3������3λ������:" + d);
				sum++;
			}
		}
		System.out.println("�ܹ���:" + sum);
	}

}
