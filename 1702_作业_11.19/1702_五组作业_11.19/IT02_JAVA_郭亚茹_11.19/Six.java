package guo;

public class Six {
	public static void main(String[] args) {
		// 1��10֮���������ӣ��õ��ۼ�ֵ����20�ĵ�ǰ���֣��������������
		int sum = 0;
		for (int a = 1; a <= 10; a++) {
			sum = sum + a;
			if (sum > 20) {
				break;
			}
			}
		System.out.println(sum);
	}
}
