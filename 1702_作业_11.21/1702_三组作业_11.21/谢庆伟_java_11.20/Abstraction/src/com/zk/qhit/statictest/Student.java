package com.zk.qhit.statictest;
/** 
 * @author  作者 E-mail:757086146@qq.com
 * @date    创建时间：2017年11月20日 下午7:24:11 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public class Student extends Person{
	@Override
	public String getContent() {
		
		return "学生的本质是学习如何生存与超越";
	}
	
	public static void main(String[] args) {
		Student t=new Student();
		t.say();
	
	}
	
	
	
	
	
	
	
}
