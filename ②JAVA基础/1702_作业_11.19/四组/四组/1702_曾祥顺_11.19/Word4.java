package zengxiangshun;

/**
 * @author ���� ����˳\��ͮͮ
 * @date ����ʱ�䣺2017��11��18�� ����1:08:41
 * @version 1.0
 * @parameter
 * @since
 * @return
 * @function
 */
public class Word4 {
	public static void main(String[] args) {
		int b = 0;
		for (int a = 1; a <= 1000; a++) {
			if (a % 8 == 0) {

				b += a;
			}

		}
		System.out.println(b);
	}
}
