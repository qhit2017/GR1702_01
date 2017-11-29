import java.util.Scanner;

/**
 * @author 作者: xuyunmeng
 * @date 创建时间：2017年11月13日 下午8:09:14
 * @version 1.0
 * @parameter
 * @since
 * @return
 * @function
 */
public class work {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char A = 'A';
		char B = 'B';
		char C = 'C';
		System.out.println("学习成绩");
		int i = sc.nextInt();

		if (i >= 90) {
			System.out.println(A);

		} else {
			if ((i >= 60) && (i <= 89)) {
				System.out.println(B);

			} else {
				System.out.println(C);
			}
		}
	}
}