package number;

import java.util.Scanner;

public class Test03 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("����һ��������10000��������");
	int a = sc.nextInt();
	int b = 0;
	if (a < 0 || a >= 10000) {
		System.out.println("������Χ��");
	} else if (a == 0) {
		System.out.println("��������һλ��");
	}
	while (a > 0) {
		a = a / 10;
		b++;
	}

	System.out.println("��������" + b + "λ��");

	sc.close();
}

}

