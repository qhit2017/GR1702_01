package zengxiangshun;

/**
 * @author ���� ����˳\��ͮͮ
 * @date ����ʱ�䣺2017��11��18�� ����1:31:19
 * @version 1.0
 * @parameter
 * @since
 * @return
 * @function
 */
public class Word8 {
	public static void main(String[] args) {
		int c = 0;
		for (int a = 100; a < 1000; a++) {
			if (a % 10 == 6) {
				if (a % 3 == 0) {

					c++;

				}
			}
		}
		System.out.println(c);
	}
}
