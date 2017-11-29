/** 
 * @author  作者 E-mail:
 * @date    创建时间：2017年11月23日 下午7:16:50 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
package com.zk.qhit.statictest;

public class Test {

	public static void main(String[] args) {
		Workder workder = new Workder();
		Sudent sudent = new Sudent();
		sudent.getContent();
		workder.getContent();
		String getContent = null;
		sudent.say(getContent);
		

	}

}
