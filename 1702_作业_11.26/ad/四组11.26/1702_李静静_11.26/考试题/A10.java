package lijingjing;
 /**
 *@author  作者 E-mail:996939518@qq.com
 * @date    创建时间：2017年11月26日 下午6:44:04 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public class A10 {

	public static void main(String[] args) {
		for (int i =1900; i <=2017; i++) {
		    if (i%4==0&&i%100!=0||i%400==0) {
				System.out.println(i);
			}
		}
	}
}
