import java.util.Scanner;

/**
 * @author 作者 曾祥顺\张彤彤
 * @date 创建时间：2017年11月25日 下午1:14:21
 * @version 1.0
 * @parameter
 * @since
 * @return
 * @function
 */
public class Word5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int i = 0;
		if (a > b) {
			i=a;
			a=b;
			b=i;
		}
		if (a > c) {
			i=a;
			a=c;
			c=i;
		}
		if (b > c) {
			i=b;
			b=c;
			c=i;
		}
		System.out.println(a+"<"+b+"<"+c);
		sc.close();
		
	}
}
