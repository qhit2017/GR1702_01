package subject;

/*制作人：王欣
 *日期2017年12月6日时间下午7:01:26
 *邮箱:2408368509@qq.com
 */

public class Subject2 {
	// 编写程序求 1+3+5+7+……+99 的和值。
	public static void main(String[] args) {
		System.out.println("1+3+5+7+......+99的值是：");
		int sum = 0;
		for (int i = 1; i <= 99; i = i + 2) {
			sum += i;
		}
		System.out.println(sum);
	}

}
