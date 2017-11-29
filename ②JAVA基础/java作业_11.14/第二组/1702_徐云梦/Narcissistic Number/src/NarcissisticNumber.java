/**
 * @author 作者:
 * @date 创建时间：2017年11月8日 下午7:05:30
 * @version 1.0
 * @parameter
 * @since
 * @return
 * @function
 */
public class NarcissisticNumber {
	public static void main(String[] args) {
		// 写出100到1000中所有的水仙花数
		int hundreds = 0;
		int tens = 0;
		int units = 0;
		for (int a = 100; a <= 1000; a++) {
			// 分别写出他们的个位十位百位
			hundreds = a / 100;
			tens = a / 10 % 10;
			units = a % 10;
			if (a == hundreds * hundreds * hundreds + tens * tens * tens
					+ units * units * units) {
				System.out.println("水仙花数 " + a);
			}

		}
	}
}
