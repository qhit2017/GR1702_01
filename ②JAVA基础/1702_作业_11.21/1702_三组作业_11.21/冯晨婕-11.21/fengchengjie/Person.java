/**
 * 
 */
package fengchengjie;

 

/**
 * @author ���ߣ��볿�  E-mail:2570804732@qq.com
 * @date ����ʱ�䣺21 Nov 2017 11:07:32 Ekuseni
 * @version 1.0
 * @parameter
 * @since
 * @return
 * @function
 */
/**
 * @author Administrator
 *
 */
public abstract class Person {
	/*
	 * ����������Person����������󷽷�getContent()����ֵ���ַ����� ���ⶨ��say��������getContent���������������
	 * ����Sudent��Workder�̳�Person�ࣻ��ʵ�ֳ�����ķ���getContent�� ʵ�������󲢷ֱ����say�������� �� public
	 * abstract String getContent();
	 */
	int age;
	String name;
	 
	public Person(int age, String name) {
		super();
		this.age = age;
		this.name = name;
	}
		void say(){
			System.out.println(getContent());
		}
		abstract String getContent();
		
	}
			
	 

	 
	
	
	
	
	
	
	
	
	 
