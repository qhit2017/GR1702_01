/**
 * @author ����: xuyunmeng
 * @date ����ʱ�䣺2017��11��8�� ����7:11:11
 * @version 1.0
 * @parameter
 * @since
 * @return
 * @function
 */
public class nine {
	public static void main(String[] args) {
		for (int a = 1; a <= 9; a++) {

			for (int b = 1; b <= a; b++) {

				System.out.print(b + "*" + a + "=" + b * a + "\t");
			}

			System.out.println();
		}
	}
}
