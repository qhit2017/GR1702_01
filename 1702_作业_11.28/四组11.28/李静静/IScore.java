package lijingjing;
 /**
 *@author  ���� E-mail:996939518@qq.com
 * @date    ����ʱ�䣺2017��11��27�� ����4:23:12 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public interface IScore {
	public static final int renshu =10;

	void help();
	int getAverage(int[] a);
	int getSum(int[] a);
	int getMax(int[] a);
	int getMin(int[] a);
	int getNot(int[] a);
	int[] sort(int[] a);
	void  info(int[] a);
}
