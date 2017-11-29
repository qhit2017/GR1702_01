package Com.score;
/** 
 * @author  作者 E-mail:2379675496@qq.com
 * @date    创建时间：2017年11月8日 下午6:44:32 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public interface Score {
	public static final int NUMER=10;
	//告知用户怎么使用这个系统。
	
	void help();
	
	//遍历信息。
	
	void info(int[] a);
	
	//求平均值。
	
	int getaverage(int [] a);
	
	//求总分。
	
	int getsum(int [] a);
	
	//求最大值。
	
	int getmax(int [] a);
	
	//求最小值。
	
	int getmin(int [] a);
	
	//求不及格人数。
	
	int getnot60(int [] a);
	
	//升序排序
	
	int[] sort(int[] a);
}
