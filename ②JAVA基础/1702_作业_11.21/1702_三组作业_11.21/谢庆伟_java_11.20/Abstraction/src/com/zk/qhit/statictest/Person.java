package com.zk.qhit.statictest;
/** 
 * @author  作者 E-mail:757086146@qq.com
 * @date    创建时间：2017年11月20日 下午7:17:37 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public abstract class Person {
	public abstract String getContent();
	void say(){
		System.out.println(getContent());
	}
	

}
