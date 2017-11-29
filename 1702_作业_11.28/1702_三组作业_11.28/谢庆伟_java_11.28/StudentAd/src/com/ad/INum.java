package com.ad;
/** 
 * @author  作者 E-mail:757086146@qq.com
 * @date    创建时间：2017年11月27日 下午4:23:11 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public interface INum {

	
	void help();  //帮助
	int max(int[] a);  //最大值
	int min(int[] a);  //最小值
	int sum(int[] a);  //求和
	int average(int[] a);  //平均值
	String info(int[] a);  //所有元素
	void less60(int[] a);  //小于60的元素
	String sort(int[] a);  //升序排列
	
}
