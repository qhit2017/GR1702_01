package number;

import java.util.Scanner;

public class Test05 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("�������һ����");
	int a = sc.nextInt();
	System.out.println("������ڶ�����");

	int b = sc.nextInt();
	;
	System.out.println("�������������");
	int c = sc.nextInt();
	;
	int j = 0;

	if (a > b) {
		j = a;
		a = b;
		b = j;
	}

	if (a > c) {
		j = a;
		a = c;
		c = j;
	}

	if (b > c) {
		j = b;
		b = c;
		c = j;
	}
	System.out.println(a + "<" + b + "<" + c);
	sc.close();
}


}

