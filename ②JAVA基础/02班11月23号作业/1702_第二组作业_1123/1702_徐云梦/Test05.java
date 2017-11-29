/**
 * 
 */

/**
 * @author 作者 :xuyunmeng
 * @date 创建时间：2017年11月23日 上午8:53:33
 * @version 1.0
 * @parameter
 * @since
 * @return
 * @function
 */
public class Test05 {
	public static void main(String[] args) {
		// while两种方法计算1~100之间奇数的和

		int a = 0;
		int sum = 0;
		while (a <= 100) {
			if (a % 2 != 0) {

				sum = sum + a;
			}
			a++;
		}
		System.out.println(sum);

		// for两种方法计算1~100之间奇数的和

		int sam = 0;
		for (int i = 0; i <= 100; i++) {
			if (i % 2 != 0) {
				sam = sam + i;
			}
		}
		System.out.println(sam);
	}

}
