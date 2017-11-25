/** 
 * @author  作者 E-mail:
 * @date    创建时间：2017年11月20日 下午7:45:44 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
package com.zk.qhit.statictest;

public abstract class Person {

	String Content;

	abstract String getContent();

	void say(String getContent) {
		System.out.println(getContent());
	}
}
