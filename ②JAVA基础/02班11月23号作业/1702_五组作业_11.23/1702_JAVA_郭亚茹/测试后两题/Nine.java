package Guo;

import java.util.Scanner;

/** 
 * @author  作者 E-mail:2379675496@qq.com
 * @date    创建时间：2017年11月8日 下午6:44:32 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public class Nine {
	public static void main(String[] args) {
		//通过控制台输入一个整数N(N不大于10000)，输出所有七的倍数包括7。
		Scanner sc= new Scanner(System.in);
		System.out.println("请输入一个数它是:");
		int a=sc.nextInt();
		if (a>10000) {
			System.out.println("哈！不好意思你输大了！");
		}else{
			for (int i = 7; i <=a; i++) 
				if (i%7==0 ||i/1000==7 || i/100==7 || i/10%10==7 || i%10==7) {
					System.out.println(i);
					
				}
				
			}
			
		}
	
}

