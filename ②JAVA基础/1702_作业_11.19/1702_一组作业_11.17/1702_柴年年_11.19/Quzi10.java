
package com.qhit.Work;

import javax.swing.plaf.synth.SynthSeparatorUI;

/** 
 * @author  ���� E-mail:1603559382@qq.com
 * @date    ����ʱ�䣺2017��11��18�� ����3:08:54 
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
