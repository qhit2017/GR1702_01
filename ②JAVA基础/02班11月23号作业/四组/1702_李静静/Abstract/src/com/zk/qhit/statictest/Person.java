package com.zk.qhit.statictest;
 /**
 *@author  ���� E-mail:996939518@qq.com
 * @date    ����ʱ�䣺2017��11��21�� ����10:56:04 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public  abstract class Person {
/*����������Person����������󷽷�
 * getContent()����ֵ���ַ�����
 * ���ⶨ��say��������getContent����
 * ���������������Sudent��Workder
 * �̳�Person�ࣻ��ʵ�ֳ�����ķ���
 * getContent��ʵ�������󲢷ֱ����
 * say�������� �� public abstract 
 * String getContent();
 */
	String Content ;
	 public abstract String getContent();
	void say (String getContent){
		System.out.println(getContent);
	}
	
	
	
	
	
	
	
}
