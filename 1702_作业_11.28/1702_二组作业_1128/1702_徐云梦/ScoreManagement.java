/**
 * 
 */

/**
 * @author 作者 :xuyunmeng
 * @date 创建时间：2017年11月27日 下午4:23:46
 * @version 1.0
 * @parameter
 * @since
 * @return
 * @function
 */
public interface ScoreManagement {
	// 管理十个人的成绩
	int NUMBER = 10;

	// 帮助
	void help();

	// 遍历信息
	void info(int[] a);

	// 求平均值
	int getAverage(int[] a);

	// 求总分
	int getSum(int[] a);

	// 求最大值
	int getMax(int[] a);

	// 求最小值
	int getMin(int[] a);

	// 求不及格人数
	int getNot(int[] a);

	// 升序排序
	int[] sort(int[] a);

}
