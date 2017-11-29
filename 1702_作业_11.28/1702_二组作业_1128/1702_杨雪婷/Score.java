package yangxueting;
/** 
 * @author  作者 qqE-mail:157334005@qq.com
 * @date    创建时间：2017年11月27日 下午4:26:49 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public interface Score {
 
	public static final int NUMBER=10;
	void help();
	void info();
	int getAverage(int[]a);
	int getSum(int[]a);
	int getMax(int[]a);
	int getMin(int[]a);
	int getNot60(int[]a);
	
	
}
