import java.util.Scanner;

public class Test03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("����һ��������10000��������:");
		int n = sc.nextInt();

		if (n < 10) {
			System.out.println("����Ϊһλ��");
		} else if (n < 100) {
			System.out.println("����Ϊ��λ��");
		} else if (n < 1000) {
			System.out.println("����Ϊ��λ��");
		} else if (n < 10000) {
			System.out.println("����Ϊ��λ��");
		}
	}

}
