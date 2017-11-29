package lijingjing;

/**
 * @author 作者 E-mail:996939518@qq.com
 * @date 创建时间：2017年11月26日 下午8:31:45
 * @version 1.0
 * @parameter
 * @since
 * @return
 * @function
 */
public class A4 {

	public static void main(String[] args) {
		for (int i = 0; i <= 10000; i++) {
			if (i == 3 || i / 10 == 3 || i / 100 == 3 || i / 1000 == 3) {
				System.out.println(i);
			}
		}
	}

}
