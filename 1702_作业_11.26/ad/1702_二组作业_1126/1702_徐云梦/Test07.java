/**
 * 
 */

/**
 * @author 作者 :xuyunmeng
 * @date 创建时间：2017年11月26日 下午2:02:13
 * @version 1.0
 * @parameter
 * @since
 * @return
 * @function
 */
public class Test07 {
	public static void main(String[] args) {
		int a = 0;
		while (a < 1000) {
			if (a % 5 == 0 && a % 10 != 0) {
				System.out.println(a);

			}
			a++;
		}

	}

}
