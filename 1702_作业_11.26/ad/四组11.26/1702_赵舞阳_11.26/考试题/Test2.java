import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("������1����λ��");
		int a = sc.nextInt();
		int i = a / 10 % 10;
		System.out.println("������10λ��:" + i);
		sc.close();
	}

}
