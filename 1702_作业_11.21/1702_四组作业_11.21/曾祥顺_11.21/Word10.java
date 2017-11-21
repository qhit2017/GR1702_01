package zengxiangshun;

/**
 * @author 作者 曾祥顺\张彤彤
 * @date 创建时间：2017年11月18日 下午2:03:03
 * @version 1.0
 * @parameter
 * @since
 * @return
 * @function
 */
public class Word10 {
	public static void main(String[] args) {
		int a = 1;

		while (a <= 9) {
			int b = 1;
			while (b <= a) {
				System.out.print(b + "*" + a + "=" + (a * b) + "\t");
				b++;
			}
			System.out.println();
			a++;
		}
	}
}
