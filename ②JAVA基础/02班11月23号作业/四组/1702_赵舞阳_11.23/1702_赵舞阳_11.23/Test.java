import java.util.Scanner;

/*
 * 4 从键盘输入1~7的数字，如果数字是1，
 * 则输出星期一，如果数字是2，则输出星
 * 期二........如果数字是7,则输出星期7
 * (用switch)
 */
public class Test {
	public static void main(String[] args) {
		System.out.println("第四题:");
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入一个整数");
		int a = sc.nextInt();
		switch (a) {
		case 1:
			System.out.println("星期1");
			break;
		case 2:
			System.out.println("星期2");
			break;
		case 3:
			System.out.println("星期3");
			break;
		case 4:
			System.out.println("星期4");
			break;
		case 5:
			System.out.println("星期5");
			break;
		case 6:
			System.out.println("星期6");
			break;
		case 7:
			System.out.println("星期7");
			break;
		}
		System.out.println();
		sc.close();
	}
}
