package lijingjing;

import java.util.Scanner;
 /**
 *@author  作者 E-mail:996939518@qq.com
 * @date    创建时间：2017年11月26日 下午6:06:47 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public class A4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int score =sc.nextInt();
		if (score>=90) {
			System.out.println("A");
		}
		if (score>=60&&score<=89) {
			System.out.println("B");
		}
		if (score<60) {
			System.out.println("C");
		}
	}
}
