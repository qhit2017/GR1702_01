package com.zk.qhit.statictest;
 /**
 *@author  ���� E-mail:996939518@qq.com
 * @date    ����ʱ�䣺2017��11��23�� ����8:22:11 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public class Test {

	public static void main(String[] args) {
		Workder workder = new Workder();
		Sudent sudent = new Sudent();
		sudent.getContent();
		sudent.say("12");
		workder.getContent();
		workder.say("21");
	}
}
