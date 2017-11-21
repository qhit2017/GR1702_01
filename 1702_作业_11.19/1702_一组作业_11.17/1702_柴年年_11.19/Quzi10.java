
package com.qhit.Work;

import javax.swing.plaf.synth.SynthSeparatorUI;

/** 
 * @author  作者 E-mail:1603559382@qq.com
 * @date    创建时间：2017年11月18日 下午3:08:54 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public class Quzi10 {

	public static void main(String[] args) {
		int a = 1;
		while(a<=9){
			int b = 1;
			while(b<=a){
				System.out.print(b+"*"+a+"="+b*a+"\t");
				b++;
			}
			a++;
			System.out.println();
		}
	}
}
