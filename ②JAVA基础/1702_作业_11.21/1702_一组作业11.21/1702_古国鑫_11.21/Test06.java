package com.qhit.guguoxin;
/** 
 * @author  作者:古国鑫&王焱
 * @date    创建时间：2017年11月21日 下午4:34:31 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public class Test06 {

	//编写JAVA程序，1至10之间的整数相加，得到累加值大于20的当前数字，将该数字输出。
	public static void main(String[] args) {
		
		int sum = 0;
		
		for (int i = 1; i <=10; i++) {
			sum = sum+i;
			
			if (sum>20) {
				
				System.out.println(i);
				
				break;
				
			}
		}
	}
}
