package Sunday;

/*制作人：王欣
 *制作时间：2017年11月19日下午4:34:50
 *邮箱：2408368509@qq.com
 */

public class qi {
	public static void main(String[] args) {
		// 从1，2，3，4，5这五个数任意取出两个数，列出他们的所有组合并且输出
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= 5; j++) {
				if (i != j) {
					System.out.println(i + "" + j);
				}
			}
		}
	}

}
