package zengxiangshun;

/**
 * @author 作者 曾祥顺\张彤彤
 * @date 创建时间：2017年11月14日 下午6:31:14
 * @version 1.0
 * @parameter
 * @since
 * @return
 * @function
 */
public class Sum {
	public static void main(String[] args) {
		int sum = 0;
		for (int a = 0; a <= 100; a++) {
			if (!(a % 10 == 3)) {
				sum += a;
			}
		}
		System.out.println(sum);
	}

}
