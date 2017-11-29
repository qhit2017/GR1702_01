package yangxueting;

import java.util.Scanner;

/** 
 * @author  作者 qqE-mail:157334005@qq.com
 * @date    创建时间：2017年11月25日 上午11:02:54 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public class Test04 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("请输入成绩");
		int h=sc.nextInt();
		if (h>=90) {
			System.out.println("A");
		}else if (h<89&&h>60) {
			System.out.println("B");
		}else{
			System.out.println("C");
		}
		sc.close();
	}
}
