package lijingjing;

import java.util.Scanner;
 /**
 *@author  作者 E-mail:996939518@qq.com
 * @date    创建时间：2017年11月26日 下午5:59:30 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public class A3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		if (N>10000) {
			System.out.println("输入的数大了");
		}else{
			if (N<10) {
				System.out.println("一位数");
			}
			if (N<100) {
				System.out.println("两位数");
			}
			if (N<1000) {
				System.out.println("三位数");
			}
			if (N<10000) {
				System.out.println("四位数");
			}else {
				System.out.println("五位数");
			}
		}
	}
}
