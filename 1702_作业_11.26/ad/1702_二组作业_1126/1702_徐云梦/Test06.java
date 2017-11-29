/**
 * 
 */

/**
 * @author 作者 :xuyunmeng
 * @date 创建时间：2017年11月26日 下午1:56:04
 * @version 1.0
 * @parameter
 * @since
 * @return
 * @function
 */
public class Test06 {
	public static void main(String[] args) {
		int b = 0;
		for (int i = 0; i < 1000; i++) {
			if (i % 8 == 0) {

				b++;
			}
		}
		System.out.println(b);

	}

}
