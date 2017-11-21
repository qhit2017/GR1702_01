package zuoye;

/**
 * @author 作者 E-mail:738348954@qq.com
 * @date 创建时间：2017年11月18日 下午1:13:49
 * @version 1.0
 * @parameter
 * @since
 * @return
 * @function
 */
public class zuoye4 {
	public static void main(String[] args) {
		System.out.println("第四题：1000以内8的倍数之和");
		int sum = 0;
		for (int i = 1; i <= 1000; i++) {
			if (i % 8 == 0) {
				sum = sum + i;
			}
		}
		System.out.println(sum);
	}
}