public class Sumwhile {
	public static void main(String[] args) {
		System.out.println("������:");
		int a = 1;
		int sum = 0;
		while (a <= 100) {
			if (a % 2 == 1) {
				sum += a;
			}
			a++;
		}
		System.out.println("1~100֮�������ĺ�:" + sum);
	}
}
