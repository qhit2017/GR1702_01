package Score;
/** 
 * @author  ���� E-mail:������271406@163.com
 * @date    ����ʱ�䣺2017��11��27�� ����4:26:15 
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
