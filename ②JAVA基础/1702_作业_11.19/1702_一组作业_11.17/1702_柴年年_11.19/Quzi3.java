
package com.qhit.Work;
/** 
 * @author  作者 E-mail:1603559382@qq.com
 * @date    创建时间：2017年11月18日 下午1:17:53 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public class Quzi3 {

	public static void main(String[] args) {
		boolean x;
		for(int a = 1;a <= 1000;a++){
			x = true;
			if(a%2==0){
				x = false;
				continue;
			}
			if (x){
				System.out.println("1000内的奇数:"+a);
				}
		}
	}
}
