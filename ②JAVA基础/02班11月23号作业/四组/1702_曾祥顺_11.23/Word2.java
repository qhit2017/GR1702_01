package zengxiangshun;

/**
 * @author ���� ����˳\��ͮͮ
 * @date ����ʱ�䣺2017��11��23�� ����8:31:49
 * @version 1.0
 * @parameter
 * @since
 * @return
 * @function
 */
public class Word2 {

	public static void main(String[] args) {
		int a = 0;
		for (int i = 1; i <= 100; i++) {
			if (i % 2 != 0) {
				a += i;
			}
		}
		System.out.println("forѭ��" + a);
		int c = 0;
		int b = 1;
		while (b <= 100) {

			if (b % 2 != 0) {
				c += b;

			}

			b++;
		}
		System.out.println("Whileѭ��" + c);
	}
}
