package com.zk.qhit.statictest;
/** 
 * @author  作者 E-mail:1456014420@qq.com
 * @date    创建时间：2017年11月20日 下午6:15:56 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public abstract class Person {
	
	String Content;

	abstract String getContent();

	void say(String getContent) {
		System.out.println(getContent());
	}

}
