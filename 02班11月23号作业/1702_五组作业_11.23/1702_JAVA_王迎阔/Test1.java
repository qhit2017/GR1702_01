package com.qhit.wyk;
/** 
 * @author  作者 E-mail:1456014420@qq.com
 * @date    创建时间：2017年11月23日 上午8:18:23 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public class Test1 {
	public static void main(String[] args) {
		int a=1;
		while (a<=9) {
			int b=1;
			while (b<=a) {
				System.out.print(b+"*"+a+"="+a*b+"\t");
				b++;
				
			}
			a++;
			System.out.println();
			
			
		}
		
		
		
	}

}
