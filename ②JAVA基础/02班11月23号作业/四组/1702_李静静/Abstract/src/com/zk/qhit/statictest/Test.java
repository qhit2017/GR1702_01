package com.zk.qhit.statictest;
 /**
 *@author  作者 E-mail:996939518@qq.com
 * @date    创建时间：2017年11月23日 上午8:22:11 
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
