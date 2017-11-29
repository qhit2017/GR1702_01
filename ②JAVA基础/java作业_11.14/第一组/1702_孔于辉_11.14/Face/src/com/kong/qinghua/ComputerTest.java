package com.kong.qinghua;
/** 
 * @author  作者 E-mail:1299394372@qq.com
 * @date    创建时间：2017年11月14日 下午8:38:08 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public class ComputerTest {
	public static void main(String[] args) {
		
		Computer a = new Computer("戴尔",5600,"笔记本");
		
		System.out.println(a.name);
		System.out.println(a.price);
		System.out.println(a.category);
	}

}
