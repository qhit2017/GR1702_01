package zuoye;

import java.util.Scanner;

/**
 * time:11.16
 *week:Thursday
 *weather:sun
 *author:sun 
 * site:machine room
 */
public class 第九题 {
public static void main(String[] args) {
	
	//通过控制台输入一个整数N，(N不大于10000),输出所有7的倍数和包含7的数字
	Scanner sc = new Scanner(System.in);
	System.out.println("请输入一个不大于10000的数字:");
	long s = sc.nextLong();
	if (s > 10000) {
		System.out.println("数字不能大于10000");
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



