import java.util.Scanner;

public class Test04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("����ɼ�");
		int a = sc.nextInt();

		if (a >= 90) {
			System.out.println("A");
		} else if (a >= 60) {
			System.out.println("B");
		} else if (a < 60) {
			System.out.println("C");
		}
	}

}
