import java.util.Scanner;

/**
 * 
 */

/**
 * @author 作者 :xuyunmeng
 * @date 创建时间：2017年11月26日 下午12:41:16
 * @version 1.0
 * @parameter
 * @since
 * @return
 * @function
 */
public class Test01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("输入两个小数");
		double a = sc.nextDouble();
		double b = sc.nextDouble();
		if (a < b) {
			System.out.println(a + "<" + b);
		} else if (a > b) {
			System.out.println(a + ">" + b);
		} else if (a == b) {
			System.out.println(a + "=" + b);
		}

	}

}
