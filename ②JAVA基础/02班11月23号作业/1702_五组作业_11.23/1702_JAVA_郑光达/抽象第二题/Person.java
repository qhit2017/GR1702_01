/** 
 * @author  ���� E-mail:
 * @date    ����ʱ�䣺2017��11��20�� ����7:45:44 
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
