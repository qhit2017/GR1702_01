package Sunday;

/*制作人：王欣
 *制作时间：2017年11月19日下午4:25:35
 *邮箱：2408368509@qq.com
 */

public class liu {
	public static void main(String[] args) {
		// 1~10之间的整数相加，得到累加值大于20的当前数字，将该数字输出
		int sum = 0;
		for (int i = 1; i <= 10; i++) {
			sum += i;
			if (sum > 20) {
				System.out.println(i);
				break;
			}
		}
	}

}
