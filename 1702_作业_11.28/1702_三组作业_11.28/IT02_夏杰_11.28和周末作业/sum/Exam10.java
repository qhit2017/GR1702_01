package com.sum;
/**
 * @author  作者  E——mai l:程洁/夏杰 2564963490@QQ.com/378901749
 * @date    创建时间: 2017年11月23日 下午7:29:10
 * @version 1.0
 * @parameter
 * @since
 * @return
 * @functin
 */
public class Exam10 {
	
	public static void main(String[] args) {
		
		int a=1;
		while(a<=9){
			int b=1;
			while(b<=a){
				System.out.print(b+"*"+a+"="+b*a+"\t");
				b++;
			}
			a++;
			System.out.println();
		}
	}

}
