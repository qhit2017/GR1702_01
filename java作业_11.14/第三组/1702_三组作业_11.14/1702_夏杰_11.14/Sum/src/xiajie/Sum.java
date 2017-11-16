package xiajie;

public class Sum {

	public static void main(String[] args) {

		System.out.println("求整数1~100的累加值，但要求跳过各位为3的数");

		int sum = 0;

		for (int a = 1; a <= 100; a++) {
			
			if (a % 10 != 3) {

				sum = sum + a;

			}

		}
		
		System.out.println("所求和为:" + sum);

	}

}
