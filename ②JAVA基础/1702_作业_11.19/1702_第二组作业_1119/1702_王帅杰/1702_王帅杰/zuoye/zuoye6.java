package zuoye;

/**
 * @author 作者 E-mail:738348954@qq.com
 * @date 创建时间：2017年11月18日 下午1:46:30
 * @version 1.0
 * @parameter
 * @since
 * @return
 * @function
 */
public class zuoye6 {
	public static void main(String[] args) {
		System.out.println("第六题");
		int sum = 0;
		for (int a = 1; a <= 10; a++) {
			sum = sum + a;
			if (sum > 20) {
				System.out.println(sum);
				break;
			}
		}
	}
}
