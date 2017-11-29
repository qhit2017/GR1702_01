package Sunday;

/*制作人：王欣
 *制作时间：2017年11月19日下午4:43:13
 *邮箱：2408368509@qq.com
 */

public class ba {
	public static void main(String[] args) {
		// 求个位数为6且能被3整除的3位整数共有多少
		int a = 0;
		for (int i = 100; i <= 999; i++) {
			if (i % 10 == 6 && i % 3 == 0) {
				a++;
			}
		}
		System.out.println(a);
	}

}
