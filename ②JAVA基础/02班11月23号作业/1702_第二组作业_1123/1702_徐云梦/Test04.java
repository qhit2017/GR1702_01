import java.util.Scanner;

/**
 * 
 */

/**
 * @author 作者 :xuyunmeng
 * @date 创建时间：2017年11月23日 上午8:40:06
 * @version 1.0
 * @parameter
 * @since
 * @return
 * @function
 */
public class Test04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("从键盘输入1~7的数字");
		int a = sc.nextInt();
		switch (a) {
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
		}
	}

}
