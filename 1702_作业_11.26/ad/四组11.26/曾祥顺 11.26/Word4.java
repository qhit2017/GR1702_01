import java.util.Scanner;

/**
 * @author 作者 曾祥顺\张彤彤
 * @date 创建时间：2017年11月25日 下午1:08:18
 * @version 1.0
 * @parameter
 * @since
 * @return
 * @function
 */
public class Word4 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		if (a >= 90) {
			System.out.println("A");
		}
		if (a >= 60 && a < 90) {
			System.out.println("B");
		}
		if (a < 60) {
			System.out.println("C");
		}
		sc.close();
	}
}
