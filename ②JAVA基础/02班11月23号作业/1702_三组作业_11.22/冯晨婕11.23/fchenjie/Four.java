/**
 * 
 */
package fchenjie;

import java.util.Scanner;

/**
 * @author 作者：冯晨婕  E-mail:2570804732@qq.com
 * @date 创建时间：23 Nov 2017 8:27:00 Ekuseni
 * @version 1.0
 * @parameter
 * @since
 * @return
 * @function
 */
/**
 * @author Administrator
 *
 */
public class Four {
	public static void main(String[] args) {
		/*
		 * 4 从键盘输入1~7的数字，如果数字是1，则输出星期一， 如果数字是2，则输出星期二....
		 * ....如果数字是7,则输出星期日(用switch)
		 */

		 Scanner sc =new Scanner(System.in);
		 System.out.println("请输入1~7的数");
		 int day =sc.nextInt();
		switch (day) {
		case 1:
			System.out.println("今天星期一");
			break;
		case 2:
			System.out.println("今天星期二");
			break;
		case 3:
			System.out.println("今天星期三");
			break;
		case 4:
			System.out.println("今天星期四");
			break;
		case 5:
			System.out.println("今天星期五");
			break;
		case 6:
			System.out.println("今天星期六");
			break;
		case 7:
			System.out.println("今天星期日");
			break;
		default:
			System.out.println("输入错误 ");
			break;

		}
	}
}
