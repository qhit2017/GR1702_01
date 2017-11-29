import java.util.Scanner;

public class Test02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("输入一个3位数");
		int a = sc.nextInt();

		System.out.println("该数十位是:" + a / 10 % 10);
	}

}
