package zuoye;

/**
 * @author 作者 E-mail:738348954@qq.com
 * @date 创建时间：2017年11月18日 下午2:03:03
 * @version 1.0
 * @parameter
 * @since
 * @return
 * @function
 */
public class zuoye8 {
	public static void main(String[] args) {
		int i;
		int j = 1;
		for (i = 106; i <= 996; i = i + 10) {
			if (i % 3 == 0) {
				j = j + i;
			}
			System.out.println(i);
		}

	}
}
