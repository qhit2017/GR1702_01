package zuoye;

/**
 * @author 作者 E-mail:738348954@qq.com
 * @date 创建时间：2017年11月18日 下午1:35:43
 * @version 1.0
 * @parameter
 * @since
 * @return
 * @function
 */
public class zuoye5 {
	public static void main(String[] args) {
		System.out.println("第五题：1000以内既能被3整除又能被5整除的数");
		int a = 1;
		do {
			if (a % 3 == 0 && a % 5 == 0) {
				System.out.println(a);
			}
			a++;
		} while (a <= 1000);
	}
}
