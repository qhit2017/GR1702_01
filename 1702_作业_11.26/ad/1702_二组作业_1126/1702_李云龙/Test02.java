package number;

import java.util.Scanner;

public class Test02 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("输入一个三位数:");
	int a = sc.nextInt();

	int b = a / 10 % 10;

	System.out.println("这个三位数的十位数是：" + b);

	sc.close();
}


}
	

