package yangxueting;

import java.util.Scanner;

/** 
 * @author  作者 qqE-mail:157334005@qq.com
 * @date    创建时间：2017年11月25日 上午9:49:13 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public class Test02 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("输入一个三位数");
		int k=sc.nextInt();
		if (k<1000&&k>100) {
			
				System.out.println("输入该数的十位数："+k/10%10);	
		}
		sc.close();
	}
}
