import java.util.Scanner;

public class Two {
	public static void main(String[] args) {
		System.out.println("�ڶ���:");
		Scanner sc = new Scanner(System.in);
		System.out.println("�������1��С��");
		double a = sc.nextDouble();
		System.out.println("�������2��С��");
		double b = sc.nextDouble();
		if (a > b) {
			System.out.println(a + ">" + b);
		} else {
			System.out.println(a + "<" + b);
		}
		sc.close();
	}
}
