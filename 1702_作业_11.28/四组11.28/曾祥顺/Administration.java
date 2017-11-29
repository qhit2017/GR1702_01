/** 
 * @author  作者  曾祥顺\张彤彤
 * @date    创建时间：2017年11月27日 下午4:35:14 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public interface Administration {

	static int a = 10;
	
	//帮助
	 void help();
	
	//求和
	int sum(int[] a);
	
	//平均值
	int Average(int[] a);
	
	//升序排序
	int[] sort(int[] a);
	
	
	//遍历信息
	void  info(int[] a);
	
	//不及格人数
	int getNot60(int[] a);
		
}
