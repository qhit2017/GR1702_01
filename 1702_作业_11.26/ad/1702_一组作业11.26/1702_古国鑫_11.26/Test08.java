package com.qhit.guguoxin;
/** 
 * @author  作者:古国鑫&王焱
 * @date    创建时间：2017年11月26日 下午8:37:05 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public class Test08 {

	public static void main(String[] args) {
		
		int count = 0;
		
		for (int a = 1; a < 10000; a++) {
			if (a % 10 == 6 && a % 3 == 0) {
				count++;

			}

		}
		System.out.println("10000以内个位数为6且完能被3整除的数有:" + count + "个");
	}
}
