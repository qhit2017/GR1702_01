package number;

import java.util.Scanner;

public class Test02 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("����һ����λ��:");
	int a = sc.nextInt();

	int b = a / 10 % 10;

	System.out.println("�����λ����ʮλ���ǣ�" + b);

	sc.close();
}


}
	

