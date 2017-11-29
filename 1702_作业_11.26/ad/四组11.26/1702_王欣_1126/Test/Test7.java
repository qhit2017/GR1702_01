package Test;

/*制作人：王欣
 *制作时间：2017年11月26日下午6:33:21
 *邮箱：2408368509@qq.com
 */

public class Test7 {
	public static void main(String[] args) {
		// 求1000以内，即能被5整除，同时不能被10整除的所有整数，并打印出来
		int i = 1;

		while (i <= 1000) {
			if (i % 5 == 0 && i % 10 != 0) {
				System.out.println(i);
			}
			i++;
		}
	}
}
