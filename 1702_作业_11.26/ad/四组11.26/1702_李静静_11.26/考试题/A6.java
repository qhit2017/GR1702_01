package lijingjing;
 /**
 *@author  作者 E-mail:996939518@qq.com
 * @date    创建时间：2017年11月26日 下午6:17:06 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public class A6 {

	public static void main(String[] args) {
		int count = 0;
		for (int i = 8; i <=1000; i++) {
			if (i%8==0) {
				count++;
			}
		}
		System.out.println(count);
	}
}
