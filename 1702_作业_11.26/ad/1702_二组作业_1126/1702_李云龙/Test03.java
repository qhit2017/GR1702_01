package number;

import java.util.Scanner;

public class Test03 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("输入一个不大于10000的整数：");
	int a = sc.nextInt();
	int b = 0;
	if (a < 0 || a >= 10000) {
		System.out.println("超出范围：");
	} else if (a == 0) {
		System.out.println("此数字是一位数");
	}
	while (a > 0) {
		a = a / 10;
		b++;
	}

	System.out.println("此数字是" + b + "位数");

	sc.close();
}

}

