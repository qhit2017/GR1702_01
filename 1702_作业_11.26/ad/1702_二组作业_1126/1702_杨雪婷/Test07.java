package yangxueting;

/**
 * @author ���� qqE-mail:157334005@qq.com
 * @date ����ʱ�䣺2017��11��26�� ����8:15:30
 * @version 1.0
 * @parameter
 * @since
 * @return
 * @function
 */
public class Test07 {

	public static void main(String[] args) {
		int h = 1;
		while (h <= 1000) {
			if (h % 5 == 0 && h % 10 != 0) {
				System.out.println(h);
			}
			h++;
		}

	}
}
