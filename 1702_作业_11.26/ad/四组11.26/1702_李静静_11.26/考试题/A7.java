package lijingjing;

/**
 * @author 作者 E-mail:996939518@qq.com
 * @date 创建时间：2017年11月26日 下午6:20:58
 * @version 1.0
 * @parameter
 * @since
 * @return
 * @function
 */
public class A7 {

	public static void main(String[] args) {
		int i = 0;
		while (i < 1000) {
			if (i % 5 == 0 && i % 10 != 0) {
				System.out.println(i);
			}
		         i++;
		}
		
	}
}
