import java.util.Scanner;


public class Test09 {
public static void main(String[] args) {
	Scanner Sc = new Scanner(System.in);
	System.out.println("����һ������");
	int N = Sc.nextInt();
	if (N > 10000) {
		System.out.println("������Χ");

	} else {
		for (int n = 1; n <= N; n++) {
			if (n % 7 == 0 || n/10000 == 7 || n%10000/1000 == 7 ||n/10 % 10 == 7
					|| n % 10 == 7) {
				System.out.println(n);
			}
}
	}
}
}