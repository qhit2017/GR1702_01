package com.qhit.wyk;
/** 
 * @author  作者 E-mail:1456014420@qq.com
 * @date    创建时间：2017年11月23日 上午9:16:28 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public class OddNumber {
	public static void main(String[] args) {
		
		//用for 和 while两种方法计算1~100之间奇数的和
		/*int sum=0,i=1;
		  while(i<101)
		  {sum=sum+i;i+=3;}
		  System.out.println("1到100之间的奇数和是"+sum);
		  */
		int sum=0;
		  for(int i=1;i<101;i+=2)
		  sum=sum+i;
		  System.out.println("1到100之间的奇数和是"+sum);
	}

}
