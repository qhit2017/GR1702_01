/**
 * @author 作者 E-mail:1243629747@163.com
 * @date 创建时间：2017年11月14日 下午6:26:07
 * @version 1.0
 * @parameter
 * @since
 * @return
 * @function
 */
/*
 * 4、一个数如果恰好等于它的因子之和,
 * 这个数就称为 "完数 "。例如6=1＋2＋3.
 *  编程找出1000以内的所有完数。
 */
public class Number {
	public static void main(String[] args) {
		System.out.println("第四题:");
		for (int a = 1; a <= 1000; a++) {
		int sum = 0;
			for (int b = 1; b < a; b++)
				if (a % b == 0)
					sum += b;
				if (sum == a)
				System.out.println("1000以内的所有完数"+a);
		}
	}
}
