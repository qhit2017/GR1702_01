import java.util.Scanner;

/**
 * 
 */

/**
 * @author ���� :xuyunmeng
 * @date ����ʱ�䣺2017��11��26�� ����1:19:23
 * @version 1.0
 * @parameter
 * @since
 * @return
 * @function
 */
public class Test05 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("������λ��");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		if (a < b && b < c) {
			System.out.println(a + "<" + b + "<" + c);
		}
		if (a < c && c < b) {
			System.out.println(a + "<" + c + "<" + b);
		}
		if (b < a && a < c) {
			System.out.println(b + "<" + a + "<" + c);
		}
		if (b < c && c < a) {
			System.out.println(b + "<" + c + "<" + a);
		}
		if (c < a && a < b) {
			System.out.println(c + "<" + a + "<" + b);
		}
		if (c < b && b < a) {
			System.out.println(c + "<" + b + "<" + a);
		}
	}

}
