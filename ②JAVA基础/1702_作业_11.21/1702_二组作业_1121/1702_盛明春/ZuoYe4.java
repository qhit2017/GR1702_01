package zuoye;

import java.util.Scanner;

//一个5位数，判断它是不是回文数。即12321是回文数，
// 个位与万位相同，十位与千位相同。 
public class ZuoYe4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入一个数字");
		int a = sc.nextInt();
		if (a % 10 == a / 10000 && a / 1000 % 10 == a / 10 % 10) {
			System.out.println(a + "是回文数");
		} else {
			System.out.println(a + "不是回文数");
		}
		sc.close();
	}
}
