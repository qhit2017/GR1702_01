package Com.qhit;

import java.util.Scanner;

public class Zuoye2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("������һ����λ��");
		int i = sc.nextInt();
		int ten = i / 10 % 10;
		System.out.println("ʮλ��Ϊ��" + ten);
		sc.close();

	}
}
