import java.util.Scanner;

public class Test09 {
	public static void main(String[] args) {
		System.out.println("第九题");
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入一个小于等于10000的数");
		int N = sc.nextInt();
		if (N <=10000) {
			for (int f = 1; f < N; f++) {
				//7的倍数，后两位，
				if (f % 7 == 0 || f % 100 == 7 || f / 10 % 10 == 7
						|| f% 10 == 7 || f % 100 == 7) {
					System.out.println(f);
				}
			}
		}
		
	}
}
