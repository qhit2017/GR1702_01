/**
 * 
 */

/**
 * @author 作者 :xuyunmeng
 * @date 创建时间：2017年11月26日 下午2:13:45
 * @version 1.0
 * @parameter
 * @since
 * @return
 * @function
 */
public class Test08 {
	public static void main(String[] args) {
		for (int i = 0; i < 10000; i++) {
			if (i % 3 == 0 && i % 10 == 6) {
				System.out.println(i);
			}
		}

	}

}
