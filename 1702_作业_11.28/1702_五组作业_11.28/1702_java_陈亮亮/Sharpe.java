package Sqare;
/**制作者：陈亮亮
 *制作时间：2017年11月27日下午4:27:00
 *邮箱：2507147605@qq.com
 */
public interface Sharpe  {
public static final int NUMBER =10;
//数据管理
 default void help() {
	// TODO Auto-generated method stub
	
}
//求平均值
int getAverage(int[]a);
//求总分
int getsum(int[]a);
//求最小值
int getMin(int[]a);
//求最大值
int getMax(int[]a);
//求不及格人数
int getNot60(int[]a);
//升序排序

	int[] sort(int[] a);
	//遍历信息
	void  info(int[] a);
}
