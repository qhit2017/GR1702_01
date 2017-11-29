package com.zk.qhit.statictest;
 /**
 *@author  作者 E-mail:996939518@qq.com
 * @date    创建时间：2017年11月21日 上午10:56:04 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public  abstract class Person {
/*创建抽象类Person，并定义抽象方法
 * getContent()返回值是字符串，
 * 额外定义say方法调用getContent（）
 * 方法并输出；子类Sudent、Workder
 * 继承Person类；并实现抽象类的方法
 * getContent；实例化对象并分别调用
 * say（）方法 。 public abstract 
 * String getContent();
 */
	String Content ;
	 public abstract String getContent();
	void say (String getContent){
		System.out.println(getContent);
	}
	
	
	
	
	
	
	
}
