import java.util.Scanner;

public class Test3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("������1������");
		int a = sc.nextInt();
		if (a < 10000) {
			for (int i = 0;; i++) {
				if (a > 0) {
					a = a / 10;
					continue;
				}
				System.out.println("����1��"+i+"λ��");
				break;
			}
		}
	}

}
