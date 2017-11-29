package Score;
/** 
 * @author  作者 E-mail:李永立271406@163.com
 * @date    创建时间：2017年11月27日 下午4:26:15 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */

public interface Score {
	
	int NUMBER = 10;
	
	void help();
	void info(int[] a);
	
	int getAverage(int[] a);
	
	int getSum(int[] a);
	
	int getMax(int[] a);
	
	int getMin(int[] a);
	
	int getNot(int[] a);
	
	int[] sort(int[] a);
	
	
	

}
