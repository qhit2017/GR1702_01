package Sunday;

/*制作人：王欣
 *制作时间：2017年11月19日下午4:14:31
 *邮箱：2408368509@qq.com
 */

public class wu {
	public static void main(String[] args) {
		// 求1000以内既能被5整除又能被3整除的所有整数
		// 并打印出来使用do while 循环
		int i = 1;
		do {

			if (i % 5 == 0 && i % 3 == 0) {
				System.out.println(i);
			}
			i++;
		} while (i <= 1000);

	}

}
