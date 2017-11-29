package yangxueting;

import java.util.Scanner;

/** 
 * @author  作者 qqE-mail:157334005@qq.com
 * @date    创建时间：2017年11月25日 上午9:43:08 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public class Test01 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("请输入第一个小数");
		double h=sc.nextDouble();
		System.out.println("请输入第二个小数");
		double j=sc.nextDouble();
		if (h==j) {
			System.out.println("两个小数相等");
		}else {
			System.out.println("两个小数不相等");
		}
		sc.close();
	}
}
