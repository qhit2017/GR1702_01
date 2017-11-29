package N1;

/*制作人：王欣
 *制作时间：2017年11月13日下午8:13:24
 *邮箱：2408368509@qq.com
 */

public class N4 {
	public static void main(String[] args) {
		// 编程找出1000以内的所有完数
		// 一个数如果恰好等于它的因子之和，这个数就称为 "完数 "
		// 例如6=1＋2＋3

		for (int i = 1; i <= 1000; i++) {
			int s = 0;
			for (int j = 1; j < i; j++)

				if (i % j == 0)
					s += j;

			if (s == i)
				System.out.println(i);

		}
	}
}
