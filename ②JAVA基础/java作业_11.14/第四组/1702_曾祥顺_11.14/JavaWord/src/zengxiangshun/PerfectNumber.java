package zengxiangshun;

/**
 * @author 作者 曾祥顺\张彤彤
 * @date 创建时间：2017年11月14日 下午6:07:24
 * @version 1.0
 * @parameter
 * @since
 * @return
 * @function
 */
public class PerfectNumber {
	public static void main(String[] args) {
		for (int a = 2; a <= 1000; a++) {
			int sum = 0;
			for (int b = 1; b < a; b++) {
				if (a % b == 0) {
					sum += b;
				}

			}
			if (sum == a) {
				System.out.println("完数"+sum);
			}

		}
	}
}
