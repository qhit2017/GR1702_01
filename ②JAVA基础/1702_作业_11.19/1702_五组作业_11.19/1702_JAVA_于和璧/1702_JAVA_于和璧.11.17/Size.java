package YuHeBi;

import java.util.Scanner;

/** 
 * @author  作者 于和璧
 * @date    创建时间：2017年11月14日 下午7:03:32 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public class Size {
	//从控制台输入两个小数判断，判断大小并输出
public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("请输入第一个数字a：");
		
		double a =sc.nextDouble();
		
		System.out.println("请输入第二个数字b：");
		
		double b =sc.nextDouble();
		
		if (a>b){
			
			System.out.println("a大于b，a的值为："+a);
		}
		if (a==b){
			
			System.out.println("a等于b，值都为："+a);
		}
		if (a<b){
			
			System.out.println("a小于b，b的值为："+b);
		}
		sc.close();
	}
}
