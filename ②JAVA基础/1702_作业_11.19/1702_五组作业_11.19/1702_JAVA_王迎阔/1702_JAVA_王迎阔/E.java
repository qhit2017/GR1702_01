package A;

/**
 * @author 作者 E-mail:1456014420@qq.com
 * @date 创建时间：2017年11月18日 下午2:21:02
 * @version 1.0
 * @parameter
 * @since
 * @return
 * @function
 */
public class E {
	public static void main(String[] args) {
		System.out.println("第六题:");
		int sum = 0;
		for (int a = 1; a <= 10; a++) {
			sum = sum + a;
			if (sum > 20) {
				
				break;
			}
		}
		System.out.println(sum);

	}

}
