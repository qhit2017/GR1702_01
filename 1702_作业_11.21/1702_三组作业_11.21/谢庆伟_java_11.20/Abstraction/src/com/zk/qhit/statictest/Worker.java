package com.zk.qhit.statictest;
/** 
 * @author  ���� E-mail:757086146@qq.com
 * @date    ����ʱ�䣺2017��11��20�� ����7:56:14 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public class Worker extends Person{
	@Override
	public String getContent() {
		
		return "��������Ҫ�����������ɹ�";
	}
	
	public static void main(String[] args) {
		Worker t=new Worker();
		t.say();
	
	}

}
