/**
 * 
 */

/**
 * @author 作者 :xuyunmeng
 * @date 创建时间：2017年11月26日 下午2:48:29
 * @version 1.0
 * @parameter
 * @since
 * @return
 * @function
 */
public class Test10 {
	public static void main(String[] args) {
		for (int a = 1900; a < 2017; a++) {
			if ((a % 4 == 0 && a % 100 != 0) || (a % 400 == 0)) {
				System.out.println(a);

			}
		}

	}

}
