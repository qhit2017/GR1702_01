import java.util.Scanner;

/**
 * @author ���� ����˳\��ͮͮ
 * @date ����ʱ�䣺2017��11��25�� ����1:08:18
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
