import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入1个三位数");
		int a = sc.nextInt();
		int i = a / 10 % 10;
		System.out.println("该数的10位是:" + i);
		sc.close();
	}

}
