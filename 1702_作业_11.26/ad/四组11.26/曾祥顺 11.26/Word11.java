package zhengxiangshun;

/**
 * @author ���� ����˳\��ͮͮ
 * @date ����ʱ�䣺2017��11��25�� ����2:57:16
 * @version 1.0
 * @parameter
 * @since
 * @return
 * @function
 */
public class Word11 {
	static boolean Encapsulation(int a, int b) {
		boolean c = false;
		if (a == b || a / 10 == b | a / 100 == b || a / 1000 == b) {
			c = true;
		} else {
			c = false;
		}
		return c;

	}

	public static void main(String[] args) {
		for (int i = 0; i < 10000; i++) {
			if (Encapsulation(i, 3)) {
				System.out.println(i);
			}
		}

	}

}
