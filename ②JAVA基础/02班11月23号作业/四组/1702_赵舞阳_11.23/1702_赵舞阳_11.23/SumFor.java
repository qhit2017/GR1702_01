//5 ��for �� while���ַ�������1~100֮�������ĺ�
public class SumFor {
	public static void main(String[] args) {
		System.out.println("������:");
		int sum = 0;
		for (int a = 1; a <= 100; a++) {
			if (a % 2 == 1) {
				sum += a;
			}
		}
		System.out.println("1~100֮�������ĺ�:" + sum);
	}
}
