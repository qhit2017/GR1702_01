package yangxueting;
/** 
 * @author  ���� qqE-mail:157334005@qq.com
 * @date    ����ʱ�䣺2017��11��27�� ����4:26:49 
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
