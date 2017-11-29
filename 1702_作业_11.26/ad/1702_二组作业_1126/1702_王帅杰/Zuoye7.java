package Com.qhit;

public class Zuoye7 {
	public static void main(String[] args) {
		System.out.println("第五题：1000以内既能被5整除不能被10整除的数");
		int a = 1;
		while (a <= 1000) {
			a++;
			if (a % 5 == 0 && a % 10 != 0) {
				System.out.println(a);
			}
		}

	}
}
