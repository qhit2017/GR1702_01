package Com.qhit;

import java.util.Scanner;

public class Zuoye2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入一个三位数");
		int i = sc.nextInt();
		int ten = i / 10 % 10;
		System.out.println("十位数为：" + ten);
		sc.close();

	}
}
