package zengxiangshun;

/**
 * @author 作者 曾祥顺\张彤彤
 * @date 创建时间：2017年11月18日 下午1:31:19
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
