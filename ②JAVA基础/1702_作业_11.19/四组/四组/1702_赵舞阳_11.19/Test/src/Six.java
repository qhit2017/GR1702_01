public class Six {
	public static void main(String[] args) {
		System.out.println("µÚÁùÌâ:");
		int a = 1;
		int sum = 0;
		while (a <= 10) {
			sum = sum + a;
			a++;
			if (sum > 20) {
				System.out.println(sum);
				break;
			}
		}
	}
}
