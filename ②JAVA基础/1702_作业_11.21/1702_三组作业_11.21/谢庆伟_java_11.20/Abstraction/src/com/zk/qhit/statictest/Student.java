package com.zk.qhit.statictest;
/** 
 * @author  ���� E-mail:757086146@qq.com
 * @date    ����ʱ�䣺2017��11��20�� ����7:24:11 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public class Student extends Person{
	@Override
	public String getContent() {
		
		return "ѧ���ı�����ѧϰ��������볬Խ";
	}
	
	public static void main(String[] args) {
		Student t=new Student();
		t.say();
	
	}
	
	
	
	
	
	
	
}
