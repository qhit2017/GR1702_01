package zengxiangshun;

/**
 * @author 作者 曾祥顺\张彤彤
 * @date 创建时间：2017年11月18日 下午1:08:41
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
