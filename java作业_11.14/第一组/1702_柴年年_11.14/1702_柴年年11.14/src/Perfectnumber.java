/**
 * @author 作者 E-mail:1603559382@qq.com
 * @date 创建时间：2017年11月13日 下午9:16:59
 * @version 1.0
 * @parameter
 * @since
 * @return
 * @function
 */
public class Perfectnumber {

	public static void main(String[] args) {
		// 一个数如果恰好等于它的因子之和，这个数就称为 "完数 "。
		// 例如6=1＋2＋3.编程找出1000以内的所有完数。
		for (int a = 1; a <= 1000; a++) {
			int b = 0;
			for (int j = 1; j < a; j++) {
				if (a % j == 0) {
					b = b + j;
				}
			}
			if (b == a) {
				System.out.println(a + "为完数");
			}
		}
		System.out.println();
	}
}
