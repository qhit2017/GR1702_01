import java.util.Scanner;

/**
 * 
 */

/**
 * @author 作者 :xuyunmeng
 * @date 创建时间：2017年11月23日 上午8:18:28
 * @version 1.0
 * @parameter
 * @since
 * @return
 * @function
 */
public class Test09 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("输入一个不大于10000的数");
		int a = sc.nextInt();
		for (int i = 7; i <= a; i++) {
			if (i % 7 == 0 || i / 1000 == 7 || i / 100 % 10 == 7
					|| i / 10 % 10 == 7 || i % 10 == 7) {
				System.out.println(i);
				i++;
			}

		}
	}

}
