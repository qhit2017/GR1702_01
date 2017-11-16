package com.zk;
/** 
 * @author  作者 E-mail:chenglong793708@547.com
 * @date    创建时间：2017年11月14日 下午5:42:04 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public class Work5 {
	public static void main(String[] args){
		System.out.println("求整数1到100的累加值，跳过个位为3的数");
		int sum = 0;
		for(int a = 1;a <= 100;a++){
			if(a % 10 != 3){
				sum += a;
			}
		}
		System.out.println("和的值为："+sum);
	}

}
