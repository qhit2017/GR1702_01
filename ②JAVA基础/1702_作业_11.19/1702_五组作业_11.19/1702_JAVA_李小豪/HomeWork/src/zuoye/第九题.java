package zuoye;

import java.util.Scanner;

/**
 * time:11.16
 *week:Thursday
 *weather:sun
 *author:sun 
 * site:machine room
 */
public class �ھ��� {
public static void main(String[] args) {
	
	//ͨ������̨����һ������N��(N������10000),�������7�ı����Ͱ���7������
	Scanner sc = new Scanner(System.in);
	System.out.println("������һ��������10000������:");
	long s = sc.nextLong();
	if (s > 10000) {
		System.out.println("���ֲ��ܴ���10000");
	} else {
		for (int a = 1; a < s; a++) {
			if (a % 7 == 0 || a % 10 == 7 || a / 10 % 10 == 7
					|| a / 100 == 7 || a / 1000 == 7) {
				System.out.println(a);
			}
		}

	}
	sc.close();

}
}



