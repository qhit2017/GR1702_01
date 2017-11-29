package lijingjing;

/**
 * @author 作者 E-mail:996939518@qq.com
 * @date 创建时间：2017年11月19日 下午4:12:45
 * @version 1.0
 * @parameter
 * @since
 * @return
 * @function
 */
public class Times {

	public static void main(String[] args) {
		int i = 0;
		int sum = 0;
		for (int b = 8; i <= 1000; i++) {
			if (0 == i % 8) {
				sum = sum + i;
			}
			i++;

		}
		System.out.println(sum);

	}

}
