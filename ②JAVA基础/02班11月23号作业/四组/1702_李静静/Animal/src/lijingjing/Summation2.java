package lijingjing;
 /**
 *@author  作者 E-mail:996939518@qq.com
 * @date    创建时间：2017年11月23日 上午9:21:06 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public class Summation2 {

	public static void main(String[] args) {
		int i = 1;
		int sum = 0;
		while (i<=100) {
			sum=sum+i;
			i=i+2;
		}System.out.println(sum);
	}
}
