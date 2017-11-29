public class Test6 {
	public static void main(String[] args) {
		System.out.println("第六题:");
		int sum = 0;
		for (int a = 1; a <= 1000; a++) {
			if (a % 8 == 0) {
				sum += 1;
			}
		}
		System.out.println("1000以内8倍数的个数:"+sum);
	}
}
