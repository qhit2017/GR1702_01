import java.util.Scanner;

public class Test02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("����һ��3λ��");
		int a = sc.nextInt();

		System.out.println("����ʮλ��:" + a / 10 % 10);
	}

}
