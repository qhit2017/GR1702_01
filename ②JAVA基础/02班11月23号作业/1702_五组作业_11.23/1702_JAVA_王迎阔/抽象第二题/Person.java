package com.zk.qhit.statictest;
/** 
 * @author  ���� E-mail:1456014420@qq.com
 * @date    ����ʱ�䣺2017��11��20�� ����6:15:56 
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
