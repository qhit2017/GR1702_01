package com.zk;
/** 
 * @author  作者 于和璧
 * @date    创建时间：2017年11月14日 

下午4:46:59 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public class HandsetTest {

	public static void main(String[] args) {
		
		Handset s =new Handset(1206,"八核","华为");
		System.out.println("此手机售价为:"+s.Price);
		System.out.println("此手机处理器为:"+s.processor);
		System.out.println("此手机品牌为:"+s.brand);
	}
}
