package asfsa;

public class For {

	public static void main(String[] args) {

		// ����1~100֮�������ĺ�

		int sum = 0;

		for (int i = 1; i <= 100; i++) {
			if (i % 2 != 0) {
				sum += i;
			}
		}
		System.out.println(sum);
	}

}
