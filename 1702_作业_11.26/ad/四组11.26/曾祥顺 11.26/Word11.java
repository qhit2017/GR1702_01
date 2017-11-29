package zhengxiangshun;

/**
 * @author 作者 曾祥顺\张彤彤
 * @date 创建时间：2017年11月25日 下午2:57:16
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
