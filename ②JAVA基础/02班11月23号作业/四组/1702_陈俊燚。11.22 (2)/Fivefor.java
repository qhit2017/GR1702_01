//��for �� while���ַ�������1~100֮�������ĺ�
public class Fivefor {
	public static void main(String[] args) {
		System.out.println("������");
		int sum = 0;
		for (int a = 1; a <= 100; a++) {
			if (a % 2 != 0) {
				sum += a;
			}
		}
		System.out.println(sum);
	}
}
