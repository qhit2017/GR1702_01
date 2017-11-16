package Perfect_number;

/**
 * @author 作者 E-mail:李永立271406@163.com
 * @date 创建时间：2017年11月14日 下午9:36:19
 * @version 1.0
 * @parameter
 * @since
 * @return
 * @function
 */

public class Perfect_number {
	public static void main(String[] args) {

		// 一个数如果恰好等于它的因子之和，这个数就称为 "完数 "。
		// 例如6=1＋2＋3.
		// 编程找出1000以内的所有完数。

		for (int i = 1; i <= 1000; i++) {
			int sum = 0;
			for (int j = 1; j < i; j++)
				if (i % j == 0)
					sum += j;
			if (sum == i)
				System.out.println(i);

		}
	}

}
