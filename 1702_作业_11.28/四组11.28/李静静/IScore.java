package lijingjing;
 /**
 *@author  作者 E-mail:996939518@qq.com
 * @date    创建时间：2017年11月27日 下午4:23:12 
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
