
package com.qhit.Work;
/** 
 * @author  ���� E-mail:1603559382@qq.com
 * @date    ����ʱ�䣺2017��11��18�� ����1:17:53 
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
				System.out.println("1000�ڵ�����:"+a);
				}
		}
	}
}
