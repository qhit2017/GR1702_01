package Sunday;

/*制作人：王欣
 *制作时间：2017年11月19日下午5:07:23
 *邮箱：2408368509@qq.com
 */

public class shi {
	public static void main(String[] args) {
		// 输入乘法口诀（使用while循环实现）
		for (int i = 1; i <= 9; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j * i + "=" + i + "*" + j + "\t");
			}
			System.out.println();
		}
	}

}
