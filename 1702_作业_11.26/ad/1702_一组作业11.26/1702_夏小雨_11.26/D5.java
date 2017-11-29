package xiaxiaoyu;

import java.util.Scanner;

public class D5 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("分别输出X,Y,Z三个数");
	int x = sc.nextInt();
	int y = sc.nextInt();
	int z = sc.nextInt();

	int a = 0;
	if (x > y) {
		a = x;
		x = y;
		y = a;
	}
	if (x > z) {
		a = x;
		x = z;
		z = a;
	}
	if (y > z) {
		a = y;
		y = z;
		z = a;
	}
	System.out.println(x + "<" + y + "<" + z);
}
}

