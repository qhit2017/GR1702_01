import java.util.Scanner;

/**
 * 
 */

/**
 * @author 作者 :xuyunmeng
 * @date 创建时间：2017年11月26日 下午1:13:49
 * @version 1.0
 * @parameter
 * @since
 * @return
 * @function
 */
public class Test04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("输入成绩");
		int a = sc.nextInt();
		if (a >= 90) {
			System.out.println("A");
		} else if (a >= 60 && a < 90) {
			System.out.println("B");
		} else if (a < 60) {
			System.out.println("C");
		}

	}

}
