package Sunday;

/*制作人：王欣
 *制作时间：2017年11月19日下午4:04:42
 *邮箱：2408368509@qq.com
 */

public class si {
	public static void main(String[] args) {
		// 求1000以内所有8的倍数之和
		int sum = 0;
		for (int i = 1; i <= 1000; i++) {
			if (i % 8 == 0) {
				sum += i;
			}
		}
		System.out.println(sum);
	}

}
