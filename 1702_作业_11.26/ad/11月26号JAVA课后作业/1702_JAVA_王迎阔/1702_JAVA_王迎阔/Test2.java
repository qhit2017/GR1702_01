import java.util.Scanner;

/**
 * @author 作者 E-mail:1456014420@qq.com
 * @date 创建时间：2017年11月24日 下午1:46:06
 * @version 1.0
 * @parameter
 * @since
 * @return
 * @function
 */
public class Test2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("请输入一个三位数");
		int a = sc.nextInt();
		int b = a / 10 % 10;
		System.out.println(b);

	}
}
