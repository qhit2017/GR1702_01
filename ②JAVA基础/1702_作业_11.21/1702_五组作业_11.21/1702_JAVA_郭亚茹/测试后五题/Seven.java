package Guo;
/** 
 * @author  作者 E-mail:2379675496@qq.com
 * @date    创建时间：2017年11月8日 下午6:44:32 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public class Seven {
	public static void main(String[] args) {
		//从1 2 3 4 5 这五个数任取两个数，列出它们的所有组合，并输出到屏幕上。
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <=5; j++) {
				if (i!=j) {
					System.out.println(i+" "+j);
					
				}
				
			}
		}
	}

}
