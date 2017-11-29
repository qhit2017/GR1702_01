package zengxiangshun;

import java.util.Scanner;

/**
 * @author 作者 曾祥顺\张彤彤
 * @date 创建时间：2017年11月23日 上午8:14:05
 * @version 1.0
 * @parameter
 * @since
 * @return
 * @function
 */
public class Word1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入1~7的数字");
		int a = sc.nextInt();
		switch (a) {
		case 1:
			System.out.println("今天星期1");
			break;
		case 2:
			System.out.println("今天星期2");
			break;
		case 3:
			System.out.println("今天星期3");
			break;
		case 4:
			System.out.println("今天星期4");
			break;
		case 5:
			System.out.println("今天星期5");
			break;
		case 6:
			System.out.println("今天星期6");
			break;
		case 7:
			System.out.println("今天星期天");
			break;

		default:
			System.out.println("输入错误请重输");
			break;
		}
		sc.close();
	}

}
